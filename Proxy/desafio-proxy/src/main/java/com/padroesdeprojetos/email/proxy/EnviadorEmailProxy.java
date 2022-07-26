package com.padroesdeprojetos.email.proxy;

import java.util.List;

import com.padroesdeprojetos.contatos.ContatosXML;
import com.padroesdeprojetos.email.EnviadorEmail;
import com.padroesdeprojetos.email.impl.EnviadorEmailMandrill;
import com.padroesdeprojetos.model.Contato;

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
