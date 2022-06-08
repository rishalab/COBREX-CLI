"""
This module contains functions used by flask server to extract business rules,
convert json to dot format, and generating graph file
"""
import os
import sys
import pandas as pd
from preprocessor import preprocess
from businessRulesExtractor.main import extractor
import graphviz as gv
import shutil
from pathlib import Path




def extract_business_rules(file_path):
    """
    Function to extract business rules from the COBOL file
    """
    file_path = Path(file_path)

    if not file_path.exists():
        print("Oops, file doesn't exist!")

    file_name = file_path.stem


    preprocess(file_path)

    # subprocess.run(['cp', './preprocessor_proleap/output/preprocessed.cbl', './preprocessed_files/'+sub_directory+'/'+file_name])
    preprocessed_file_path = os.path.join('clean_output.cbl')

    cfg_json, br_json =  extractor(preprocessed_file_path,file_name, 'output')
    os.remove("clean_output.cbl")
    return cfg_json, br_json


def graph_json_to_dot(graph_json, format):
    """
    Function to convert graph in json format to dot format
    """

    graph = gv.Digraph(name='cluster', format=format)

    for node in graph_json['nodes']:

        if 'type' in node.keys() and node['type'] == 'input':
            graph.attr('node', shape='diamond', style='filled', color='lightgrey')
            graph.node(node['id'], label=node['data']['label'])
        else:
            graph.attr('node', shape='box', style='filled', color='lightblue')
            graph.node(node['id'], label=node['data']['label'])

    for edge in graph_json['edges']:
        graph.edge(edge['source'], edge['target'], edge['label'])


    return graph


def generate_graph_file(graph_json, format, filepath, export_path):
    """
    Function to generate graph visualized files for the input graph present in json format
    """

    if not os.path.isdir(export_path):

        os.mkdir(export_path)
    else:

        shutil.rmtree(export_path) #done so that all previous files are deleted
        os.mkdir(export_path)

    graph = graph_json_to_dot(graph_json, format)

    graph.render(filename=filepath, view=False, cleanup=True)







if __name__ == '__main__':
    try:
        file_name = sys.argv[1]
    except:
        file_name = "./tests/DIVIDE.cbl"

    extract_business_rules(file_name)
