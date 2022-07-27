package com.padraodeprojeto.venda;

import com.padraodeprojeto.boleto.Boleto;
import com.padraodeprojeto.notafiscal.NotaFiscal;

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
