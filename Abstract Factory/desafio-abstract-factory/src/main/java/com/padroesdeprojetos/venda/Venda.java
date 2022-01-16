package com.padroesdeprojetos.venda;

import com.padroesdeprojetos.boleto.Boleto;
import com.padroesdeprojetos.notafiscal.NotaFiscal;

public class Venda {
	
	
	private NotaFiscal nfe;
	private Boleto boleto;
	
	public Venda(ModuloVendaFactory lojaFactory) {
		this.nfe = lojaFactory.criarNotaFiscalEletronica();
		this.boleto = lojaFactory.criarBoleto();
	}
	
	
	public void realizar() {
		this.nfe.gerar();
		this.boleto.emitir();
	}

}
