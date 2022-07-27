package com.padraodeprojeto.agenda.service;

import com.padraodeprojeto.agenda.model.Contato;

public interface Agenda {

	public void inserir(Contato contato);
	public Contato buscar(Integer codigo);
}
