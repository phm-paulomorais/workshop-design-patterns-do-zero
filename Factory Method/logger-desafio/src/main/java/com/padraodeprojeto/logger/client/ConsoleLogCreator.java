package com.padraodeprojeto.logger.client;

import com.padraodeprojeto.logger.Logger;
import com.padraodeprojeto.logprinter.LogPrinter;
import com.padraodeprojeto.logprinter.impl.ConsoleLogPrinter;

public class ConsoleLogCreator extends Logger {
	

	@Override
	public LogPrinter createLogger() {
	
		return new ConsoleLogPrinter();
	}

}
