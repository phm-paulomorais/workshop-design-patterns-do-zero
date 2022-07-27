package com.padraodeprojeto.logger;

import java.util.Date;

import com.padraodeprojeto.logprinter.LogPrinter;

public abstract class Logger {
	
	protected abstract LogPrinter createLogger();
	
	public final void log(String message) {
		
		System.out.println(new Date().toString());
		
		LogPrinter logger = createLogger();
		
		logger.print(message);
		
	}

}
