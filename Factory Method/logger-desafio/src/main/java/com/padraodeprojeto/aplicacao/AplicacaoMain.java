package com.padraodeprojeto.aplicacao;

import com.padraodeprojeto.logger.Logger;
import com.padraodeprojeto.logger.client.ConsoleLogCreator;
import com.padraodeprojeto.logger.client.FileLogCreator;

public class AplicacaoMain {

	public static void main(String[] args) {
		
		//Logger logger = new ConsoleLogCreator();
		
		Logger logger = new FileLogCreator("logger.txt");
		
		CalculadoraDeImpostos calcDeImpostos = new CalculadoraDeImpostos(logger);
		
		calcDeImpostos.calcular(32);

	}

}
