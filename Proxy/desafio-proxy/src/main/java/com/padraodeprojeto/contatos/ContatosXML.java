package com.padraodeprojeto.contatos;

import java.util.List;

import com.padraodeprojeto.model.Contato;
import com.thoughtworks.xstream.XStream;

public class ContatosXML {
	
	private List<Contato> contatosCarregados;
	
	@SuppressWarnings("unchecked")
    public ContatosXML(String nomeArquivo) {
		XStream xstream = new XStream();
	    xstream.alias("contatos", List.class);
	    xstream.alias("contato", Contato.class);
	    
	    
	    System.out.println("Carregando arquivo: " + nomeArquivo);
	    this.contatosCarregados = (List<Contato>) xstream.fromXML(this.getClass().getResource("/" + nomeArquivo));
	    	
	}

	public List<Contato> getContatosCarregados() {
		return contatosCarregados;
	}

}
