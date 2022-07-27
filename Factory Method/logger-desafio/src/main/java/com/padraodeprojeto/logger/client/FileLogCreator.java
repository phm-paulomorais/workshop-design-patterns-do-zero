package com.padraodeprojeto.logger.client;

import com.padraodeprojeto.logger.Logger;
import com.padraodeprojeto.logprinter.LogPrinter;
import com.padraodeprojeto.logprinter.impl.FileLogPrinter;

public class FileLogCreator extends Logger {
	
	private String fileName;
	
	public FileLogCreator(String nomeArquivo) {
	    this.fileName = nomeArquivo;
    }


	@Override
	protected LogPrinter createLogger() {
		return new FileLogPrinter(this.getFileName());
	}


	public String getFileName() {
		return fileName;
	}

}
