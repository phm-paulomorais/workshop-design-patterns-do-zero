package com.padraodeprojetos.logger.client;

import com.padraodeprojetos.logger.Logger;
import com.padraodeprojetos.logprinter.LogPrinter;
import com.padraodeprojetos.logprinter.impl.FileLogPrinter;

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
