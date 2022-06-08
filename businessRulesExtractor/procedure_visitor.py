"""
This module contains classes used to extract information on
procedures(paragraphs/sections) present in the
COBOL program.

This module contains classes:
* Procedure: represents a procedure
"""
from .antlr_py.Cobol85Parser import Cobol85Parser
from .antlr_py.Cobol85Visitor import Cobol85Visitor


class Procedure:
    """
    A class used to represent a COBOL procedure

    ...

    Attributes
    ----------
    name :  str
        the name of the procedure

    block : Block
        the CFG block of the procedure label

    statement_blocks : arr
        the CFG blocks of statements present in the procedure

    link_first_statement : arr
        the blocks to be linked to first statement of the procedure

    link_last_statement : arr
        the blocks to be linked with the last statement of the procedure

    type : str
        the type of the procedure (section/paragraph)

    paragraphs : arr
        paragraphs present if procedure is a section

    ctx : ctx
        the AST node ctx of the procedure

    """
    def __init__(self, name, type, ctx):
        self.name =  name
        self.block = None
        self.statement_blocks = []
        self.link_first_statement = [] # link blocks in list to first statement
        self.link_last_statement = [] # link last statement to blocks in list
        self.paragraphs = [] # incase of sections
        self.type = type
        self.ctx = ctx

class ProcedureVisitor(Cobol85Visitor):
    """
    Procedure Visitor for the COBOL program

    It is used to extract information on
    procedures(paragraphs/sections) present in the
    COBOL program.

    ...

    Attributes
    ----------

    procedures : dict
        A dictionary to store all procedures in the program

    current_section: Procedure
        The current section being processed

    paragraph_list: arr
        List of all paragraphs present in the COBOL program

    section_list: arr
        List of all paragraphs present in the COBOL program


    """


    def __init__(self):
        super().__init__()
        self.procedures = {}
        self.current_section = None
        self.paragraph_list = []
        self.section_list = []

    def get_procedures(self, tree):
        """
            Extracts procedures (paragraphs/section) present in the input COBOL program

            Args:
            tree: AST of COBOL

            Returns:
            Data on procedures
        """
        self.visit(tree)
        return self.procedures, self.paragraph_list, self.section_list



    # Visit a parse tree produced by Cobol85Parser#paragraph.
    def visitParagraph(self, ctx:Cobol85Parser.ParagraphContext):
        #     paragraph
        #    : paragraphName DOT_FS (alteredGoTo | sentence*)
        #    ;
        #     sentence
        #    : statement* DOT_FS
        #    ;

        paragraph_name = ctx.children[0].getText()
        self.procedures[paragraph_name] = Procedure(paragraph_name,'paragraph', ctx)
        self.paragraph_list.append(self.procedures[paragraph_name])
        if self.current_section is not None:
            self.current_section.paragraphs.append(self.procedures[paragraph_name])


    # override
    # Visit a parse tree produced by Cobol85Parser#procedureSection.
    def visitProcedureSection(self, ctx:Cobol85Parser.ProcedureSectionContext):
        #     procedureSection
        #    : procedureSectionHeader DOT_FS paragraphs
        #    ;
        # procedureSectionHeader
        #    : sectionName SECTION integerLiteral?
        #    ;


        section_name = (ctx.children[0].children[0]).getText()

        self.procedures[section_name] = Procedure(section_name, 'section', ctx)
        self.section_list.append(self.procedures[section_name])
        self.current_section = self.procedures[section_name]

        self.visitChildren(ctx.children[2]) # visit paragraphs

        self.current_section = None
