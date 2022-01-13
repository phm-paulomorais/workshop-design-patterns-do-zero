package com.padraodeprojeto.model;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import com.padraodeprojeto.model.builder.NotaFiscalBuilder;

public class NotaFiscalTest {

	
	@Test
	public void calcularValorDoImpostoParaNotaFiscalPessoaFisicaComBuilder() {
		NotaFiscal notaFiscalPF = new NotaFiscalBuilder()
										.getNotaFiscalPessoaFisica()
										.comNumero("02020")
										.comDataDeEmissao("12/01/2022")
										.comProduto("Monitor", 2, "500")
										.comProduto("Calculadora", 2, "200")
										.construir();
		
		BigDecimal valorDoImposto = notaFiscalPF.calculaImposto();
		
		assertEquals(new BigDecimal("98").doubleValue(), valorDoImposto.doubleValue(), 0.0001);
	}
	
	@Test
	public void calcularValorDoImpostoParaNotaFiscalPessoaJuridicaComBuilder() {
		NotaFiscal notaFiscalPF = new NotaFiscalBuilder()
										.getNotaFiscalPessoaJuridica()
										.comNumero("02021")
										.comDataDeEmissao("12/01/2022")
										.comProduto("Monitor", 2, "500")
										.comProduto("Calculadora", 2, "200")
										.construir();
		
		BigDecimal valorDoImposto = notaFiscalPF.calculaImposto();
		
		assertEquals(new BigDecimal("56").doubleValue(), valorDoImposto.doubleValue(), 0.0001);
	}
}
