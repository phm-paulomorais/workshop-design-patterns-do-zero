package com.padraodeprojetos.aplicacao;

import com.padraodeprojetos.logger.Logger;
import com.padraodeprojetos.logger.client.ConsoleLogCreator;
import com.padraodeprojetos.logger.client.FileLogCreator;

public class AplicacaoMain {

	public static void main(String[] args) {
		
		//Logger logger = new ConsoleLogCreator();
		
		Logger logger = new FileLogCreator("logger.txt");
		
		CalculadoraDeImpostos calcDeImpostos = new CalculadoraDeImpostos(logger);
		
		calcDeImpostos.calcular(32);

	}

}
