package com.padraodeprojetos.logprinter.impl;

import com.padraodeprojetos.logprinter.LogPrinter;

public class ConsoleLogPrinter implements LogPrinter {

	public void print(String message) {
		System.out.println(message);
	}

}
