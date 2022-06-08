"""
This module contains utility methods for AST processing

"""

from .antlr_py.Cobol85Parser import Cobol85Parser

def extract_identifiers(ctx):
    """
    Extracts identifier AST nodes present in the given tree

    Args:
        ctx: root of the input AST

    Returns:
        list of identifier nodes
    """
    if type(ctx) in [Cobol85Parser.IdentifierContext, Cobol85Parser.FileNameContext, Cobol85Parser.QualifiedDataNameContext]:
        return [ctx.getText()]

    identifiers = []
    try:
        for child in ctx.getChildren():
            ids = extract_identifiers(child)
            identifiers = identifiers + ids
    except:
        pass
    return identifiers

def extract_given_context(ctx, types):
    """
    Extracts  AST nodes of given types present in the given tree

    Args:
        ctx: root of the input AST
        types: given AST node types

    Returns:
        list of nodes of the given types
    """
    if type(ctx) in types:
        return [ctx]

    nodes = []
    try:
        for child in ctx.getChildren():
            _nodes = extract_given_context(child, types)
            nodes = nodes + _nodes
    except:
        pass
    return nodes


def get_tokens(ctx):
    """
    Extracts list of tokens from given AST

    Args:
        ctx: root of the input AST

    Returns:
        list of tokens
    """
    tokens = []
    try:
        for child in ctx.getChildren():
            child_tokens = get_tokens(child)
            tokens = tokens + child_tokens
    except:
        # Terminal Node
        tokens = [ctx.getText()]

    return tokens