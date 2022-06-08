"""
This module contains classes used to extract and visualize business  rules
using the CFG and the business variables.

This module contains following classes:
* RuleFragment: represents a rule
* Link: represents link between the rules
* BusinessRulesExtractor: contains methods to extract the business rules
"""

import graphviz as gv
import  json

class RuleFragment:
    """
    A class used to represent a block of a business rule

    """

    def __init__(self, id):
        self.id = id
        self.block = None
        self.exits = []
        self.predecessors = []

class Link:
    """
    Link between blocks in a business rules.

    Represents a control flow jump between two rule fragmeents. Contains an exitcase in
    the form of an expression, representing the case in which the associated
    control jump is made.

    """


    def __init__(self, source, target, exitcase=None):
        # Block from which the control flow jump was made.
        self.source = source
        # Target block of the control flow jump.
        self.target = target
        # 'Case' leading to a control flow jump through this link.
        self.exitcase = exitcase # string

    def __str__(self):
        return "link from {} to {}".format(str(self.source), str(self.target))

    def __repr__(self):
        if self.exitcase is not None:
            return "{}, with exitcase {}".format(str(self),
                                                 (self.exitcase))
        return str(self)

    def get_exitcase(self):
        """
        Get a string containing the Python source code corresponding to the
        exitcase of the Link.

        Returns:
            A string containing the source code.
        """
        if self.exitcase:
            return self.exitcase
        return ""


class BusinessRulesExtractor:
    """
    A class used to extract business rules

    ...

    Attributes
    ----------
    cfg : CFG
        Control Flow Graph constructed
    business_variables : arr
        Business Variables identified
    business_rules : dict
        Extracted Business Rules
    rules_dict : dict
        Dictionary to store rule fragments

    """

    def __init__(self, cfg, business_variables):
        self.cfg = cfg
        self.business_variables = business_variables
        self.business_rules = {} # 'variable_name': entry_block
        self.current_rules_id = 0
        self.rules_dict = {}
        self.exit_id = 1

    def new_exit_id(self):
        """
        Increments the exit_id
        """
        exit_id = self.exit_id
        self.exit_id+=1
        return exit_id

    def new_rule(self):
        """
        Creates a new rule fragment
        """
        self.current_rules_id+=1
        return RuleFragment(self.current_rules_id)

    def add_exit(self, fragment, nextfragment, exitcase="Sequential Next"):
        """
        Adds exit between two rule fragments
        """

        newlink = Link(fragment, nextfragment, exitcase)
        fragment.exits.append(newlink)
        nextfragment.predecessors.append(newlink)

    def sort_exits(self, exits):
        """
        Sorts given exitcases based on an exit preference
        """
        exit_preference = ['perform', 'evaluate when', 'search when',
         'iteration', 'procedure call',
         'true','false',"onexception", "notonexception",
         "onsizeerror", "notonsizeerror", "onoverflow",
         "invalidkey", "notinvalidkey", "atend", "notatend",
         "procedure backward call",
          'backward', 'evaluate exit','search exit',
           'perform-exit','next sentence', 'sequential next']

        sorted_exits = exits.copy()

        sorted_exits.sort(key= lambda exit: exit_preference.index(exit.exitcase.lower()))

        return sorted_exits

    def clean_brs(self, rule, visited=[]):
        """
        Cleans the extracted business rule

        Args:

            rule: The root of the Business Rule
            visited: Visited Rule Fragments

        """

        # Don't visit rules twice.
        if rule in visited:
            return
        visited.append(rule)

        # Empty rules are removed from the CFG.
        if rule.block is None:
            for pred in rule.predecessors:
                for exit in rule.exits:
                    self.add_exit(pred.source, exit.target, pred.exitcase)
                    # Check if the exit hasn't yet been removed from
                    # the predecessors of the target rule.
                    if exit in exit.target.predecessors:
                        exit.target.predecessors.remove(exit)
                # Check if the predecessor hasn't yet been removed from
                # the exits of the source rule.
                if pred in pred.source.exits:
                    pred.source.exits.remove(pred)

            rule.predecessors = []
            # as the exits may be modified during the recursive call,
            #  it is unsafe to iterate on rule.exits
            # Created a copy of rule.exits before calling clean cfg ,
            #  and iterate over it instead.
            for exit in rule.exits[:]:
                self.clean_brs(exit.target, visited)
            rule.exits = []
        else:
            for exit in rule.exits[:]:
                self.clean_brs(exit.target, visited)



    def extract_all_business_rules(self):
        """
        A method to extract all business rules
        using the given CFG and the business variables
        """
        for business_variable in self.business_variables:
            self.extract_business_rules(business_variable)


    def extract_business_rules_dfs(self, current_fragment, block,
     statement_blocks, visited = [], var=""):
        """
        A method to extract all business rules
        using DFS
        """

        # Don't visit blocks twice.
        if block.id in visited:

            if block in statement_blocks:
                predecessor_fragment  \
                    = current_fragment.predecessors[0].source
                exit_case = current_fragment.predecessors[0].exitcase
                block_fragment = self.rules_dict[block]
                self.add_exit(predecessor_fragment, block_fragment,
                 exit_case)
                current_fragment = self.new_rule()
            return


        visited.append(block.id)

        if block in statement_blocks:

            self.rules_dict[block] = current_fragment
            current_fragment.block = block

        # Recursively visit all the blocks of the CFG.

        sorted_exits = self.sort_exits(block.exits)


        for exit in sorted_exits:
            edge_label = exit.get_exitcase().strip()
            if edge_label == 'backward' \
                or edge_label == 'procedure backward call':
                continue
            if current_fragment.block != None:

                next_fragment = self.new_rule()
                self.add_exit(current_fragment, next_fragment, edge_label)
                self.extract_business_rules_dfs(next_fragment, exit.target,
                 statement_blocks, visited, var)
            else:
                self.extract_business_rules_dfs(current_fragment, exit.target,
                 statement_blocks, visited, var)



    def extract_business_rules(self, business_variable):
        """
        A method to extract business rule
        of the given business variables

        Args:
            business_variable: The input business variable
        """

        statement_blocks = set()
        for block in business_variable.statement_blocks:
            statement_blocks.add(block)
            for conditional_block in block.statements[0].conditional_blocks:
                statement_blocks.add(conditional_block)
            for parent_context_block in block.statements[0].parent_context_blocks:
                statement_blocks.add(parent_context_block)


        current_fragment = self.new_rule()
        self.business_rules[business_variable.name] = current_fragment
        self.rules_dict = {}
        self.extract_business_rules_dfs(current_fragment, self.cfg.entryblock,
         statement_blocks ,[], business_variable.name)
        self.clean_brs(current_fragment, [])



    def _visit_rules(self, graph, rule, visited=[]):
        # Don't visit blocks twice.
        if rule.id in visited:
            return

        node_text = rule.block.get_source()

        graph.node(str(rule.id), label=node_text)
        visited.append(rule.id)

        # Recursively visit all the blocks of the CFG.
        for exit in rule.exits:
            self._visit_rules(graph, exit.target, visited)
            edgelabel = exit.get_exitcase().strip()
            graph.edge(str(rule.id), str(exit.target.id), label=edgelabel)

    def _build_visual(self, format='pdf'):
        graph = gv.Digraph(name='cluster', format=format,
                           graph_attr={'label': 'test'})
        for variable, entry_rule in self.business_rules.items():
            graph.attr('node', shape='box', style='filled', color='lightblue')
            self._visit_rules(graph, entry_rule, visited=[])
            graph.attr('node', shape='diamond', style='filled', color='lightgrey')
            graph.node(variable, label=variable)
            graph.edge(variable, str(entry_rule.id), label=
            'start')

        return graph

    def build_business_rule_visual(self, filepath, format, show=False):

        graph = self._build_visual(format)
        graph.render(filepath, view=show)

    def _visit_rules_json(self, business_rules_dict, rule, visited=[]):
        # Don't visit blocks twice.
        if rule.id in visited:
            return

        business_rules_dict['nodes'].append(
            {'id':str(rule.block.id),
            'data': { 'label': rule.block.get_source()},
            })

        visited.append(rule.id)

        # Recursively visit all the blocks of the CFG.
        # { id: 'e12', source: '1', target: '2', type: edgeType
        # , animated: true },
        for exit in rule.exits:
            edgelabel = exit.get_exitcase().strip()
            exit_dict = {
                'id': str(self.new_exit_id()),
                'source': str(rule.block.id),
                'target':str(exit.target.block.id),
                'label':edgelabel
            }

            business_rules_dict['edges'].append(exit_dict)
            self._visit_rules_json(business_rules_dict, exit.target, visited)





    def build_business_rules_json(self):
        output = {
            'business_rules':{},
            'business_variables':[]
        }


        for variable, entry_rule in self.business_rules.items():
            output['business_variables'].append(variable)
            business_rules_dict = {
                'nodes':[],
                'edges':[]
            }
            business_rules_dict['nodes'].append(
            {'id':variable,
            'data': { 'label': variable},
            })
            exit_dict = {
                'id': str(self.new_exit_id()),
                'source': variable,
                'target':str(entry_rule.block.id),
                'label':'start'
            }

            business_rules_dict['edges'].append(exit_dict)
            self._visit_rules_json(business_rules_dict,entry_rule,[])
            output['business_rules'][variable]= business_rules_dict


        # with open(filepath, "w") as outfile:
        #     json.dump(output, outfile)

        return output
