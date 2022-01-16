package com.padroesdeprojetos.boleto.cef;

import com.padroesdeprojetos.boleto.Boleto;

public class CEFBoleto implements Boleto {

	public void emitir() {
		System.out.println("Emitindo boleto da Caixa Econômica Federal (CEF)");
	}

}
