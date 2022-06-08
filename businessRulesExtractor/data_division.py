"""
    This module contains classes and code used to identify and store
    the variables present in the data division of the input COBOL program

    This module contains two classes:
    * Variable: represents a COBOL variable
    * BRDataDivision: Contains attributes and methods identify and store
    the variables present in the data division of the input COBOL program
"""

from .antlr_py.Cobol85Parser import Cobol85Parser
from .antlr_py.Cobol85Visitor import Cobol85Visitor

class Variable:
    """
    A class used to represent a COBOL statement

    ...

    Attributes
    ----------

    levelnb : int
        the level number of the COBOL variable

    name : str
        the name of the variable

    parent : Variable
        the parent variable

    children : arr
        the children variables

    statements : arr
        the statements that use the variable

    statement_blocks : arr
        the CFG blocks consisting the statements of the variable

    """
    def __init__(self, levelnb, name, parent):
        self.levelnb = levelnb
        self.name = name
        self.parent = parent
        self.children = []
        self.statements = []
        self.statement_blocks = []

class BRDataDivision(Cobol85Visitor):
    """
    A class used to identify and store
    the variables present in the data division of the input COBOL program

    ...

    Attributes
    ----------

    parents: arr
        a stack to keep track of parent variables
    """
    def __init__(self):
        super().__init__()
        self.parents = []


    # override
    # Visit a parse tree produced by Cobol85Parser#dataDescriptionEntryFormat1.
    def visitDataDescriptionEntryFormat1(self,
     ctx:Cobol85Parser.DataDescriptionEntryFormat1Context):
        levelnb = ctx.children[0].getText()
        name = ctx.children[1].getText()
        if levelnb == '77':
            self.parents = []
            self.variables[name] = (Variable(levelnb, name, None))
        else:
            # Remove variables that are not parents
            # The level number of parent is lesser than the child
            while len(self.parents) != 0 and self.parents[-1].levelnb >= levelnb:
                self.parents.pop()

            if len(self.parents) == 0:
                temp = Variable(levelnb, name, None)
                self.variables[name] = temp
                self.parents.append(temp)
            else:
                temp = Variable(levelnb, name, self.parents[-1])
                self.parents[-1].children.append(temp)
                self.variables[name] = (temp)
                self.parents.append(temp)

        return self.visitChildren(ctx)
