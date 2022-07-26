package com.padraodeprojeto.enums;

public enum Tipo {
	
	ANTIGO("Antigo"),
	NOVO("Novo");
	
	private String descricao;
	
	Tipo(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
}
