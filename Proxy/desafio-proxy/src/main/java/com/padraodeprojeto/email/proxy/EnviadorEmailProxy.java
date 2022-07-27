package com.padraodeprojeto.email.proxy;

import java.util.List;

import com.padraodeprojeto.contatos.ContatosXML;
import com.padraodeprojeto.email.EnviadorEmail;
import com.padraodeprojeto.email.impl.EnviadorEmailMandrill;
import com.padraodeprojeto.model.Contato;

public class EnviadorEmailProxy implements EnviadorEmail {
	
	
	private List<Contato> contatos;
	private EnviadorEmailMandrill enviadorEmailMandrill;
	
	public EnviadorEmailProxy(List<Contato> contatos) {
		this.contatos = contatos; 
	}

	public void enviar(String mensagem) {
		
		ContatosXML contatosXML = new ContatosXML("blacklist.xml");
		List<Contato> blackList = contatosXML.getContatosCarregados();
		
		this.contatos.removeAll(blackList);
		
		enviadorEmailMandrill = new EnviadorEmailMandrill(this.contatos);
		
		enviadorEmailMandrill.enviar(mensagem);
	}

}
