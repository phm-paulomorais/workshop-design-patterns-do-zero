package com.padraodeprojeto.email.impl;

import java.util.List;

import com.padraodeprojeto.email.EnviadorEmail;
import com.padraodeprojeto.model.Contato;

public class EnviadorEmailMandrill implements EnviadorEmail {
	
	private List<Contato> contatos;
	
	public EnviadorEmailMandrill(List<Contato> contatos) {
		this.contatos = contatos;
	}
	

	public void enviar(String mensagem) {
		for (Contato contato: contatos) {
			System.out.println("Enviando para " + contato.getNome() + " com e-mail: " + contato.getEmail() +  " a seguinte mensagem: " + mensagem);
		}
		
	}
	
	public List<Contato> getContatos() {
		return this.contatos;
	}

}
