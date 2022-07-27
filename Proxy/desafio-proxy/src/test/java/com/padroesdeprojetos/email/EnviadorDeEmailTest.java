package com.padroesdeprojetos.email;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.padraodeprojeto.email.EnviadorEmail;
import com.padraodeprojeto.email.proxy.EnviadorEmailProxy;
import com.padraodeprojeto.model.Contato;


public class EnviadorDeEmailTest {
	
	List<Contato> contatos;
	
	@Before
	public void init() {
		contatos = new ArrayList<Contato>();
		contatos.add(new Contato("Paulo", "phm.paulomorais@gmail.com"));
		contatos.add(new Contato("Ana", "ana@gmail.com"));
		contatos.add(new Contato("João Silva", "joao@email.com"));
		contatos.add(new Contato("Maria Rita", "maria@email.com"));
		contatos.add(new Contato("Renato Aragão", "renato@email.com"));
	}
	
	@Test
	public void deveEnviarEmailParaWhiteList() {
		EnviadorEmail enviadorEmail = new EnviadorEmailProxy(this.contatos);
		enviadorEmail.enviar("Reunião sobre o planejamento do projeto agendada para 01/02/2022 às 08:00");
	}

}
