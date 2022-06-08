package com.example;

import java.io.File;
import java.io.FileWriter;

import java.io.IOException;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        
        
        final io.proleap.cobol.asg.params.impl.CobolParserParamsImpl params = new io.proleap.cobol.asg.params.impl.CobolParserParamsImpl();
        
		params.setFormat(io.proleap.cobol.preprocessor.CobolPreprocessor.CobolSourceFormatEnum.TANDEM);

		File inputFile = new File(args[0]);
		final String preProcessedInput = new io.proleap.cobol.preprocessor.impl.CobolPreprocessorImpl().process(inputFile, params);
        

        FileWriter outputFile = new FileWriter("output/preprocessed.cbl");
        outputFile.write(preProcessedInput);
        outputFile.close();
    }
}
