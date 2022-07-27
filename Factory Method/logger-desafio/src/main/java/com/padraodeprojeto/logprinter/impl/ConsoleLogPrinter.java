package com.padraodeprojeto.logprinter.impl;

import com.padraodeprojeto.logprinter.LogPrinter;

public class ConsoleLogPrinter implements LogPrinter {

	public void print(String message) {
		System.out.println(message);
	}

}
