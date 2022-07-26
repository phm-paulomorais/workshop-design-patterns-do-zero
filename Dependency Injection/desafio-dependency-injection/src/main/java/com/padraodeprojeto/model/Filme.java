package com.padraodeprojeto.model;

import java.util.Date;

import com.padraodeprojeto.enums.Tipo;

public class Filme {
	
	private String nome;
	private Date dataDeLancamento;
	private Tipo tipo;
	
	public Filme(String nome, Date dataDeLancamento) {
		this.nome = nome;
		this.dataDeLancamento = dataDeLancamento;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataDeLancamento() {
		return dataDeLancamento;
	}

	public void setDataDeLancamento(Date dataDeLancamento) {
		this.dataDeLancamento = dataDeLancamento;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	

}
