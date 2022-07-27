package com.padraodeprojeto.boleto.cef;

import com.padraodeprojeto.boleto.Boleto;

public class CEFBoleto implements Boleto {

	public void emitir() {
		System.out.println("Emitindo boleto da Caixa Econômica Federal (CEF)");
	}

}
