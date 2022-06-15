# COBREX-CLI

This repository contains source code of the CLI tool for COBREX.
COBREX is a tool for building Control Flow Graph(CFG) and extracting Business Rules from COBOL programs.


# Setup Guidelines
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

