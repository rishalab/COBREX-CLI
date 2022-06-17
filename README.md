# COBREX
## What is COBREX?
COBREX is a tool for building the Control Flow Graph (CFG) of an input COBOL program and extracting the embedded business rules. COBREX outputs the CFG as well as the business rules in JSON and PDF format. 

## Features of COBREX:
1. Constructs Control Flow Graph (CFG) of the input COBOL program.
2. Extracts the business rules embedded in the input COBOL program.
3. COBREX outputs the CFG as well as the business rules in four files. The table below lists the output files and their descriptions.

| File Name               | Description                                                  |
|-------------------------|--------------------------------------------------------------|
| input_filename_CFG.json | Constructed CFG in JSON format                               |
| input_filename_CFG.pdf  | Constructed CFG visualized and stored in PDF format          |
| input_filename_BRs.json | Extracted business rules in JSON format                      |
| input_filename_BRs.pdf  | Extracted business rules visualized and stored in PDF format |

## Uses of COBREX:
The business logic incorporated in the source code is known as business rules. Understanding these business rules can aid with source code comprehension. An essential stage in legacy system migration is extracting business rules from existing COBOL systems. To this end, we present COBREX, an open-source tool for building the CFG of an input COBOL program and extracting the embedded business rules.

COBOL developers can use COBREX to extract business rules of a COBOL program and can analyze the extracted business rules to comprehend the COBOL program.

These extracted business rules can also aid COBOL developers in bug location and resolution in turn helping them in maintenance of COBOL legacy systems.

## Working of COBREX:
COBREX has been developed using Python using the following approach:
![Approach diagram](COBREX-approach)

## Setup Guidelines
1. Clone or download this github repository.

2. Get into the main directory:
```bash
cd COBREX-CLI
```

3. Install the requirements:
```bash
pip install -r requirements.txt
```

4. Install [GnuCOBOL](https://gnucobol.sourceforge.io)
5. Install [Graphviz](https://graphviz.org/download/)
6. Run main.py:
```bash
python3 extractor.py input_cobol_file_path
```


The output files will be placed in output folder in root directory.

