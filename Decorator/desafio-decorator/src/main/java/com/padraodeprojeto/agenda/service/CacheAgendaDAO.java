package com.padraodeprojeto.agenda.service;

import java.util.HashMap;
import java.util.Map;

import com.padraodeprojeto.agenda.model.Contato;

public class CacheAgendaDAO implements Agenda {

	private Agenda agenda;
	private Map<Integer, Contato> contatos;
	
	public CacheAgendaDAO(Agenda agenda) {
		this.agenda = agenda;
		this.contatos = new HashMap<>();
	}

	@Override
	public void inserir(Contato contato) {
		this.agenda.inserir(contato);
	}

	@Override
	public Contato buscar(Integer codigo) {
		Contato contato = contatos.get(codigo);
		
		if(contato != null) {
			System.out.println("Encontrou contato na cache.");
			return contato;
		}
		
		System.out.println("Buscando contato em disco...");
		contato =  this.agenda.buscar(codigo);
		
		if(contato != null) {
			this.contatos.put(contato.getCodigo(), contato);
		}
		
		return contato;
	}

}
