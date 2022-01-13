package com.padraodeprojeto.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


public abstract class NotaFiscal {
	
	private String numero;
	
	private Date dataDeEmissao;
	
	private List<Produto> produtos;
	
	public abstract Double getImposto();
	
	public BigDecimal calculaImposto() {
		Double imposto = getImposto();
		
		BigDecimal valorTotal = BigDecimal.ZERO;
		for (Produto produto : produtos) {
			valorTotal = valorTotal.add(produto.getValorUnitario().multiply(new BigDecimal(produto.getQuantidade())));
		}
		
		return valorTotal.multiply(new BigDecimal(imposto));
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getDataDeEmissao() {
		return dataDeEmissao;
	}

	public void setDataDeEmissao(Date dataDeEmissao) {
		this.dataDeEmissao = dataDeEmissao;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	
}
