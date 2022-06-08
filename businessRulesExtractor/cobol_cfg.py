"""
    This module contains classes used for building the Control Flow
    Graph (CFG) of the COBOL code.

    This module contains two classes:
    * Statement: represents a COBOL statement
    * CFGBuilder: Contains attributes and methods to build CFG of the COBOL program
"""
from .model import Block, Link, CFG
from .data_division import Variable
from .antlr_py.Cobol85Parser import Cobol85Parser
from .antlr_py.Cobol85Visitor import Cobol85Visitor
from .utils import extract_given_context, extract_identifiers, get_tokens



# statements
# | 🟢 ✅ acceptStatement | 🟢 ✅ addStatement | 🔴 (n)alterStatement |
# | 🟢 ✅ callStatement | 🟢 ✅ cancelStatement
# | 🟢 ✅ closeStatement | 🟢 ✅ computeStatement | 🟢 ✅ continueStatement |
# | 🟢 ✅ deleteStatement  | 🟢 ✅ disableStatement
# | 🟢 ✅ displayStatement | 🟢 ✅ divideStatement | 🟢 ✅enableStatement |
# | 🟢 ✅ entryStatement | 🟢 ✅evaluateStatement
# | 🟢 ✅ exhibitStatement | 🟢 ✅execCicsStatement | 🟢 ✅(s)execSqlStatement |
# | 🟢 ✅execSqlImsStatement | 🟢 ✅ exitStatement
# | 🟢 ✅ generateStatement | 🟢 ✅ gobackStatement | 🟢 ✅ goToStatement |
# | 🟢 ✅ ifStatement | 🟢 ✅ initializeStatement
# | 🟢 ✅ initiateStatement | 🟢 ✅ inspectStatement | 🟢 ✅ mergeStatement |
# | 🟢 ✅ moveStatement | 🟢 ✅ multiplyStatement
# | 🟢 ✅ openStatement | 🟢 ✅ performStatement | 🟢 ✅ purgeStatement |
# | 🟢 ✅ readStatement | 🟢 ✅receiveStatement | 🟢 ✅ releaseStatement
# | 🟢 ✅ returnStatement | 🟢 ✅ rewriteStatement | 🟢 ✅searchStatement |
# | 🟢 ✅ sendStatement | 🟢 ✅setStatement | 🟢 ✅ sortStatement | 🟢 ✅startStatement
# | 🟢 ✅ stopStatement | 🟢 ✅stringStatement | 🟢 ✅ subtractStatement |
# | 🟢 ✅terminateStatement |  🟢 ✅ unstringStatement | 🟢 ✅writeStatement

class Statement:
    """
    A class used to represent a COBOL statement

    ...

    Attributes
    ----------
    text : str
        the COBOL statement text

    condition_variables : dict
        the conditional variables present in the COBOL statement

    source_variables : dict
        the source variables present in the COBOL statement

    target_variables : dict
        the target variables present in the COBOL statement

    conditional_blocks : arr
        the parent CFG conditional blocks for the statement

    parent_context_blocks : arr
        the parent CFG context blocks for the statement

    tag : str
        the name of the statement

    line_number : int
        the line number of the statement

    procedure_info : dict
        the procedures(paragraphs/sections) statement references


    """
    def __init__(self, text, tag):
        self.text = text
        self.condition_variables = {}
        self.source_variables = {}
        self.target_variables = {}
        self.conditional_blocks = []
        self.parent_context_blocks = []
        self.tag = tag
        self.line_number = None
        self.procedure_info = {}


class CFGBuilder(Cobol85Visitor):
    """
    Control flow graph builder.

    A control flow graph builder is an AST NodeVisitor that can walk through
    a program's AST and iteratively build the corresponding CFG.

    ...

     Attributes
    ----------

    cfg: CFG
        CFG of the program

    current_id: int
        id of the current block

    curr_loop_guard_stack : arr
        stack to store parent loops

    conditional_scope_stack : arr
        stack to store parent conditional statements

    evaluate_stack : arr
        stack to store parent evaluate statements

    evaluate_when_stack : arr
        stack to store parent evaluate when phrases

    search_stack : arr
        stack to store parent search statements

    search_when_stack : arr
        stack to store parent stack when phrases

    error_management_stack : arr
        stack to store parent exception phrases

    next_sentence_stack : arr
        stack to store next statements

    current_block : Block
        current CFG block

    current_section : Procedure
        the current section being processed

    current_paragraph : Procedure
        the current paragraph being processed

    statements_dict : dict
        a dictionary to keep track of all statements processed
        key is the address of the AST node of the statement
        value will be the CFG block of the statement

    stop_run_found : boolean
        indicates whether stop run statement is processed or not

    link_paragraphs : arr
        stores information on paragraph labels to be linked

    link_sections : arr
        stores information on section labels to be linked

    """


    def __init__(self):
        super().__init__()

        self.cfg = None
        self.current_id = None

        self.curr_loop_guard_stack = []
        self.conditional_scope_stack = []
        self.evaluate_stack = []
        self.evaluate_when_stack = []
        self.search_stack = []
        self.search_when_stack = []
        self.error_management_stack = []

        self.next_sentence_stack = []

        self.current_block = None
        self.current_section = None
        self.current_paragraph = None
        self.statements_dict = {}
        self.stop_run_found = False
        self.link_paragraphs = []
        self.link_sections = [] # do later



    # ---------- CFG building methods ---------- #
    def build(self, tree, entry_id=0):
        """
        Build a CFG from an AST.

        Args:

            tree: The root of the AST from which the CFG must be built.
            entry_id: Value for the id of the entry block of the CFG.

        Returns:
            The CFG produced from the AST.
        """
        self.cfg = CFG()

        # Tracking of the current block while building the CFG.
        self.current_id = entry_id
        self.current_block = self.new_block()
        self.cfg.entryblock = self.current_block
        # Actual building of the CFG is done here.


        self.visit(tree)


        self.add_procedure_links()
        self.link_perform_paragraphs()
        self.clean_cfg(self.cfg.entryblock, [])

        return self.cfg

    def add_procedure_links(self):
        """
        links CFG blocks to and from
        first and last statement of the corresponding procedure(paragraph/section)
        respectively
        """
        for procedure in self.procedures.items():
            for block in procedure.link_first_statement:

                self.add_exit(block, procedure.statement_blocks[0], "procedure call")
            for block in procedure.link_last_statement:
                self.add_exit(procedure.statement_blocks[-1], block, "procedure backward call")

    def link_perform_paragraphs(self):
        """
        links paragraphs between perform_from paragraph
        and perform_thru paragraph

        """
        for perform_links in self.link_paragraphs:
            paragraph_from = perform_links['from']
            paragraph_thru = perform_links['thru']

            prev_para = None
            for paragraph in self.paragraph_list:

                if prev_para is None and paragraph == paragraph_from:
                    prev_para = paragraph_from
                elif prev_para is not None:
                    # two paragraphs are linked by linking the last statement of
                    # first paragraph to first statement of the second paragraph
                    self.add_exit(prev_para.statement_blocks[-1], paragraph.statement_blocks[0])
                    if paragraph == paragraph_thru:
                        break

                    prev_para = paragraph





    def clean_cfg(self, block, visited):
        """
        Remove the useless (empty) blocks from a CFG.

        Args:
            block: The block from which to start traversing the CFG to clean
                   it.
            visited: A list of blocks that already have been visited by
                     clean_cfg (recursive function).
        """
        # Don't visit blocks twice.
        if block in visited:
            return
        visited.append(block)

        # Empty blocks are removed from the CFG.
        if block.is_empty():
            for pred in block.predecessors:
                for exit_case in block.exits:
                    self.add_exit(pred.source, exit_case.target, pred.exitcase)
                    # Check if the exit_case hasn't yet been removed from
                    # the predecessors of the target block.
                    if exit_case in exit_case.target.predecessors:
                        exit_case.target.predecessors.remove(exit_case)
                # Check if the predecessor hasn't yet been removed from
                # the exits of the source block.
                if pred in pred.source.exits:
                    pred.source.exits.remove(pred)

            block.predecessors = []
            # as the exits may be modified during the recursive call,
            #  it is unsafe to iterate on block.exits
            # Created a copy of block.exits before calling clean cfg , and iterate over it instead.
            for exit_case in block.exits[:]:
                self.clean_cfg(exit_case.target, visited)
            block.exits = []
        else:
            for exit_case in block.exits[:]:
                self.clean_cfg(exit_case.target, visited)

    def append_to_procedure(self, block):
        """
        Add block to active section and paragraph

        Args:
            block: CFG block
        """
        if self.current_section is not None:
            self.current_section.statement_blocks.append(block)
        if self.current_paragraph is not None:
            self.current_paragraph.statement_blocks.append(block)

    def get_procedure(self, procedure_name):
        """
        Returns procedure object of the input procedure

        Args:
            procedure_name: name of a procedure
        """
        return self.procedures[procedure_name]


    def add_error_management_flow(self, ctx, parent_block, after_parent_block, error_clause_ctxs,
     error_clause_labels):
        """
        Adds control flow to error management blocks

        Args:
            ctx : AST node of current statement
            parent_block : CFG block of the current statement
            after_parent_block : CFG block after the current statement
            error_clause_ctxs : AST node types of exception/error_management phrases
            error_clause_labels : edge labels for exception/error_management exits
        """
        for child in ctx.getChildren():
            if type(child) in error_clause_ctxs:
                error_clause_index = error_clause_ctxs.index(type(child))
                error_block = self.new_block()
                self.add_exit(parent_block, error_block, error_clause_labels[error_clause_index])
                self.current_block = error_block
                self.error_management_stack.append(parent_block)
                self.visitChildren(child)
                self.error_management_stack.pop()
                self.add_exit(self.current_block, after_parent_block)


    # ---------- Graph management methods ---------- #

    def new_block(self):
        """
        Create a new block with a new id.

        Returns:
            A Block object with a new unique id.
        """
        self.current_id += 1
        return Block(self.current_id)

    def add_statement(self, block, statement):
        """
        Add a statement to a block.

        Args:
            block: A Block object to which a statement must be added.
            statement: An AST node representing the statement that must be
                       added to the current block.
        """
        if len(block.statements) != 0:
            self.create_new_block()
            block = self.current_block
        block.statements.append(statement)

    def add_exit(self, block, nextblock, exitcase="sequential next"):
        """
        Add a new exit to a block.

        Args:
            block: A block to which an exit must be added.
            nextblock: The block to which control jumps from the new exit.
            exitcase: An AST node representing the 'case' (or condition)
                      leading to the exit from the block in the program.
        """
        newlink = Link(block, nextblock, exitcase)
        block.exits.append(newlink)
        nextblock.predecessors.append(newlink)

    def new_loopguard(self):
        """
        Create a new block for a loop's guard if the current block is not
        empty. Links the current block to the new loop guard.

        Returns:
            The block to be used as new loop guard.
        """
        if (self.current_block.is_empty() and
                len(self.current_block.exits) == 0):
            # If the current block is empty and has no exits, it is used as
            # entry block (condition test) for the loop.
            loopguard = self.current_block
        else:
            # Jump to a new block for the loop's guard if the current block
            # isn't empty or has exits.
            loopguard = self.new_block()
            self.add_exit(self.current_block, loopguard)
        return loopguard

    def create_new_block(self, label = "sequential next"):
        """
        Creates a new block, adds exit to it using the input label,
        and sets it to current_block.

        Args:
            label: label for exit case
        """
        newblock = self.new_block()
        self.add_exit(self.current_block, newblock, label)
        self.current_block = newblock


    def create_next_statement_block(self):
        """
        Creates a block for NEXT statement
        """


        statement = self.create_and_push_statement([], [], [], [], "next")
        statement.text = "NEXT SENTENCE"
        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.next_sentence_stack.append(self.current_block)
        self.current_block = self.new_block()

    # ---------- Business Rules management methods ---------- #
    def enter_variable(self, var, variable_type, statement):
        """
        Recursively adds variable to the statement object

        Args:
            var: variable to be added
            variable_type: the type of variable
            statement: current statement to which this variable belongs
        """
        variable = None
        if var in self.variables:
            variable = self.variables[var]
        else:
            variable = Variable(None, var, None)
            self.variables[var] = variable




        variable.statements.append(statement)
        variable.statement_blocks.append(self.current_block)

        if variable_type == "source":
            statement.source_variables[var] = variable
        elif variable_type == "target":
            self.business_variables.add(variable)
            statement.target_variables[var] = variable
        elif variable_type == "conditional":
            self.business_variables.add(variable)
            statement.condition_variables[var] = self.variables[var]

        # Recursively add children variables to the current statement
        # This is done because children variables are also changed/used
        # when parent variable is changed/used
        if variable.children is not None:
            for var_child in variable.children:
                self.enter_variable(var_child.name, variable_type, statement)

    def enter_variables(self, statement_variables, variable_type, statement):
        """
        Adds variables to the statement object

        Args:
            statement_variables: variables to be added
            variable_type: the type of variable
            statement: current statement to which this variable belongs
        """
        for var in statement_variables:
            if len(var.strip()) == 0:
                continue
            self.enter_variable(var, variable_type, statement)



    def collect_variables(self, children, target_ctx_types):
        """
        Extracts variables present in children nodes

        Args:
            children: children nodes from which variables are to be extracted
            target_ctx_types: the types of nodes which consists target variables

        Returns:
            source and target variables extracted
        """
        target_variables = []
        source_variables = []
        for child in children:
            if type(child) in target_ctx_types:
                target_variables += extract_identifiers(child)
            else:
                source_variables += extract_identifiers(child)
        return [source_variables, target_variables]



    def create_and_push_statement(self, ctx_list, source_variables, target_variables,
     conditional_variables, tag):
        """
        Creates the statement object and appends to statements array

        Args:
            ctx_list: AST nodes which forms the appropriate text of the statement
            source_variables: the source variables in the statement
            target_variables: the target variables in the statement
            conditional_variables: the conditional variables in the statement

        Returns:
            statement object
        """
        tokens = []
        for ctx in ctx_list:
            tokens += get_tokens(ctx)
        text = " ".join(tokens)
        statement = Statement(text, tag)

        statement.line_number = len(self.statements) + 1
        self.enter_variables(source_variables, 'source', statement)
        self.enter_variables(target_variables, 'target', statement)
        self.enter_variables(conditional_variables, 'conditional', statement)
        self.statements.append(statement)
        return statement

    def add_parent_context_blocks(self, statement):
        """
        Adds all the parent context blocks to the current statement

        Args:
            statement: active/current COBOL statement being processed
        """
        for conditional_block in reversed(self.conditional_scope_stack):

            # If control was switched due to perform, sort and merge procedure calls
            # conditional contexts above them should not be added
            if conditional_block.statements[0].tag in ['perform', 'sort', 'merge']:
                break

            statement.conditional_blocks.append(conditional_block)

        for error_management_block in reversed(self.error_management_stack):

            # If control was switched due to perform, sort and merge procedure calls
            # conditional contexts above them should not be added
            if error_management_block.statements[0].tag in ['perform', 'sort', 'merge']:
                break

            statement.parent_context_blocks.append(error_management_block)

        for evaluate_block in reversed(self.evaluate_stack):
            statement.parent_context_blocks.append(evaluate_block)

        for evaluate_when_block in reversed(self.evaluate_when_stack):
            statement.parent_context_blocks.append(evaluate_when_block)

        for search_block in reversed(self.search_stack):
            statement.parent_context_blocks.append(search_block)

        for search_when_block in reversed(self.search_when_stack):
            statement.parent_context_blocks.append(search_when_block)





    # override
    # Visit a parse tree produced by Cobol85Parser#computeStatement.
    def visitComputeStatement(self, ctx:Cobol85Parser.ComputeStatementContext):
        #     // compute statement

        # computeStatement
        #    : COMPUTE computeStore+ (EQUALCHAR | EQUAL) arithmeticExpression onSizeErrorPhrase?
        #  notOnSizeErrorPhrase? END_COMPUTE?
        #    ;

        # computeStore
        #    : identifier ROUNDED?
        #    ;

        if ctx in self.statements_dict:
            # If statement is already processed, don't process it again
            self.current_block = self.statements_dict[ctx]
            return

        text_ctx = [] # AST nodes that form the appropriate statement text
        valid_children = [] # children nodes that doesn't contain nested statements


        error_clause_ctxs = [Cobol85Parser.OnSizeErrorPhraseContext,
         Cobol85Parser.NotOnSizeErrorPhraseContext]

        for child in ctx.getChildren():
            if child != ctx.END_COMPUTE() and type(child) not in error_clause_ctxs:
                text_ctx.append(child)
                valid_children.append(child)

        source_variables, target_variables = self.collect_variables(valid_children,
         [Cobol85Parser.ComputeStoreContext])
        statement = self.create_and_push_statement(text_ctx, source_variables, target_variables,
         [], "compute")
        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block

        compute_block = self.current_block

        after_compute_block = self.new_block()
        self.add_exit(self.current_block, after_compute_block)


        self.add_error_management_flow(ctx, compute_block, after_compute_block,
        error_clause_ctxs,
        ["OnSizeError", "NotOnSizeError"])

        self.statements_dict[ctx] = compute_block

        self.current_block = after_compute_block




    # override
    def visitAcceptStatement(self, ctx:Cobol85Parser.AcceptStatementContext):
        #    acceptStatement
        #    : ACCEPT identifier (acceptFromDateStatement | acceptFromEscapeKeyStatement
        #    | acceptFromMnemonicStatement | acceptMessageCountStatement)?
        #  onExceptionClause? notOnExceptionClause? END_ACCEPT?
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return


        text_ctx = []
        valid_children = []

        for child in ctx.getChildren():
            if child != ctx.END_ACCEPT() and type(child) \
             not in [Cobol85Parser.OnExceptionClauseContext,
              Cobol85Parser.NotOnExceptionClauseContext]:
                text_ctx.append(child)
                valid_children.append(child)


        source_variables, target_variables = self.collect_variables(valid_children,
         [Cobol85Parser.IdentifierContext])
        statement = self.create_and_push_statement(text_ctx, source_variables,
         target_variables, [], "accept")
        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block

        accept_block = self.current_block

        after_accept_block = self.new_block()
        self.add_exit(self.current_block, after_accept_block)


        self.add_error_management_flow(ctx, accept_block, after_accept_block,
        [Cobol85Parser.OnExceptionClauseContext, Cobol85Parser.NotOnExceptionClauseContext],
        ["OnException", "NotOnException"])

        self.current_block = after_accept_block




    # override
    def visitAddStatement(self, ctx:Cobol85Parser.AddStatementContext):
        # addStatement
        #    : ADD (addToStatement | addToGivingStatement | addCorrespondingStatement)
        #  onSizeErrorPhrase? notOnSizeErrorPhrase? END_ADD?
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return

        text_ctx = [] # ADD



        for child in ctx.getChildren():
            if child != ctx.END_ADD() and type(child)\
                 not in [Cobol85Parser.OnSizeErrorPhraseContext,
                  Cobol85Parser.NotOnSizeErrorPhraseContext]:
                text_ctx.append(child)




        source_variables, target_variables = self.collect_variables(ctx.children[1].getChildren(),
         [Cobol85Parser.AddToContext, Cobol85Parser.AddGivingContext])
        statement = self.create_and_push_statement(text_ctx, source_variables, target_variables,
         [], "add")
        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block

        add_block = self.current_block
        self.statements_dict[ctx] = add_block


        after_add_block = self.new_block()
        self.add_exit(self.current_block, after_add_block)


        self.add_error_management_flow(ctx, add_block, after_add_block,
        [Cobol85Parser.OnSizeErrorPhraseContext, Cobol85Parser.NotOnSizeErrorPhraseContext],
        ["OnSizeError", "NotOnSizeError"])

        self.current_block = after_add_block



    # override
    # Visit a parse tree produced by Cobol85Parser#alterStatement.
    def visitAlterStatement(self, ctx:Cobol85Parser.AlterStatementContext):
        # // alter statement

        # alterStatement
        # : ALTER alterProceedTo+
        # ;

        # alterProceedTo
        # : procedureName TO (PROCEED TO)? procedureName
        # ;
        return self.visitChildren(ctx)

    # override
    # Visit a parse tree produced by Cobol85Parser#cancelStatement.
    def visitCancelStatement(self, ctx:Cobol85Parser.CancelStatementContext):
        # // cancel statement

        # cancelStatement
        # : CANCEL cancelCall+
        # ;

        # cancelCall
        # : libraryName (BYTITLE | BYFUNCTION) | identifier | literal
        # ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return

        source_variables, target_variables = self.collect_variables(ctx.getChildren(), [])
        statement = self.create_and_push_statement([ctx], source_variables, target_variables,
         [], "cancel")
        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block
        self.create_new_block()



    # override
    # Visit a parse tree produced by Cobol85Parser#deleteStatement.
    def visitDeleteStatement(self, ctx:Cobol85Parser.DeleteStatementContext):
        # // delete statement

        # deleteStatement
        # : DELETE fileName RECORD? invalidKeyPhrase? notInvalidKeyPhrase? END_DELETE?
        # ;

        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return


        text_ctx = []
        valid_children = []
        error_clause_ctxs = [Cobol85Parser.InvalidKeyPhraseContext,
         Cobol85Parser.NotInvalidKeyPhraseContext]
        for child in ctx.getChildren():
            if child != ctx.END_DELETE() and type(child) not in error_clause_ctxs:
                text_ctx.append(child)
                valid_children.append(child)



        source_variables, target_variables = self.collect_variables(valid_children,
        [Cobol85Parser.FileNameContext])
        statement = self.create_and_push_statement(text_ctx,source_variables,
         target_variables,[], "delete")

        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block

        delete_block = self.current_block

        after_delete_block = self.new_block()
        self.add_exit(self.current_block, after_delete_block)


        self.add_error_management_flow(ctx, delete_block, after_delete_block,
        error_clause_ctxs,
        ["InvalidKey", "NotInvalidKey"])

        self.current_block = after_delete_block


    # override
    # Visit a parse tree produced by Cobol85Parser#displayStatement.
    def visitDisplayStatement(self, ctx:Cobol85Parser.DisplayStatementContext):
        # // display statement

        # displayStatement
        # : DISPLAY displayOperand+ displayAt? displayUpon? displayWith?
        # ;

        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return


        source_variables, target_variables = self.collect_variables(ctx.getChildren(),
         [Cobol85Parser.DisplayOperandContext])
        statement = self.create_and_push_statement([ctx], source_variables,
         target_variables, [], "display")
        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block

        self.create_new_block()



    # override
    # Visit a parse tree produced by Cobol85Parser#enableStatement.
    def visitEnableStatement(self, ctx:Cobol85Parser.EnableStatementContext):
        # // enable statement

        # enableStatement
        # : ENABLE (INPUT TERMINAL? | I_O TERMINAL | OUTPUT) cdName WITH? KEY (literal | identifier)
        # ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return


        source_variables, target_variables = self.collect_variables(ctx.getChildren(), [])
        statement = self.create_and_push_statement([ctx], source_variables, target_variables,
         [], "enable")
        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block

        self.create_new_block()


    # override
    # Visit a parse tree produced by Cobol85Parser#evaluateStatement.
    def visitEvaluateStatement(self, ctx:Cobol85Parser.EvaluateStatementContext):
        # // evaluate statement

        # evaluateStatement
        # : EVALUATE evaluateSelect evaluateAlsoSelect* evaluateWhenPhrase+ evaluateWhenOther?
        #  END_EVALUATE?
        # ;

        # evaluateSelect
        # : identifier | literal | arithmeticExpression | condition
        # ;

        # evaluateAlsoSelect
        # : ALSO evaluateSelect
        # ;

        # evaluateWhenPhrase
        # : evaluateWhen+ statement*
        # ;

        # evaluateWhen
        # : WHEN evaluateCondition evaluateAlsoCondition*
        # ;

        # evaluateCondition
        # : ANY | NOT? evaluateValue evaluateThrough? | condition | booleanLiteral
        # ;

        # evaluateThrough
        # : (THROUGH | THRU) evaluateValue
        # ;

        # evaluateAlsoCondition
        # : ALSO evaluateCondition
        # ;

        # evaluateWhenOther
        # : WHEN OTHER statement*
        # ;

        # evaluateValue
        # : identifier | literal | arithmeticExpression
        # ;




        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return


        text_ctx = []
        valid_children = []

        for child in ctx.getChildren():
            if child != ctx.END_EVALUATE() and type(child)\
                 not in [Cobol85Parser.EvaluateWhenPhraseContext,
                  Cobol85Parser.EvaluateWhenOtherContext]:
                text_ctx.append(child)
                valid_children.append(child)


        conditional_variables = []

        _, conditional_variables = self.collect_variables(valid_children,
         [Cobol85Parser.EvaluateSelectContext, Cobol85Parser.EvaluateAlsoSelectContext])
        statement = self.create_and_push_statement(text_ctx,
         [], [], conditional_variables, "evaluate")
        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block

        self.evaluate_stack.append(self.current_block)

        self.create_new_block("evaluate when")
        after_evaluate = self.new_block()

        next_when_block = self.current_block

        old_evaluate_when_stack = self.evaluate_when_stack.copy()

        for child in ctx.getChildren():
            if isinstance(child,Cobol85Parser.EvaluateWhenPhraseContext):
                # evaluateWhenPhrase
                # : evaluateWhen+ statement*
                # ;
                true_block = self.new_block()
                self.current_block = next_when_block

                for ctx_child in  child.getChildren():

                    if isinstance(ctx_child,Cobol85Parser.EvaluateWhenContext):

                        next_when_block = self.new_block()


                        self.add_exit(self.current_block, true_block, "true")
                        self.add_exit(self.current_block, next_when_block, "false")
                        self.visit(ctx_child)
                        self.current_block = next_when_block


                self.current_block = true_block

                for ctx_child in  child.getChildren():

                    if isinstance(ctx_child,Cobol85Parser.StatementContext):
                        self.visit(ctx_child)
                self.add_exit(self.current_block, after_evaluate, "evaluate exit")
            elif  isinstance(child, Cobol85Parser.EvaluateWhenOtherContext):
                # evaluateWhenOther
                # : WHEN OTHER statement*
                # ;
                other_scope = self.new_block()
                self.current_block = next_when_block
                self.add_exit(self.current_block, other_scope)


                self.current_block = other_scope

                for ctx_child in  child.getChildren():

                    if isinstance(ctx_child,Cobol85Parser.StatementContext):
                        self.visit(ctx_child)
                self.add_exit(self.current_block, after_evaluate, "Evaluate-Exit")

        if ctx.evaluateWhenOther() is None:
            # When there's no "When Other" statement, last evaluate
            # when's false edge should link to the  next executable statement

            self.add_exit(next_when_block,after_evaluate)

        self.current_block = after_evaluate
        self.evaluate_stack.pop()
        self.evaluate_when_stack = old_evaluate_when_stack






    # Visit a parse tree produced by Cobol85Parser#evaluateWhen.
    def visitEvaluateWhen(self, ctx:Cobol85Parser.EvaluateWhenContext):
        # evaluateWhen
        # : WHEN evaluateCondition evaluateAlsoCondition*
        # ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return

        _, target_variables = self.collect_variables(ctx.getChildren(),
         [Cobol85Parser.EvaluateConditionContext, Cobol85Parser.EvaluateAlsoConditionContext])
        statement =  self.create_and_push_statement([ctx], [], target_variables, [], "when")

        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)

        self.evaluate_when_stack.append(self.current_block)

        self.statements_dict[ctx] = self.current_block

        self.create_new_block()



    # override
    # Visit a parse tree produced by Cobol85Parser#execCicsStatement.
    def visitExecCicsStatement(self, ctx:Cobol85Parser.ExecCicsStatementContext):
        # // exec cics statement

        # execCicsStatement
        # : EXECCICSLINE+
        # ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return


        source_variables, target_variables = self.collect_variables(ctx.getChildren(), [])
        statement = self.create_and_push_statement([ctx], source_variables,
         target_variables, [], "exec cics")
        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block

        self.create_new_block()

    # Visit a parse tree produced by Cobol85Parser#execSqlStatement.
    def visitExecSqlStatement(self, ctx:Cobol85Parser.ExecSqlStatementContext):
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return


        source_variables, target_variables = self.collect_variables(ctx.getChildren(), [])
        statement = self.create_and_push_statement([ctx], source_variables,
         target_variables, [], "exec sql")
        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block

        self.create_new_block()


    # override
    # Visit a parse tree produced by Cobol85Parser#execSqlImsStatement.
    def visitExecSqlImsStatement(self, ctx:Cobol85Parser.ExecSqlImsStatementContext):
        # // exec sql ims statement

        # execSqlImsStatement
        # : EXECSQLIMSLINE+
        # ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return


        source_variables, target_variables = self.collect_variables(ctx.getChildren(), [])
        statement = self.create_and_push_statement([ctx], source_variables,
         target_variables, [], "exec sql ims")
        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block

        self.create_new_block()


    # override
    # Visit a parse tree produced by Cobol85Parser#generateStatement.
    def visitGenerateStatement(self, ctx:Cobol85Parser.GenerateStatementContext):
        # // generate statement

        # generateStatement
        # : GENERATE reportName
        # ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return


        source_variables, target_variables = self.collect_variables(ctx.getChildren(), [])
        statement = self.create_and_push_statement([ctx], source_variables,
         target_variables, [], "generate")
        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block

        self.create_new_block()


    # override
    # Visit a parse tree produced by Cobol85Parser#goToStatement.
    def visitGoToStatement(self, ctx:Cobol85Parser.GoToStatementContext):
        # // goto statement

        # goToStatement
        # : GO TO? (goToStatementSimple | goToDependingOnStatement)
        # ;

        # goToStatementSimple
        # : procedureName
        # ;

        # goToDependingOnStatement
        # : MORE_LABELS | procedureName+ (DEPENDING ON? identifier)?
        # ;

        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return

        source_variables, target_variables = self.collect_variables(ctx.getChildren(), [])
        statement = self.create_and_push_statement([ctx], source_variables,
         target_variables, [], "goto")
        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block


        procedure_names = extract_given_context(ctx, [Cobol85Parser.ProcedureNameContext])

        for procedure_name in procedure_names:
            procedure = self.get_procedure(procedure_name.getText())
            procedure.link_first_statement.append(self.current_block)
        self.current_block = self.new_block()



    # override
    # Visit a parse tree produced by Cobol85Parser#initializeStatement.
    def visitInitializeStatement(self, ctx:Cobol85Parser.InitializeStatementContext):
        # // initialize statement

        # initializeStatement
        #    : INITIALIZE identifier+ initializeReplacingPhrase?
        #    ;

        # initializeReplacingPhrase
        #    : REPLACING initializeReplacingBy+
        #    ;

        # initializeReplacingBy
        #    : (ALPHABETIC | ALPHANUMERIC | ALPHANUMERIC_EDITED | NATIONAL |
        #  NATIONAL_EDITED | NUMERIC | NUMERIC_EDITED | DBCS | EGCS) DATA?
        #  BY (identifier | literal)
        #    ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return

        source_variables, target_variables = self.collect_variables(ctx.getChildren(),
         [Cobol85Parser.IdentifierContext])
        statement = self.create_and_push_statement([ctx], source_variables,
         target_variables, [], "initialize")
        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block
        self.create_new_block()


    # override
    # Visit a parse tree produced by Cobol85Parser#inspectStatement.
    def visitInspectStatement(self, ctx:Cobol85Parser.InspectStatementContext):
        # // inspect statement

        # inspectStatement
        # : INSPECT identifier (inspectTallyingPhrase | inspectReplacingPhrase |
        #  inspectTallyingReplacingPhrase | inspectConvertingPhrase)
        # ;

        # inspectTallyingPhrase
        # : TALLYING inspectFor+
        # ;

        # inspectReplacingPhrase
        # : REPLACING (inspectReplacingCharacters | inspectReplacingAllLeadings)+
        # ;

        # inspectTallyingReplacingPhrase
        # : TALLYING inspectFor+ inspectReplacingPhrase+
        # ;

        # inspectConvertingPhrase
        # : CONVERTING (identifier | literal) inspectTo inspectBeforeAfter*
        # ;

        # inspectFor
        # : identifier FOR (inspectCharacters | inspectAllLeadings)+
        # ;

        # inspectCharacters
        # : CHARACTERS inspectBeforeAfter*
        # ;

        # inspectReplacingCharacters
        # : CHARACTERS inspectBy inspectBeforeAfter*
        # ;

        # inspectAllLeadings
        # : (ALL | LEADING) inspectAllLeading+
        # ;

        # inspectReplacingAllLeadings
        # : (ALL | LEADING | FIRST) inspectReplacingAllLeading+
        # ;

        # inspectAllLeading
        # : (identifier | literal) inspectBeforeAfter*
        # ;

        # inspectReplacingAllLeading
        # : (identifier | literal) inspectBy inspectBeforeAfter*
        # ;

        # inspectBy
        # : BY (identifier | literal)
        # ;

        # inspectTo
        # : TO (identifier | literal)
        # ;

        # inspectBeforeAfter
        # : (BEFORE | AFTER) INITIAL? (identifier | literal)
        # ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return

        source_variables = []
        target_variables = []


        if ctx.inspectTallyingPhrase() is not  None:
            source_variables, _ = self.collect_variables(ctx.children[1], [])

            for child in ctx.inspectTallyingPhrase().getChildren():
                if  isinstance(child, Cobol85Parser.InspectForContext):
                    source_variables_temp, target_variables_temp = \
                        self.collect_variables(child.getChildren(),
                         [Cobol85Parser.IdentifierContext])
                    source_variables += source_variables_temp
                    target_variables += target_variables_temp
        elif ctx.inspectReplacingPhrase()  is not None:
            source_variables, target_variables = self.collect_variables(ctx.getChildren(),
             [Cobol85Parser.IdentifierContext])
        elif ctx.inspectConvertingPhrase()  is not  None:
            source_variables, target_variables = self.collect_variables(ctx.getChildren(),
             [Cobol85Parser.IdentifierContext])
        elif ctx.inspectTallyingReplacingPhrase()  is not None:
            _, target_variables = self.collect_variables(ctx.children[1],
             [Cobol85Parser.IdentifierContext])
            # inspectTallyingReplacingPhrase
            # : TALLYING inspectFor+ inspectReplacingPhrase+
            # ;
            for child in ctx.inspectTallyingReplacingPhrase().getChildren():
                if  isinstance(child, Cobol85Parser.InspectForContext):
                    source_variables_temp, target_variables_temp = \
                    self.collect_variables(child.getChildren(), [Cobol85Parser.IdentifierContext])
                    source_variables += source_variables_temp
                    target_variables += target_variables_temp
                elif  isinstance(child, Cobol85Parser.InspectReplacingPhraseContext):
                    source_variables_temp, target_variables_temp = \
                        self.collect_variables(child.getChildren(), [])
                    source_variables += source_variables_temp
                    target_variables += target_variables_temp






        statement = self.create_and_push_statement([ctx], source_variables, target_variables,
         [], "inspect")
        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block
        self.create_new_block()

    # override
    # Visit a parse tree produced by Cobol85Parser#moveStatement.
    def visitMoveStatement(self, ctx:Cobol85Parser.MoveStatementContext):
        # // move statement

        # moveStatement
        # : MOVE ALL? (moveToStatement | moveCorrespondingToStatement)
        # ;

        # moveToStatement
        # : moveToSendingArea TO identifier+
        # ;

        # moveToSendingArea
        # : identifier | literal
        # ;

        # moveCorrespondingToStatement
        # : (CORRESPONDING | CORR) moveCorrespondingToSendingArea TO identifier+
        # ;

        # moveCorrespondingToSendingArea
        # : identifier
        # ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return

        variable_ctx = ctx.moveToStatement()
        if variable_ctx is None:
            variable_ctx = ctx.moveCorrespondingToStatement()
        source_variables, target_variables = self.collect_variables(variable_ctx.getChildren(),
         [Cobol85Parser.IdentifierContext])
        statement = self.create_and_push_statement([ctx], source_variables, target_variables, [],
         "move")
        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block
        self.create_new_block()



    # override
    # Visit a parse tree produced by Cobol85Parser#openStatement.
    def visitOpenStatement(self, ctx:Cobol85Parser.OpenStatementContext):
        # // open statement

        # openStatement
        # : OPEN (openInputStatement | openOutputStatement | openIOStatement |
        #  openExtendStatement)+
        # ;

        # openInputStatement
        # : INPUT openInput+
        # ;

        # openInput
        # : fileName (REVERSED | WITH? NO REWIND)?
        # ;

        # openOutputStatement
        # : OUTPUT openOutput+
        # ;

        # openOutput
        # : fileName (WITH? NO REWIND)?
        # ;

        # openIOStatement
        # : I_O fileName+
        # ;

        # openExtendStatement
        # : EXTEND fileName+
        # ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return

        source_variables, target_variables = self.collect_variables(ctx.getChildren(),
         [Cobol85Parser.OpenInputStatementContext, Cobol85Parser.OpenOutputStatementContext,
          Cobol85Parser.OpenIOStatementContext, Cobol85Parser.OpenExtendStatementContext])
        statement = self.create_and_push_statement([ctx], source_variables, target_variables, [],
         "open")
        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block
        self.create_new_block()



    # override
    # Visit a parse tree produced by Cobol85Parser#purgeStatement.
    def visitPurgeStatement(self, ctx:Cobol85Parser.PurgeStatementContext):
        # // purge statement

        # purgeStatement
        # : PURGE cdName+
        # ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return

        source_variables, target_variables = self.collect_variables(ctx.getChildren(), [])
        statement = self.create_and_push_statement([ctx], source_variables, target_variables,
         [], "purge")
        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block
        self.create_new_block()


    # override
    # Visit a parse tree produced by Cobol85Parser#receiveStatement.
    def visitReceiveStatement(self, ctx:Cobol85Parser.ReceiveStatementContext):
        # // receive statement

        # receiveStatement
        # : RECEIVE (receiveFromStatement | receiveIntoStatement) onExceptionClause?
        #  notOnExceptionClause? END_RECEIVE?
        # ;

        # receiveFromStatement
        # : dataName FROM receiveFrom (receiveBefore | receiveWith | receiveThread |
        #  receiveSize | receiveStatus)*
        # ;

        # receiveFrom
        # : THREAD dataName | LAST THREAD | ANY THREAD
        # ;

        # receiveIntoStatement
        # : cdName (MESSAGE | SEGMENT) INTO? identifier receiveNoData? receiveWithData?
        # ;

        # receiveNoData
        # : NO DATA statement*
        # ;

        # receiveWithData
        # : WITH DATA statement*
        # ;

        # receiveBefore
        # : BEFORE TIME? (numericLiteral | identifier)
        # ;

        # receiveWith
        # : WITH? NO WAIT
        # ;

        # receiveThread
        # : THREAD IN? dataName
        # ;

        # receiveSize
        # : SIZE IN? (numericLiteral | identifier)
        # ;

        # receiveStatus
        # : STATUS IN? (identifier)
        # ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return


        text_ctx = []
        valid_children = []

        for child in ctx.getChildren():
            if child != ctx.END_RECEIVE() and type(child)\
                 not in [Cobol85Parser.OnExceptionClauseContext,
                  Cobol85Parser.NotOnExceptionClauseContext]:
                text_ctx.append(child)
                valid_children.append(child)


        source_variables, target_variables = self.collect_variables(valid_children, [])
        statement = self.create_and_push_statement(text_ctx, source_variables,
         target_variables, [], "receive")
        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block

        receive_block = self.current_block

        after_receive_block = self.new_block()
        self.add_exit(self.current_block, after_receive_block)


        self.add_error_management_flow(ctx, receive_block, after_receive_block,
        [Cobol85Parser.OnExceptionClauseContext, Cobol85Parser.NotOnExceptionClauseContext],
        ["OnException", "NotOnException"])

        self.current_block = after_receive_block

    # override
    # Visit a parse tree produced by Cobol85Parser#returnStatement.
    def visitReturnStatement(self, ctx:Cobol85Parser.ReturnStatementContext):
        # // return statement

        # returnStatement
        # : RETURN fileName RECORD? returnInto? atEndPhrase notAtEndPhrase? END_RETURN?
        # ;

        # returnInto
        # : INTO qualifiedDataName
        # ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return


        text_ctx = []
        valid_children = []
        error_clause_ctxs = [Cobol85Parser.AtEndPhraseContext, Cobol85Parser.NotAtEndPhraseContext]
        for child in ctx.getChildren():
            if child != ctx.END_RETURN() and type(child) not in error_clause_ctxs:
                text_ctx.append(child)
                valid_children.append(child)




        source_variables, target_variables = self.collect_variables(valid_children,
        [Cobol85Parser.ReturnIntoContext])
        statement = self.create_and_push_statement(text_ctx, source_variables,
         target_variables,[], "return")
        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block

        return_block = self.current_block

        after_return_block = self.new_block()
        self.add_exit(self.current_block, after_return_block)


        self.add_error_management_flow(ctx, return_block, after_return_block,
        error_clause_ctxs,
        ["AtEnd", "NotAtEnd"])

        self.current_block = after_return_block

    # override
    # Visit a parse tree produced by Cobol85Parser#searchStatement.
    def visitSearchStatement(self, ctx:Cobol85Parser.SearchStatementContext):
        # // search statement

        # searchStatement
        # : SEARCH ALL? qualifiedDataName searchVarying? atEndPhrase? searchWhen+ END_SEARCH?
        # ;

        # searchVarying
        # : VARYING qualifiedDataName
        # ;

        # searchWhen
        # : WHEN condition (NEXT SENTENCE | statement*)
        # ;

        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return

        text_ctx = []
        valid_children = []
        error_clause_ctxs = [Cobol85Parser.AtEndPhraseContext, Cobol85Parser.SearchWhenContext]
        for child in ctx.getChildren():
            if child != ctx.END_SEARCH() and type(child) not in error_clause_ctxs:
                text_ctx.append(child)
                valid_children.append(child)

        source_variables = []
        source_variables, _ = self.collect_variables(valid_children, [])

        search_stmt = self.create_and_push_statement(text_ctx, source_variables, [], [], "search")

        self.add_statement(self.current_block, search_stmt)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(search_stmt)
        self.statements_dict[ctx] = self.current_block

        self.search_stack.append(self.current_block)

        search_block = self.current_block



        self.create_new_block("search when")
        after_search = self.new_block()

        next_when_block = self.current_block

        old_search_when_stack = self.search_when_stack.copy()

        for child in ctx.getChildren():
            if isinstance(child,Cobol85Parser.SearchWhenContext):
                # searchWhen
                # : WHEN condition (NEXT SENTENCE | statement*)
                # ;
                true_block = self.new_block()
                self.current_block = next_when_block

                next_when_block = self.new_block()
                self.add_exit(self.current_block, true_block, "true")
                self.add_exit(self.current_block, next_when_block, "false")

                ### Creating "WHEN condition" block

                _, condition_variables = self.collect_variables([child.children[0],
                 child.children[1] ], [Cobol85Parser.ConditionContext])
                when_condition_statement =  self.create_and_push_statement([child.children[0],
                 child.children[1] ], [], [], condition_variables, "when")

                self.add_statement(self.current_block, when_condition_statement)
                self.append_to_procedure(self.current_block)
                self.add_parent_context_blocks(when_condition_statement)

                self.search_when_stack.append(self.current_block)

                self.statements_dict[child] = self.current_block

                self.create_new_block()


                self.current_block = true_block

                if child.NEXT() is not None:
                    # If there is NEXT SENTENCE
                    self.create_next_statement_block()
                    continue

                for ctx_child in  child.getChildren():

                    if isinstance(ctx_child,Cobol85Parser.StatementContext):
                        self.visit(ctx_child)

                self.add_exit(self.current_block, after_search, "search exit")


        # after search  when  blocks are done (and  are false), "at end" is called
        self.add_error_management_flow(ctx, search_block, after_search,
        [Cobol85Parser.AtEndPhraseContext],
        ["AtEnd"])
        self.current_block = after_search
        self.search_stack.pop()
        self.search_when_stack = old_search_when_stack


    # override
    # Visit a parse tree produced by Cobol85Parser#setStatement.
    def visitSetStatement(self, ctx:Cobol85Parser.SetStatementContext):
        # // set statement

        # setStatement
        # : SET (setToStatement+ | setUpDownByStatement)
        # ;

        # setToStatement
        # : setTo+ TO setToValue+
        # ;

        # setUpDownByStatement
        # : setTo+ (UP BY | DOWN BY) setByValue
        # ;

        # setTo
        # : identifier
        # ;

        # setToValue
        # : ON | OFF | ENTRY (identifier | literal) | identifier | literal
        # ;

        # setByValue
        # : identifier | literal
        # ;

        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return

        source_variables  = []
        target_variables = []

        for child in ctx.getChildren():
            if child != ctx.SET():
                source_variables_temp, target_variables_temp =\
                     self.collect_variables(child.getChildren(), [Cobol85Parser.SetToContext])

                source_variables += source_variables_temp
                target_variables += target_variables_temp


        statement = self.create_and_push_statement([ctx], source_variables,
         target_variables, [], "set")
        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block
        self.create_new_block()



    # override
    # Visit a parse tree produced by Cobol85Parser#startStatement.
    def visitStartStatement(self, ctx:Cobol85Parser.StartStatementContext):
        # // start statement

        # startStatement
        # : START fileName startKey? invalidKeyPhrase? notInvalidKeyPhrase? END_START?
        # ;

        # startKey
        # :  KEY IS? (EQUAL TO? | EQUALCHAR | GREATER THAN? | MORETHANCHAR |
        #  NOT LESS THAN? | NOT LESSTHANCHAR |
        #  GREATER THAN? OR EQUAL TO? | MORETHANOREQUAL) qualifiedDataName
        # ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return


        text_ctx = []
        valid_children = []
        error_clause_ctxs = [Cobol85Parser.InvalidKeyPhraseContext,
         Cobol85Parser.NotInvalidKeyPhraseContext]
        for child in ctx.getChildren():
            if child != ctx.END_START() and type(child) not in error_clause_ctxs:
                text_ctx.append(child)
                valid_children.append(child)



        source_variables, target_variables = self.collect_variables(valid_children,
        [Cobol85Parser.FileNameContext])
        statement = self.create_and_push_statement(text_ctx,source_variables,
         target_variables,[], "start")

        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block

        start_block = self.current_block

        after_start_block = self.new_block()
        self.add_exit(self.current_block, after_start_block)


        self.add_error_management_flow(ctx, start_block, after_start_block,
        error_clause_ctxs,
        ["InvalidKey", "NotInvalidKey"])

        self.current_block = after_start_block

    # override
    # Visit a parse tree produced by Cobol85Parser#stringStatement.
    def visitStringStatement(self, ctx:Cobol85Parser.StringStatementContext):
        # // string statement

        # stringStatement
        # : STRING stringSendingPhrase+ stringIntoPhrase stringWithPointerPhrase?
        #  onOverflowPhrase? notOnOverflowPhrase? END_STRING?
        # ;

        # stringSendingPhrase
        # : stringSending+ (stringDelimitedByPhrase | stringForPhrase)
        # ;

        # stringSending
        # : identifier | literal
        # ;

        # stringDelimitedByPhrase
        # : DELIMITED BY? (SIZE | identifier | literal)
        # ;

        # stringForPhrase
        # : FOR (identifier | literal)
        # ;

        # stringIntoPhrase
        # : INTO identifier
        # ;

        # stringWithPointerPhrase
        # : WITH? POINTER qualifiedDataName
        # ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return

        text_ctx = []
        valid_children = []
        error_clause_ctxs = [Cobol85Parser.OnOverflowPhraseContext,
         Cobol85Parser.NotOnOverflowPhraseContext]
        for child in ctx.getChildren():
            if child != ctx.END_UNSTRING() and type(child) not in error_clause_ctxs:
                text_ctx.append(child)
                valid_children.append(child)


        source_variables, target_variables = self.collect_variables(valid_children,
         [Cobol85Parser.StringIntoPhraseContext,Cobol85Parser.StringWithPointerPhraseContext])
        statement = self.create_and_push_statement(text_ctx, source_variables,
         target_variables, [], "string")

        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block
        string_block = self.current_block

        after_string_block = self.new_block()
        self.add_exit(self.current_block, after_string_block)


        self.add_error_management_flow(ctx, string_block, after_string_block,
        error_clause_ctxs,
        ["OnOverflow", "NotOnOverflow"])

        self.current_block = after_string_block

    # override
    # Visit a parse tree produced by Cobol85Parser#terminateStatement.
    def visitTerminateStatement(self, ctx:Cobol85Parser.TerminateStatementContext):
        # // terminate statement

        # terminateStatement
        # : TERMINATE reportName
        # ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return

        source_variables, target_variables = self.collect_variables(ctx.getChildren(), [])
        statement = self.create_and_push_statement([ctx], source_variables,
         target_variables, [], "terminate")
        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block
        self.create_new_block()


    # override
    # Visit a parse tree produced by Cobol85Parser#writeStatement.
    def visitWriteStatement(self, ctx:Cobol85Parser.WriteStatementContext):
        # // write statement

        # writeStatement
        # : WRITE recordName writeFromPhrase? writeAdvancingPhrase? writeAtEndOfPagePhrase?
        #  writeNotAtEndOfPagePhrase? invalidKeyPhrase? notInvalidKeyPhrase? END_WRITE?
        # ;

        # writeFromPhrase
        # : FROM (identifier | literal)
        # ;

        # writeAdvancingPhrase
        # : (BEFORE | AFTER) ADVANCING? (writeAdvancingPage | writeAdvancingLines |
        #  writeAdvancingMnemonic)
        # ;

        # writeAdvancingPage
        # : PAGE
        # ;

        # writeAdvancingLines
        # : (identifier | literal) (LINE | LINES)?
        # ;

        # writeAdvancingMnemonic
        # : mnemonicName
        # ;

        # writeAtEndOfPagePhrase
        # : AT? (END_OF_PAGE | EOP) statement*
        # ;

        # writeNotAtEndOfPagePhrase
        # : NOT AT? (END_OF_PAGE | EOP) statement*
        # ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return


        text_ctx = []
        valid_children = []
        error_clause_ctxs = [Cobol85Parser.WriteAtEndOfPagePhraseContext,
         Cobol85Parser.WriteNotAtEndOfPagePhraseContext,Cobol85Parser.InvalidKeyPhraseContext,
          Cobol85Parser.NotInvalidKeyPhraseContext]
        for child in ctx.getChildren():
            if child != ctx.END_WRITE() and type(child) not in error_clause_ctxs:
                text_ctx.append(child)
                valid_children.append(child)

        source_variables, target_variables = self.collect_variables(valid_children,
        [Cobol85Parser.RecordNameContext])
        statement = self.create_and_push_statement(text_ctx,source_variables,
         target_variables,[], "write")

        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block

        write_block = self.current_block

        after_write_block = self.new_block()
        self.add_exit(self.current_block, after_write_block)


        self.add_error_management_flow(ctx, write_block, after_write_block,
        error_clause_ctxs,
        ["AtEnd", "NotAtEnd","InvalidKey", "NotInvalidKey"])

        self.current_block = after_write_block

    def visitCallStatement(self, ctx:Cobol85Parser.CallStatementContext):

        # // call statement

        # callStatement
        #    : CALL (identifier | literal) callUsingPhrase? callGivingPhrase?
        #  onOverflowPhrase? onExceptionClause? notOnExceptionClause? END_CALL?
        #    ;

        # callUsingPhrase
        #    : USING callUsingParameter+
        #    ;

        # callUsingParameter
        #    : callByReferencePhrase | callByValuePhrase | callByContentPhrase
        #    ;

        # callByReferencePhrase
        #    : (BY? REFERENCE)? callByReference+
        #    ;

        # callByReference
        #    : ((ADDRESS OF | INTEGER | STRING)? identifier | literal | fileName) | OMITTED
        #    ;

        # callByValuePhrase
        #    : BY? VALUE callByValue+
        #    ;

        # callByValue
        #    : (ADDRESS OF | LENGTH OF?)? (identifier | literal)
        #    ;

        # callByContentPhrase
        #    : BY? CONTENT callByContent+
        #    ;

        # callByContent
        #    : (ADDRESS OF | LENGTH OF?)? identifier | literal | OMITTED
        #    ;

        # callGivingPhrase
        #    : (GIVING | RETURNING) identifier
        #    ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return


        error_clause_ctxs = [Cobol85Parser.OnOverflowPhraseContext,
         Cobol85Parser.OnExceptionClauseContext, Cobol85Parser.NotOnExceptionClauseContext]
        text_ctx = []
        valid_children = []

        for child in ctx.getChildren():
            if child != ctx.END_CALL() and type(child) not in error_clause_ctxs:
                text_ctx.append(child)
                valid_children.append(child)

        source_variables, target_variables = self.collect_variables(valid_children,
         [Cobol85Parser.IdentifierContext, Cobol85Parser.CallUsingPhraseContext,
          Cobol85Parser.CallGivingPhraseContext])
        statement = self.create_and_push_statement(text_ctx, source_variables, target_variables,
         [], "call")
        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block
        call_block = self.current_block

        after_call_block = self.new_block()
        self.add_exit(self.current_block, after_call_block)

        # onOverflowPhrase? onExceptionClause? notOnExceptionClause?
        self.add_error_management_flow(ctx, call_block, after_call_block,
        error_clause_ctxs,
        ["OnOverflow", "OnException", "NotOnException"])

        self.current_block = after_call_block




    # Visit a parse tree produced by Cobol85Parser#continueStatement.
    def visitContinueStatement(self, ctx:Cobol85Parser.ContinueStatementContext):
        # continueStatement
        # : CONTINUE
        # ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return

        statement = self.create_and_push_statement([ctx], [], [], [], "continue")
        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block
        self.add_exit(self.current_block, self.curr_loop_guard_stack[-1])
        self.current_block = self.new_block()



        # Visit a parse tree produced by Cobol85Parser#disableStatement.
    def visitDisableStatement(self, ctx:Cobol85Parser.DisableStatementContext):
        # disableStatement
        #    : DISABLE (INPUT TERMINAL? | I_O TERMINAL |
        #  OUTPUT) cdName WITH? KEY (identifier | literal)
        #    ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return

        source_variables, target_variables = self.collect_variables(ctx.getChildren(), [])
        statement = self.create_and_push_statement([ctx], source_variables, target_variables,
         [], "disable")
        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block
        self.create_new_block()


    # Visit a parse tree produced by Cobol85Parser#divideStatement.
    def visitDivideStatement(self, ctx:Cobol85Parser.DivideStatementContext):
        # divideStatement
        #    : DIVIDE (identifier | literal) (divideIntoStatement |
        #  divideIntoGivingStatement | divideByGivingStatement) divideRemainder?
        #  onSizeErrorPhrase? notOnSizeErrorPhrase? END_DIVIDE?
        #    ;

        # divideIntoStatement
        #    : INTO divideInto+
        #    ;

        # divideIntoGivingStatement
        #    : INTO (identifier | literal) divideGivingPhrase?
        #    ;

        # divideByGivingStatement
        #    : BY (identifier | literal) divideGivingPhrase?
        #    ;

        # divideGivingPhrase
        #    : GIVING divideGiving+
        #    ;

        # divideInto
        #    : identifier ROUNDED?
        #    ;

        # divideGiving
        #    : identifier ROUNDED?
        #    ;

        # divideRemainder
        #    : REMAINDER identifier
        #    ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return


        text_ctx = []
        valid_children = []
        error_clause_ctxs = [Cobol85Parser.OnSizeErrorPhraseContext,
         Cobol85Parser.NotOnSizeErrorPhraseContext]
        for child in ctx.getChildren():
            if child != ctx.END_DIVIDE() and type(child) not in error_clause_ctxs:
                text_ctx.append(child)
                valid_children.append(child)

        source_variables, target_variables = self.collect_variables(ctx.children[2].getChildren(),
        [Cobol85Parser.DivideIntoContext, Cobol85Parser.DivideGivingPhraseContext])
        source_variables_2, _ = self.collect_variables([ctx.children[1]],[])
        _, target_variables_2 = self.collect_variables(valid_children,
        [Cobol85Parser.DivideRemainderContext])

        source_variables += source_variables_2
        target_variables += target_variables_2

        statement = self.create_and_push_statement(text_ctx,source_variables,
         target_variables,[], "divide")
        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block

        divide_block = self.current_block

        after_divide_block = self.new_block()
        self.add_exit(self.current_block, after_divide_block)


        self.add_error_management_flow(ctx, divide_block, after_divide_block,
        error_clause_ctxs,
        ["OnSizeError", "NotOnSizeError"])

        self.current_block = after_divide_block


    # Visit a parse tree produced by Cobol85Parser#entryStatement.
    def visitEntryStatement(self, ctx:Cobol85Parser.EntryStatementContext):
        #// entry statement

        # entryStatement
        #    : ENTRY literal (USING identifier+)?
        #    ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return

        source_variables, target_variables = self.collect_variables(ctx.getChildren(),[])
        statement = self.create_and_push_statement([ctx],source_variables,
         target_variables,[], "entry")
        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block
        self.create_new_block()



    # Visit a parse tree produced by Cobol85Parser#exhibitStatement.
    def visitExhibitStatement(self, ctx:Cobol85Parser.ExhibitStatementContext):
        # exhibitStatement
        #    : EXHIBIT NAMED? CHANGED? exhibitOperand+
        #    ;

        # exhibitOperand
        #    : identifier | literal
        #    ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return

        source_variables, target_variables = self.collect_variables(ctx.getChildren(),
        [Cobol85Parser.ExhibitOperandContext])
        statement = self.create_and_push_statement([ctx],source_variables,
         target_variables,[], "exhibit")
        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block
        self.create_new_block()


    # Visit a parse tree produced by Cobol85Parser#exitStatement.
    def visitExitStatement(self, ctx:Cobol85Parser.ExitStatementContext):
        # // exit statement

        # exitStatement
        # : EXIT PROGRAM?
        # ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return

        statement = self.create_and_push_statement([ctx],[], [],[], "exit")
        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block
        self.create_new_block()


    # Visit a parse tree produced by Cobol85Parser#gobackStatement.
    def visitGobackStatement(self, ctx:Cobol85Parser.GobackStatementContext):
        # // goback statement

        # gobackStatement
        # : GOBACK
        # ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return

        statement = self.create_and_push_statement([ctx],[], [],[], "goback")
        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block
        self.current_block = self.new_block()
        self.stop_run_found = True



    # Visit a parse tree produced by Cobol85Parser#initiateStatement.
    def visitInitiateStatement(self, ctx:Cobol85Parser.InitiateStatementContext):
        # // initiate statement

        # initiateStatement
        # : INITIATE reportName+
        # ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return

        source_variables, target_variables = self.collect_variables(ctx.getChildren(),
        [Cobol85Parser.ReportNameContext])
        statement = self.create_and_push_statement([ctx],source_variables,
         target_variables,[], "initiate")
        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block
        self.create_new_block()


    # Visit a parse tree produced by Cobol85Parser#mergeStatement.
    def visitMergeStatement(self, ctx:Cobol85Parser.MergeStatementContext):
        # // merge statement

        # mergeStatement
        #    : MERGE fileName mergeOnKeyClause+ mergeCollatingSequencePhrase?
        #  mergeUsing* mergeOutputProcedurePhrase? mergeGivingPhrase*
        #    ;

        # mergeOnKeyClause
        #    : ON? (ASCENDING | DESCENDING) KEY? qualifiedDataName+
        #    ;

        # mergeCollatingSequencePhrase
        #    : COLLATING? SEQUENCE IS? alphabetName+ mergeCollatingAlphanumeric?
        #  mergeCollatingNational?
        #    ;

        # mergeCollatingAlphanumeric
        #    : FOR? ALPHANUMERIC IS alphabetName
        #    ;

        # mergeCollatingNational
        #    : FOR? NATIONAL IS? alphabetName
        #    ;

        # mergeUsing
        #    : USING fileName+
        #    ;

        # mergeOutputProcedurePhrase
        #    : OUTPUT PROCEDURE IS? procedureName mergeOutputThrough?
        #    ;

        # mergeOutputThrough
        #    : (THROUGH | THRU) procedureName
        #    ;

        # mergeGivingPhrase
        #    : GIVING mergeGiving+
        #    ;

        # mergeGiving
        #    : fileName (LOCK | SAVE | NO REWIND | CRUNCH | RELEASE | WITH REMOVE CRUNCH)?
        #    ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return

        source_variables, target_variables = self.collect_variables(ctx.getChildren(),
        [Cobol85Parser.MergeGivingPhraseContext])
        statement = self.create_and_push_statement([ctx],source_variables,
         target_variables,[], "merge")
        loop_guard = self.new_loopguard()
        self.current_block = loop_guard
        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block


        after_merge_block = self.new_block()
        self.add_exit(self.current_block, after_merge_block)



        output_procedure_from = None
        output_procedure_thru = None

        output_procedure_ctx  = ctx.mergeOutputProcedurePhrase()
        if output_procedure_ctx is not None:
            procedure_name_node = extract_given_context(output_procedure_ctx.procedureName(),
            [Cobol85Parser.SectionNameContext,Cobol85Parser.ParagraphNameContext])[0]
            output_procedure_from = (procedure_name_node.getText())
            merge_output_thru_ctx = output_procedure_ctx.mergeOutputThrough()
            if merge_output_thru_ctx is not None:
                procedure_name_node = extract_given_context(merge_output_thru_ctx.procedureName(),
                [Cobol85Parser.SectionNameContext,Cobol85Parser.ParagraphNameContext])[0]
                output_procedure_thru = (procedure_name_node.getText())


        # merge stmt to first statement of output_procedure_from
        if output_procedure_from is not None:
            procedure = self.get_procedure(output_procedure_from)
            procedure.link_first_statement.append(self.current_block)




        # last statement of output_procedure_thru to next block of merge
        if output_procedure_thru is not None:
            procedure = self.get_procedure(output_procedure_thru)
            procedure.link_last_statement.append(after_merge_block)
            # If thru is there, then paragraphs between from and thru must be linked
            self.link_paragraphs.append({'from': self.get_procedure(output_procedure_from),
             'thru': procedure})




        if output_procedure_from is not None and output_procedure_thru is None:
            # Without thru
            self.current_block = self.new_block()
            procedure = self.get_procedure(output_procedure_from)

            # loop guard is added to conditional stack
            self.conditional_scope_stack.append(loop_guard)
            self.visit(procedure.ctx)
            self.conditional_scope_stack.pop()
            self.add_exit(self.current_block, loop_guard, 'backward')

        self.current_block = after_merge_block



    # Visit a parse tree produced by Cobol85Parser#multiplyStatement.
    def visitMultiplyStatement(self, ctx:Cobol85Parser.MultiplyStatementContext):

        # // multiply statement

        # multiplyStatement
        #    : MULTIPLY (identifier | literal) BY (multiplyRegular | multiplyGiving)
        #  onSizeErrorPhrase? notOnSizeErrorPhrase? END_MULTIPLY?
        #    ;

        # multiplyRegular
        #    : multiplyRegularOperand+
        #    ;

        # multiplyRegularOperand
        #    : identifier ROUNDED?
        #    ;

        # multiplyGiving
        #    : multiplyGivingOperand GIVING multiplyGivingResult+
        #    ;

        # multiplyGivingOperand
        #    : identifier | literal
        #    ;

        # multiplyGivingResult
        #    : identifier ROUNDED?
        #    ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return


        text_ctx = []
        error_clause_ctxs = [Cobol85Parser.OnSizeErrorPhraseContext,
         Cobol85Parser.NotOnSizeErrorPhraseContext]
        for child in ctx.getChildren():
            if child != ctx.END_MULTIPLY() and type(child) not in error_clause_ctxs:
                text_ctx.append(child)



        source_variables, target_variables = self.collect_variables(ctx.children[3].getChildren(),
        [Cobol85Parser.MultiplyRegularOperandContext, Cobol85Parser.MultiplyGivingResultContext])
        source_variables_2, _ = self.collect_variables([ctx.children[1]],[])


        source_variables += source_variables_2


        statement = self.create_and_push_statement(text_ctx,source_variables,
         target_variables,[], "multiply")
        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block

        multiply_block = self.current_block

        after_multiply_block = self.new_block()
        self.add_exit(self.current_block, after_multiply_block)


        self.add_error_management_flow(ctx, multiply_block, after_multiply_block,
        error_clause_ctxs,
        ["OnSizeError", "NotOnSizeError"])

        self.current_block = after_multiply_block


    # Visit a parse tree produced by Cobol85Parser#performStatement.
    def visitPerformStatement(self, ctx:Cobol85Parser.PerformStatementContext):

        # // perform statement

        # performStatement
        #    : PERFORM (performInlineStatement | performProcedureStatement)
        #    ;



        # performProcedureStatement
        #    : procedureName ((THROUGH | THRU) procedureName)? performType?
        #    ;

        # performInlineStatement
        #    : performType? statement* END_PERFORM
        #    ;

        # performType
        #    : performTimes | performUntil | performVarying
        #    ;

        # performUntil
        #    : performTestClause? UNTIL condition
        #    ;

        # performTestClause
        #    : WITH? TEST (BEFORE | AFTER)
        #    ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return

        source_variables = []
        target_variables = []
        condition_variables = []
        procedure_from = None
        procedure_thru = None


        # extracting procedure names if perform type is performProcedureStatement
        if isinstance(ctx.children[1], Cobol85Parser.PerformProcedureStatementContext):
            procedure_names = []
            for child in ctx.children[1].getChildren():
                if isinstance(child, Cobol85Parser.ProcedureNameContext):
                    procedure_name_node = extract_given_context(child,
                    [Cobol85Parser.SectionNameContext,Cobol85Parser.ParagraphNameContext])[0]
                    procedure_names.append(procedure_name_node.getText())
            procedure_from = procedure_names[0]
            if len(procedure_names)>1:
                procedure_thru = procedure_names[1]


        perform_type_ctx = None
        for child in ctx.children[1].getChildren():
            if isinstance(child, Cobol85Parser.PerformTypeContext):
                perform_type_ctx = child
                break





        # Extracting variables used in the perform statement
        if perform_type_ctx is not None:
            perform_type_child_ctx = perform_type_ctx.children[0]

            if isinstance(perform_type_child_ctx, Cobol85Parser.PerformTimesContext):
                # performTimes
                #    : (identifier | integerLiteral) TIMES
                #    ;
                source_variables_temp, _ = self.collect_variables(
                    perform_type_child_ctx.getChildren(),[])
                source_variables+=source_variables_temp
            elif isinstance(perform_type_child_ctx, Cobol85Parser.PerformUntilContext):
                # performUntil
                #    : performTestClause? UNTIL condition
                #    ;
                _ , condition_variables_temp =\
                     self.collect_variables(perform_type_child_ctx.getChildren(),
                                            [Cobol85Parser.ConditionContext])
                condition_variables += condition_variables_temp

            else:
                # performVarying
                #    : performTestClause performVaryingClause |
                #  performVaryingClause performTestClause?
                #    ;

                # performVaryingClause
                #    : VARYING performVaryingPhrase performAfter*
                #    ;

                # performVaryingPhrase
                #    : (identifier | literal) performFrom performBy performUntil
                #    ;

                # performAfter
                #    : AFTER performVaryingPhrase
                #    ;

                # performFrom
                #    : FROM (identifier | literal | arithmeticExpression)
                #    ;

                # performBy
                #    : BY (identifier | literal | arithmeticExpression)
                #    ;
                perform_varying_phrase_nodes = extract_given_context(perform_type_child_ctx,
                 [Cobol85Parser.PerformVaryingPhraseContext])
                for perform_varying_phrase_ctx in perform_varying_phrase_nodes:
                    source_variables_temp, target_variables_temp =\
                         self.collect_variables(perform_varying_phrase_ctx.children[:3],
                         [Cobol85Parser.IdentifierContext])
                    source_variables+=source_variables_temp
                    target_variables+=target_variables_temp
                    _, condition_variables_temp = \
                        self.collect_variables([perform_varying_phrase_ctx.children[3]],
                     [Cobol85Parser.PerformUntilContext])
                    condition_variables+=condition_variables_temp

        # Extracting ctx that contain the appropriate perform statement text
        stmt_text_ctx = [ctx.children[0]] # "PERFORM"

        if isinstance(ctx.children[1], Cobol85Parser.PerformProcedureStatementContext):
            stmt_text_ctx.append(ctx.children[1])
        else:
            perform_inline_ctx = ctx.children[1]
            if isinstance(perform_inline_ctx.children[0], Cobol85Parser.PerformTypeContext):
                stmt_text_ctx.append(perform_inline_ctx.children[0])

        statement = self.create_and_push_statement(stmt_text_ctx, source_variables,
         target_variables, condition_variables,"perform")
        statement.procedure_info['from'] = procedure_from
        statement.procedure_info['thru'] = procedure_thru

        loop_guard = self.new_loopguard()
        self.current_block = loop_guard
        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block
        self.curr_loop_guard_stack.append(loop_guard)


        # New block for the body of the perform.
        perform_block = self.new_block()
        self.add_exit(self.current_block, perform_block, "iteration")



         # Block of code after the for loop.
        afterperform_block = self.new_block()
        self.add_exit(self.current_block, afterperform_block, "perform-exit")


        # linking procedures in case of performProcedureStatement
        if procedure_from is not None:
            procedure = self.get_procedure(procedure_from)
            procedure.link_first_statement.append(self.current_block)


        if procedure_thru  is not  None:

            procedure = self.get_procedure(procedure_thru)
            procedure.link_last_statement.append(self.current_block)
            self.link_paragraphs.append({'from': self.get_procedure(procedure_from),
             'thru': procedure})

        if procedure_from  is not  None and procedure_thru is None:
            # perform para statement
            self.current_block = self.new_block()
            procedure = self.get_procedure(procedure_from)

            # loop guard is added to conditional stack
            self.conditional_scope_stack.append(loop_guard)
            self.visit(procedure.ctx)
            self.conditional_scope_stack.pop()
            self.add_exit(self.current_block, loop_guard, 'backward')

        self.current_block = perform_block

        # In case of PerformInlineStatement

        if isinstance(ctx.children[1], Cobol85Parser.PerformInlineStatementContext):
            # performInlineStatement
            #    : performType? statement* END_PERFORM
            #    ;

            # Populate the body of the perform loop.
            for child in ctx.children[1].getChildren():
                if isinstance(child, Cobol85Parser.StatementContext):
                    self.visit(child)
            if not self.current_block.exits:
                # Did not encounter a break
                self.add_exit(self.current_block, loop_guard)

        # Continue building the CFG in the after-perform block.
        self.current_block = afterperform_block

        # Popping the current after loop stack,taking care of errors in case of
        #  nested for loops

        self.curr_loop_guard_stack.pop()



    # Visit a parse tree produced by Cobol85Parser#readStatement.
    def visitReadStatement(self, ctx:Cobol85Parser.ReadStatementContext):
        # // read statement

        # readStatement
        #    : READ fileName NEXT? RECORD? readInto? readWith? readKey?
        #  invalidKeyPhrase? notInvalidKeyPhrase? atEndPhrase? notAtEndPhrase? END_READ?
        #    ;

        # readInto
        #    : INTO identifier
        #    ;

        # readWith
        #    : WITH? ((KEPT | NO) LOCK | WAIT)
        #    ;

        # readKey
        #    : KEY IS? qualifiedDataName
        #    ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return


        text_ctx = []
        error_clause_ctxs = [Cobol85Parser.InvalidKeyPhraseContext,
         Cobol85Parser.NotInvalidKeyPhraseContext, Cobol85Parser.AtEndPhraseContext,
          Cobol85Parser.NotAtEndPhraseContext]
        for child in ctx.getChildren():
            if child != ctx.END_READ() and type(child) not in error_clause_ctxs:
                text_ctx.append(child)

        valid_children = []
        for child in ctx.getChildren():
            if type(child) not in [Cobol85Parser.InvalidKeyPhraseContext,
            Cobol85Parser.NotInvalidKeyPhraseContext,Cobol85Parser.AtEndPhraseContext,
            Cobol85Parser.NotAtEndPhraseContext]:
                valid_children.append(child)

        source_variables, target_variables = self.collect_variables(valid_children,
        [Cobol85Parser.ReadIntoContext])
        statement = self.create_and_push_statement(text_ctx,source_variables,
         target_variables,[], "read")
        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block

        read_block = self.current_block

        after_read_block = self.new_block()
        self.add_exit(self.current_block, after_read_block)


        self.add_error_management_flow(ctx, read_block, after_read_block,
        error_clause_ctxs,
        ["InvalidKey", "NotInvalidKey", "AtEnd", "NotAtEnd"])

        self.current_block = after_read_block




    # Visit a parse tree produced by Cobol85Parser#releaseStatement.
    def visitReleaseStatement(self, ctx:Cobol85Parser.ReleaseStatementContext):

        # releaseStatement
        #    : RELEASE recordName (FROM qualifiedDataName)?
        #    ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return

        source_variables, target_variables = self.collect_variables(ctx.getChildren(),
        [Cobol85Parser.RecordNameContext])
        statement = self.create_and_push_statement([ctx],source_variables,
         target_variables,[], "release")
        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block
        self.create_new_block()


    # Visit a parse tree produced by Cobol85Parser#rewriteStatement.
    def visitRewriteStatement(self, ctx:Cobol85Parser.RewriteStatementContext):

        # // rewrite statement

        # rewriteStatement
        #    : REWRITE recordName rewriteFrom? invalidKeyPhrase?
        #  notInvalidKeyPhrase? END_REWRITE?
        #    ;

        # rewriteFrom
        #    : FROM identifier
        #    ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return


        text_ctx = []
        error_clause_ctxs = [Cobol85Parser.InvalidKeyPhraseContext,
         Cobol85Parser.NotInvalidKeyPhraseContext]
        for child in ctx.getChildren():
            if child != ctx.END_REWRITE() and type(child) not in error_clause_ctxs:
                text_ctx.append(child)

        valid_children = []
        for child in ctx.getChildren():
            if type(child) not in [Cobol85Parser.InvalidKeyPhraseContext,
            Cobol85Parser.NotInvalidKeyPhraseContext]:
                valid_children.append(child)
        source_variables, target_variables = self.collect_variables(valid_children,
        [Cobol85Parser.RecordNameContext])
        statement = self.create_and_push_statement(text_ctx,source_variables,
        target_variables,[], "rewrite")

        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block

        rewrite_block = self.current_block

        after_rewrite_block = self.new_block()
        self.add_exit(self.current_block, after_rewrite_block)


        self.add_error_management_flow(ctx, rewrite_block, after_rewrite_block,
        error_clause_ctxs,
        ["InvalidKey", "NotInvalidKey"])

        self.current_block = after_rewrite_block

    # Visit a parse tree produced by Cobol85Parser#sendStatement.
    def visitSendStatement(self, ctx:Cobol85Parser.SendStatementContext):
        # // send statement
        # sendStatement
        #    : SEND (sendStatementSync | sendStatementAsync) onExceptionClause?
        #  notOnExceptionClause?
        #    ;

        # sendStatementSync
        #    : (identifier | literal) sendFromPhrase? sendWithPhrase?
        # sendReplacingPhrase? sendAdvancingPhrase?
        #    ;

        # sendStatementAsync
        #    : TO (TOP | BOTTOM) identifier
        #    ;

        # sendFromPhrase
        #    : FROM identifier
        #    ;

        # sendWithPhrase
        #    : WITH (EGI | EMI | ESI | identifier)
        #    ;

        # sendReplacingPhrase
        #    : REPLACING LINE?
        #    ;

        # sendAdvancingPhrase
        #    : (BEFORE | AFTER) ADVANCING? (sendAdvancingPage |
        #  sendAdvancingLines | sendAdvancingMnemonic)
        #    ;

        # sendAdvancingPage
        #    : PAGE
        #    ;

        # sendAdvancingLines
        #    : (identifier | literal) (LINE | LINES)?
        #    ;

        # sendAdvancingMnemonic
        #    : mnemonicName
        #    ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return


        text_ctx = []
        valid_children = []
        error_clause_ctxs = [Cobol85Parser.OnExceptionClauseContext,
         Cobol85Parser.NotOnExceptionClauseContext]
        for child in ctx.getChildren():
            if type(child) not in error_clause_ctxs:
                text_ctx.append(child)
                valid_children.append(child)

        source_variables, target_variables = self.collect_variables(valid_children,[])
        statement = self.create_and_push_statement(text_ctx,source_variables,
         target_variables,[], "send")

        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block

        send_block = self.current_block

        after_send_block = self.new_block()
        self.add_exit(self.current_block, after_send_block)


        self.add_error_management_flow(ctx, send_block, after_send_block,
        error_clause_ctxs,
        ["OnException", "NotOnException"])

        self.current_block = after_send_block

    # Visit a parse tree produced by Cobol85Parser#sortStatement.
    def visitSortStatement(self, ctx:Cobol85Parser.SortStatementContext):
        #     // sort statement

        # sortStatement
        #    : SORT fileName sortOnKeyClause+ sortDuplicatesPhrase?
        #  sortCollatingSequencePhrase? sortInputProcedurePhrase?
        # sortUsing* sortOutputProcedurePhrase? sortGivingPhrase*
        #    ;

        # sortOnKeyClause
        #    : ON? (ASCENDING | DESCENDING) KEY? qualifiedDataName+
        #    ;

        # sortDuplicatesPhrase
        #    : WITH? DUPLICATES IN? ORDER?
        #    ;

        # sortCollatingSequencePhrase
        #    : COLLATING? SEQUENCE IS? alphabetName+ sortCollatingAlphanumeric?
        # sortCollatingNational?
        #    ;

        # sortCollatingAlphanumeric
        #    : FOR? ALPHANUMERIC IS alphabetName
        #    ;

        # sortCollatingNational
        #    : FOR? NATIONAL IS? alphabetName
        #    ;

        # sortInputProcedurePhrase
        #    : INPUT PROCEDURE IS? procedureName sortInputThrough?
        #    ;

        # sortInputThrough
        #    : (THROUGH | THRU) procedureName
        #    ;

        # sortUsing
        #    : USING fileName+
        #    ;

        # sortOutputProcedurePhrase
        #    : OUTPUT PROCEDURE IS? procedureName sortOutputThrough?
        #    ;

        # sortOutputThrough
        #    : (THROUGH | THRU) procedureName
        #    ;

        # sortGivingPhrase
        #    : GIVING sortGiving+
        #    ;

        # sortGiving
        #    : fileName (LOCK | SAVE | NO REWIND | CRUNCH | RELEASE | WITH REMOVE CRUNCH)?
        #    ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return




        source_variables, target_variables = self.collect_variables(ctx.getChildren(),
        [Cobol85Parser.SortGivingPhraseContext])
        if len(target_variables) == 0:
            source_variables, target_variables = self.collect_variables(ctx.getChildren(),
            [Cobol85Parser.FileNameContext])
        statement = self.create_and_push_statement([ctx],source_variables,
        target_variables,[], "sort")
        loop_guard = self.new_loopguard()
        self.current_block = loop_guard
        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block

        after_sort_block = self.new_block()
        self.add_exit(self.current_block, after_sort_block)

        input_procedure_from = None
        input_procedure_thru = None

        input_procedure_ctx  = ctx.sortInputProcedurePhrase()
        if input_procedure_ctx  is not  None:
            procedure_name_node = extract_given_context(input_procedure_ctx.procedureName(),
            [Cobol85Parser.SectionNameContext,Cobol85Parser.ParagraphNameContext])[0]
            input_procedure_from = (procedure_name_node.getText())
            sort_input_thru_ctx = input_procedure_ctx.sortInputThrough()
            if sort_input_thru_ctx  is not  None:
                procedure_name_node = extract_given_context(sort_input_thru_ctx.procedureName(),
                [Cobol85Parser.SectionNameContext,Cobol85Parser.ParagraphNameContext])[0]
                input_procedure_thru = (procedure_name_node.getText())


        # sort stmt to first statement of input_procedure_from
        if input_procedure_from is not None:
            procedure = self.get_procedure(input_procedure_from)
            procedure.link_first_statement.append(self.current_block)



        # last statement of input_procedure_thru to sort stmt
        if input_procedure_thru is not None:
            procedure = self.get_procedure(input_procedure_thru)
            procedure.link_last_statement.append(self.current_block)
            self.link_paragraphs.append({'from': self.get_procedure(input_procedure_from),
             'thru': procedure})


        if input_procedure_from  is not  None and input_procedure_thru is None:
            # perform para statement
            self.current_block = self.new_block()
            procedure = self.get_procedure(input_procedure_from)

            # loop guard is added to conditional stack
            self.conditional_scope_stack.append(loop_guard)
            self.visit(procedure.ctx)
            self.conditional_scope_stack.pop()
            self.add_exit(self.current_block, loop_guard, 'backward')





        output_procedure_from = None
        output_procedure_thru = None

        output_procedure_ctx  = ctx.sortOutputProcedurePhrase()
        if output_procedure_ctx  is not  None:
            procedure_name_node = extract_given_context(output_procedure_ctx.procedureName(),
            [Cobol85Parser.SectionNameContext,Cobol85Parser.ParagraphNameContext])[0]
            output_procedure_from = (procedure_name_node.getText())
            sort_output_thru_ctx = output_procedure_ctx.sortOutputThrough()
            if sort_output_thru_ctx  is not  None:
                procedure_name_node = extract_given_context(sort_output_thru_ctx.procedureName(),
                [Cobol85Parser.SectionNameContext,Cobol85Parser.ParagraphNameContext])[0]
                output_procedure_thru = (procedure_name_node.getText())

        self.current_block = loop_guard
        # sort stmt to first statement of output_procedure_from
        if output_procedure_from is not None:
            procedure = self.get_procedure(output_procedure_from)
            procedure.link_first_statement.append(self.current_block)




        # last statement of output_procedure_thru to next block of sort
        if output_procedure_thru is not None:
            procedure = self.get_procedure(output_procedure_thru)
            procedure.link_last_statement.append(after_sort_block)
            self.link_paragraphs.append({'from': self.get_procedure(output_procedure_from),
             'thru': procedure})




        if output_procedure_from  is not  None and output_procedure_thru is None:
            # Without thru
            self.current_block = self.new_block()
            procedure = self.get_procedure(output_procedure_from)

            # loop guard is added to conditional stack
            self.conditional_scope_stack.append(loop_guard)
            self.visit(procedure.ctx)
            self.conditional_scope_stack.pop()
            self.add_exit(self.current_block, loop_guard, 'backward')

        self.current_block = after_sort_block



    # Visit a parse tree produced by Cobol85Parser#stopStatement.
    def visitStopStatement(self, ctx:Cobol85Parser.StopStatementContext):


        # // stop statement

        # stopStatement
        #    : STOP (RUN | literal)
        #    ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return

        source_variables, target_variables = self.collect_variables(ctx.getChildren(),[])
        statement = self.create_and_push_statement([ctx],source_variables, target_variables,[],
         "stop")
        self.add_statement(self.current_block, statement)
        # self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block

        self.current_block = self.new_block()
        self.stop_run_found = True


    # Visit a parse tree produced by Cobol85Parser#subtractStatement.
    def visitSubtractStatement(self, ctx:Cobol85Parser.SubtractStatementContext):
        # // subtract statement

        # subtractStatement
        #    : SUBTRACT (subtractFromStatement | subtractFromGivingStatement |
        #  subtractCorrespondingStatement) onSizeErrorPhrase? notOnSizeErrorPhrase?
        #  END_SUBTRACT?
        #    ;

        # subtractFromStatement
        #    : subtractSubtrahend+ FROM (subtractMinuend)+
        #    ;

        # subtractFromGivingStatement
        #    : subtractSubtrahend+ FROM subtractMinuendGiving GIVING (subtractGiving)+
        #    ;

        # subtractCorrespondingStatement
        #    : (CORRESPONDING | CORR) qualifiedDataName FROM subtractMinuendCorresponding
        #    ;

        # subtractSubtrahend
        #    : identifier | literal
        #    ;

        # subtractMinuend
        #    : identifier ROUNDED?
        #    ;

        # subtractMinuendGiving
        #    : identifier | literal
        #    ;

        # subtractGiving
        #    : identifier ROUNDED?
        #    ;

        # subtractMinuendCorresponding
        #    : qualifiedDataName ROUNDED?
        #    ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return


        text_ctx = []
        error_clause_ctxs = [Cobol85Parser.OnSizeErrorPhraseContext,
        Cobol85Parser.NotOnSizeErrorPhraseContext]
        for child in ctx.getChildren():
            if child != ctx.END_SUBTRACT() and type(child) not in error_clause_ctxs:
                text_ctx.append(child)



        source_variables, target_variables = self.collect_variables(
            ctx.children[1].getChildren(), [Cobol85Parser.SubtractMinuendContext,
            Cobol85Parser.SubtractGivingContext,
             Cobol85Parser.SubtractMinuendCorrespondingContext])
        statement =  self.create_and_push_statement([ctx], source_variables,
         target_variables, [], "subtract")


        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block

        subtract_block = self.current_block

        after_subtract_block = self.new_block()
        self.add_exit(self.current_block, after_subtract_block)


        self.add_error_management_flow(ctx, subtract_block, after_subtract_block,
        error_clause_ctxs,
        ["OnSizeError", "NotOnSizeError"])

        self.current_block = after_subtract_block


    # Visit a parse tree produced by Cobol85Parser#ifStatement.
    def visitIfStatement(self, ctx:Cobol85Parser.IfStatementContext):
        # // if statement

        # ifStatement
        #    : IF condition ifThen ifElse? END_IF?
        #    ;

        # ifThen
        #    : THEN? (NEXT SENTENCE | statement*)
        #    ;

        # ifElse
        #    : ELSE (NEXT SENTENCE | statement*)
        #    ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return

        _, condition_variables = self.collect_variables(ctx.getChildren(),
         [Cobol85Parser.ConditionContext])
        if_stmt = self.create_and_push_statement([ctx.children[0], ctx.children[1]],
         [], [], condition_variables, "if")


        if_then_ctx =  ctx.ifThen()
        if_else_ctx = ctx.ifElse()

        self.add_statement(self.current_block, if_stmt)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(if_stmt)
        self.statements_dict[ctx] = self.current_block
        self.conditional_scope_stack.append(self.current_block)
        if_block = self.new_block()


        self.add_exit(self.current_block, if_block, "true")

        # Create a block for the code after the if-else.
        after_if_block = self.new_block()

        else_block = self.new_block()

        if if_else_ctx is not None:
            # Else exit
            self.add_exit(self.current_block, else_block, "false")
        else:
            self.add_exit(self.current_block, after_if_block, "false")


        # Visit children to populate the if block.
        self.current_block = if_block

        if if_then_ctx.NEXT() is not None:
            self.create_next_statement_block()
        else:
            self.visitChildren(if_then_ctx)
            if not self.current_block.exits:
                self.add_exit(self.current_block, after_if_block)

        if if_else_ctx is not None:
            self.current_block = else_block
            if if_else_ctx.NEXT() is not None:
                self.create_next_statement_block()
            else:
                # Visit the children in the body of the else to populate the block.
                self.visitChildren(if_else_ctx)
                # If encountered a break, exit will have already been added
                if not self.current_block.exits:
                    self.add_exit(self.current_block, after_if_block)

        self.conditional_scope_stack.pop()
        # Continue building the CFG in the after-if block.
        self.current_block = after_if_block

    # Visit a parse tree produced by Cobol85Parser#unstringStatement.
    def visitUnstringStatement(self, ctx:Cobol85Parser.UnstringStatementContext):
        # // unstring statement

        # unstringStatement
        #    : UNSTRING unstringSendingPhrase unstringIntoPhrase unstringWithPointerPhrase?
        #  unstringTallyingPhrase? onOverflowPhrase? notOnOverflowPhrase? END_UNSTRING?
        #    ;

        # unstringSendingPhrase
        #    : identifier (unstringDelimitedByPhrase unstringOrAllPhrase*)?
        #    ;

        # unstringDelimitedByPhrase
        #    : DELIMITED BY? ALL? (identifier | literal)
        #    ;

        # unstringOrAllPhrase
        #    : OR ALL? (identifier | literal)
        #    ;

        # unstringIntoPhrase
        #    : INTO unstringInto+
        #    ;

        # unstringInto
        #    : identifier unstringDelimiterIn? unstringCountIn?
        #    ;

        # unstringDelimiterIn
        #    : DELIMITER IN? identifier
        #    ;

        # unstringCountIn
        #    : COUNT IN? identifier
        #    ;

        # unstringWithPointerPhrase
        #    : WITH? POINTER qualifiedDataName
        #    ;

        # unstringTallyingPhrase
        #    : TALLYING IN? qualifiedDataName
        #    ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return

        text_ctx = []
        valid_children = []
        error_clause_ctxs = [Cobol85Parser.OnOverflowPhraseContext,
         Cobol85Parser.NotOnOverflowPhraseContext]
        for child in ctx.getChildren():
            if child != ctx.END_UNSTRING() and type(child) not in error_clause_ctxs:
                text_ctx.append(child)
                valid_children.append(child)


        source_variables, target_variables = self.collect_variables(valid_children,
         [Cobol85Parser.UnstringIntoPhraseContext,
         Cobol85Parser.UnstringWithPointerPhraseContext,
         Cobol85Parser.UnstringTallyingPhraseContext])
        statement = self.create_and_push_statement(text_ctx, source_variables,
         target_variables, [], "unstring")

        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block
        unstring_block = self.current_block

        after_unstring_block = self.new_block()
        self.add_exit(self.current_block, after_unstring_block)


        self.add_error_management_flow(ctx, unstring_block, after_unstring_block,
        error_clause_ctxs,
        ["OnOverflow", "NotOnOverflow"])

        self.current_block = after_unstring_block



    # Visit a parse tree produced by Cobol85Parser#closeStatement.
    def visitCloseStatement(self, ctx:Cobol85Parser.CloseStatementContext):


        #         // close statement

        # closeStatement
        # : CLOSE closeFile+
        # ;

        # closeFile
        # : fileName (closeReelUnitStatement | closeRelativeStatement |
        #  closePortFileIOStatement)?
        # ;

        # closeReelUnitStatement
        # : (REEL | UNIT) (FOR? REMOVAL)? (WITH? (NO REWIND | LOCK))?
        # ;

        # closeRelativeStatement
        # : WITH? (NO REWIND | LOCK)
        # ;

        # closePortFileIOStatement
        # : (WITH? NO WAIT | WITH WAIT) (USING closePortFileIOUsing+)?
        # ;

        # closePortFileIOUsing
        # : closePortFileIOUsingCloseDisposition | closePortFileIOUsingAssociatedData |
        #  closePortFileIOUsingAssociatedDataLength
        # ;

        # closePortFileIOUsingCloseDisposition
        # : CLOSE_DISPOSITION OF? (ABORT | ORDERLY)
        # ;

        # closePortFileIOUsingAssociatedData
        # : ASSOCIATED_DATA (identifier | integerLiteral)
        # ;

        # closePortFileIOUsingAssociatedDataLength
        # : ASSOCIATED_DATA_LENGTH OF? (identifier | integerLiteral)
        # ;
        if ctx in self.statements_dict:
            self.current_block = self.statements_dict[ctx]
            return


        source_variables, target_variables = self.collect_variables(ctx.getChildren(), [])
        statement = self.create_and_push_statement([ctx], source_variables,
         target_variables, [], "close")
        self.add_statement(self.current_block, statement)
        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(statement)
        self.statements_dict[ctx] = self.current_block
        self.create_new_block()



    # Visit a parse tree produced by Cobol85Parser#paragraph.
    def visitParagraph(self, ctx:Cobol85Parser.ParagraphContext):
        #     paragraph
        #    : paragraphName DOT_FS (alteredGoTo | sentence*)
        #    ;
        #     sentence
        #    : statement* DOT_FS
        #    ;
        paragraph_name = ctx.children[0].getText()

        if ctx in self.statements_dict:
            self.add_exit(self.current_block,self.statements_dict[ctx])

            self.current_block = self.statements_dict[ctx]
        else:

            statement = self.create_and_push_statement([ctx.children[0],
             ctx.children[1]], [], [], [], "paragraphName")

            self.add_statement(self.current_block, statement)

            paragraph = self.get_procedure(paragraph_name)
            paragraph.block = self.current_block
            self.current_paragraph = paragraph
            self.append_to_procedure(self.current_block)
            self.add_parent_context_blocks(statement)
            self.statements_dict[ctx] = self.current_block

            self.create_new_block()

        paragraph = self.get_procedure(paragraph_name)
        self.current_paragraph = paragraph
        # visit sentences
        for child in ctx.getChildren():
            if isinstance(child, Cobol85Parser.SentenceContext):
                self.visitChildren(child)
        self.current_paragraph = None
        if self.stop_run_found:
            self.current_block = self.new_block()

    # Visit a parse tree produced by Cobol85Parser#sentence.
    def visitSentence(self, ctx:Cobol85Parser.SentenceContext):
        #     sentence
        #    : statement* DOT_FS
        #    ;
        if len(self.next_sentence_stack) != 0:

            self.add_exit(self.next_sentence_stack[-1], self.current_block,'next sentence')
            self.next_sentence_stack.pop()

        return self.visitChildren(ctx)


    # override
    # Visit a parse tree produced by Cobol85Parser#procedureSection.
    def visitProcedureSection(self, ctx:Cobol85Parser.ProcedureSectionContext):
        #     procedureSection
        #    : procedureSectionHeader DOT_FS paragraphs
        #    ;
        # procedureSectionHeader
        #    : sectionName SECTION integerLiteral?
        #    ;


        section_statement = self.create_and_push_statement([ctx.children[0]], [], [], [],
         "sectionHeader")
        section_name = (ctx.children[0].children[0]).getText()
        self.add_statement(self.current_block, section_statement)
        section = self.get_procedure(section_name)
        section.block = self.current_block
        self.current_section = section

        self.append_to_procedure(self.current_block)
        self.add_parent_context_blocks(section_statement)
        self.statements_dict[ctx] = self.current_block
        self.create_new_block()

        self.visitChildren(ctx.children[2]) # visit paragraphs

        self.current_section = None
