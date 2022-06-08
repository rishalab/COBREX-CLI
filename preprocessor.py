"""
This module contains functions for preprocessing the COBOL program
"""

import subprocess
import os


def run_proleap_preprocessor():

    """
    Function to run the proleap preprocessor
    """
    print("running proleap preprocessor")
    p = subprocess.Popen(['/bin/sh', '-c', "mvn exec:java -D\"exec.mainClass\"=\"com.example.App\" -D\"exec.args\"=\"input/clean_output.cbl\""])
    p.wait()


def clean_file(file_name):
    """
    Function to clean the output of preprocessing by cobc
    """


    with open(os.path.join('clean_output.cbl'),'w') as wp:


        with open(file_name) as fp:
            line = fp.readline()


            while line:

                if len(line.strip())!=0 and "#" not in line.strip().split()[0]:

                    wp.write(line)
                line = fp.readline()



def preprocess(input_file_name ):
    """
    Preprocessing the cobol file using cobc and proleap preprocessor
    """

    p = subprocess.Popen(["cobc","-std=cobol85", "-E","-o", "output.i", input_file_name])

    p.wait()

    clean_file(os.path.join("./","output.i"))
    os.remove("output.i")
    # Uncomment below line if proleap preprocessor is running
    # run_proleap_preprocessor()
