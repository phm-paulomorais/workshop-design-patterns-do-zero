package com.padraodeprojeto.venda;

import com.padraodeprojeto.boleto.Boleto;
import com.padraodeprojeto.notafiscal.NotaFiscal;

public interface ModuloVendaFactory {
	
	public NotaFiscal criarNotaFiscalEletronica();
	public Boleto criarBoleto();

}
