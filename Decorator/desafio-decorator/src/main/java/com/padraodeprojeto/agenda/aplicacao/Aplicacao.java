package com.padraodeprojeto.agenda.aplicacao;

import com.padraodeprojeto.agenda.model.Contato;
import com.padraodeprojeto.agenda.service.Agenda;
import com.padraodeprojeto.agenda.service.AgendaDAO;
import com.padraodeprojeto.agenda.service.CacheAgendaDAO;

public class Aplicacao {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setCodigo(1);
		contato.setNome("Normandes Junior");
		contato.setTelefone("3342-1212");
		
		Agenda agenda = new CacheAgendaDAO(new AgendaDAO());
		
		agenda.inserir(contato);
		
		agenda.buscar(1);
		
		agenda.buscar(1);

	}

}
