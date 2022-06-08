"""
This module contains a class used to perform static analysis
on the input COBOL program.
It is used to construct CFG and identify Business Rules

This module contains:
* COBOLAnalyzer: represents a COBOL analyzer
"""

from .data_division import BRDataDivision
from .cobol_cfg import CFGBuilder

class COBOLAnalyzer(BRDataDivision, CFGBuilder):
    """
    A class used to perform static analysis on the COBOL program

    ...

    Attributes
    ----------

    variables : dict
        A dictionary to store all variables in the COBOL program

    statements : arr
        List of all statements in the COBOL program

    business_variables : set
        set of all business variables present in the COBOL program

    procedures :  {}
        All procedures present in the COBOL program

    paragraph_list : []
        All paragraphs present in the COBOL program

    section_list : []
        All sections present in the COBOL program
    """
    def __init__(self, procedures, paragraph_list, section_list):
        BRDataDivision.__init__(self)
        CFGBuilder.__init__(self)


        self.variables = {}
        self.statements = []
        self.business_variables = set()
        self.procedures =  procedures
        self.paragraph_list = paragraph_list
        self.section_list = section_list
