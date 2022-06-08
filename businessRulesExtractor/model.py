"""
This module contains a classes for building Control
Flow Graph(CFG)


This module contains:
* Block: represents a basic block in a control flow graph
* Link: represents a link between blocks in a control flow graph
* CFG: represents Control flow graph (CFG)
"""

import graphviz as gv



class Block:
    """
    Basic block in a control flow graph.

    Contains a list of statements executed in a program without any control
    jumps. A block of statements is exited through one of its exits. Exits are
    a list of Links that represent control flow jumps.
    """

    __slots__ = ["id", "statements", "func_calls", "predecessors", "exits"]

    def __init__(self, id):
        # Id of the block.
        self.id = id
        # Statements in the block.
        self.statements = []
        # Links to predecessors in a control flow graph.
        self.predecessors = []
        # Links to the next blocks in a control flow graph.
        self.exits = []

    def __str__(self):
        if len(self.statements)!=0:
            return "block:{} statement:{}".format(self.id, self.statements[0].text)
        return "empty block:{}".format(self.id)

    def __repr__(self):
        txt = "{} with {} exits".format(str(self), len(self.exits))
        if self.statements:
            txt += ", body=["
            txt += ", ".join([node.text for node in self.statements])
            txt += "]"
        return txt

    def at(self):
        """
        Get the line number of the first statement of the block in the program.
        """
        if self.statements and self.statements[0].lineno >= 0:
            return self.statements[0].lineno
        return None

    def is_empty(self):
        """
        Check if the block is empty.

        Returns:
            A boolean indicating if the block is empty (True) or not (False).
        """
        return len(self.statements) == 0

    def get_source(self):
        """
        Get a string containing the Python source code corresponding to the
        statements in the block.

        Returns:
            A string containing the source code of the statements.
        """
        src = ""
        for statement in self.statements:

            src += (statement.text + "\n")

        return src



class Link():
    """
    Link between blocks in a control flow graph.

    Represents a control flow jump between two blocks. Contains an exitcase in
    the form of an expression, representing the case in which the associated
    control jump is made.
    """

    __slots__ = ["source", "target", "exitcase"]

    def __init__(self, source, target, exitcase=None):
        assert type(source) == Block, "Source of a link must be a block"
        assert type(target) == Block, "Target of a link must be a block"
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


class CFG():
    """
    Control flow graph (CFG).

    A control flow graph is composed of basic blocks and links between them
    representing control flow jumps. It has a unique entry block and several
    possible 'final' blocks (blocks with no exits representing the end of the
    CFG).
    """

    def __init__(self):

        # Entry block of the CFG.
        self.entryblock = None
        self.exit_id = 1

    def new_exit_id(self):
        exit_id = self.exit_id
        self.exit_id+=1
        return exit_id

    def __str__(self):
        return "CFG for {}".format(self.name)

    def _visit_blocks(self, graph, block, visited=[]):
        # Don't visit blocks twice.
        if block.id in visited:
            return

        node_text = block.get_source()

        graph.node(str(block.id), label=node_text)
        visited.append(block.id)


        # Recursively visit all the blocks of the CFG.
        for exit in block.exits:

            self._visit_blocks(graph, exit.target, visited)
            edgelabel = exit.get_exitcase().strip()
            graph.edge(str(block.id), str(exit.target.id), label=edgelabel)

    def _build_visual(self, format='pdf', calls=False):
        graph = gv.Digraph(name='cluster', format=format,
                           graph_attr={'label': 'test'})
        self._visit_blocks(graph, self.entryblock, visited=[])

        return graph

    def build_visual(self, filepath, format, calls=False, show=False):
        """
        Build a visualisation of the CFG with graphviz and output it in a DOT
        file.

        Args:
            filename: The name of the output file in which the visualisation
                      must be saved.
            format: The format to use for the output file (PDF, ...).
            show: A boolean indicating whether to automatically open the output
                  file after building the visualisation.
        """
        graph = self._build_visual(format, calls)
        graph.render(filepath, view=show)

    def _visit_nodes_json(self, output, node, visited=[]):
        # Don't visit blocks twice.
        if node.id in visited:
            return

        output['nodes'].append(
            {'id':str(node.id),
            'data': { 'label': node.get_source()},
            })

        visited.append(node.id)

        # Recursively visit all the blocks of the CFG.
        # { id: 'e12', source: '1', target: '2', type: edgeType, animated: true },
        for exit in node.exits:
            edgelabel = exit.get_exitcase().strip()
            exit_dict = {
                'id': str(self.new_exit_id()),
                'source': str(node.id),
                'target':str(exit.target.id),
                'label':edgelabel
            }

            output['edges'].append(exit_dict)
            self._visit_nodes_json(output, exit.target, visited)





    def build_cfg_json(self):
        output = {
            'nodes':[],
            'edges':[]
        }



        output['nodes'].append(
        {'id':'start',
        'data': { 'label': 'start'},
        })
        exit_dict = {
            'id': str(self.new_exit_id()),
            'source': 'start',
            'target':str(self.entryblock.id),
            'label':'start'
        }

        output['edges'].append(exit_dict)
        self._visit_nodes_json(output,self.entryblock,[])

        return output
