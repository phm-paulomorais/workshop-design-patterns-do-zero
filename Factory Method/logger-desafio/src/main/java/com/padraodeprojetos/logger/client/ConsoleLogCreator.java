package com.padraodeprojetos.logger.client;

import com.padraodeprojetos.logger.Logger;
import com.padraodeprojetos.logprinter.LogPrinter;
import com.padraodeprojetos.logprinter.impl.ConsoleLogPrinter;

public class ConsoleLogCreator extends Logger {
	

	@Override
	public LogPrinter createLogger() {
	
		return new ConsoleLogPrinter();
	}

}
