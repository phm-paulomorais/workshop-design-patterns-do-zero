package com.padraodeprojeto.boleto.bb;

import com.padraodeprojeto.boleto.Boleto;

public class BancoDoBrasilBoleto implements Boleto {

	public void emitir() {
		System.out.println("Emitindo boleto do Banco do Brasil");
	}

}
