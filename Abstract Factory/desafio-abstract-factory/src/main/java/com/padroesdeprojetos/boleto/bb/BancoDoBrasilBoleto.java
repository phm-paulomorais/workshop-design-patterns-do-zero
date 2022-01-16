package com.padroesdeprojetos.boleto.bb;

import com.padroesdeprojetos.boleto.Boleto;

public class BancoDoBrasilBoleto implements Boleto {

	public void emitir() {
		System.out.println("Emitindo boleto do Banco do Brasil");
	}

}
