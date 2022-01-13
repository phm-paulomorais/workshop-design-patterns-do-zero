package com.padraodeprojeto.model.builder;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.padraodeprojeto.model.NotaFiscal;
import com.padraodeprojeto.model.Produto;
import com.padraodeprojeto.notafiscal.concreta.NotaFiscalPessoaFisica;
import com.padraodeprojeto.notafiscal.concreta.NotaFiscalPessoaJuridica;

public class NotaFiscalBuilder {
	
	
	private NotaFiscal instancia;
	
	public NotaFiscalBuilder() {
		
	}
	
	public NotaFiscalBuilder getNotaFiscalPessoaFisica() {
		this.instancia = new NotaFiscalPessoaFisica();
		return this;
	}
	
	public NotaFiscalBuilder getNotaFiscalPessoaJuridica() {
		this.instancia = new NotaFiscalPessoaJuridica();
		return this;
	}
	
	public NotaFiscalBuilder comNumero(String numero) {
		this.instancia.setNumero(numero);
		return this;
	}
	
	// dataDeEmissao no formato: dd/MM/yyyy.
	public NotaFiscalBuilder comDataDeEmissao(String dataDeEmissao) { 
		try {
			this.instancia.setDataDeEmissao(new SimpleDateFormat("dd/MM/yyyy").parse(dataDeEmissao));
		} catch (ParseException e) {
			this.instancia.setDataDeEmissao(null);
		}
		return this;
	}
	
	public NotaFiscalBuilder comProduto(String nome, Integer quantidade, String valorUnitario) {
		Produto produto = new Produto();
		produto.setNome(nome);
		produto.setValorUnitario(new BigDecimal(valorUnitario));
		produto.setQuantidade(quantidade);
		
		if (this.instancia.getProdutos() == null) {
			this.instancia.setProdutos(new ArrayList<Produto>());
		}
		
		this.instancia.getProdutos().add(produto);
		
		return this;
	}
	
	
	public NotaFiscal construir() {
		return this.instancia;
	}

}
