package com.padroesdeprojetos.venda;

import com.padroesdeprojetos.boleto.Boleto;
import com.padroesdeprojetos.notafiscal.NotaFiscal;

public interface ModuloVendaFactory {
	
	public NotaFiscal criarNotaFiscalEletronica();
	public Boleto criarBoleto();

}
