package com.padraodeprojeto.agenda.service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import com.padraodeprojeto.agenda.model.Contato;
import com.thoughtworks.xstream.XStream;

public class AgendaDAO implements Agenda {
	
	private List<Contato> contatos;
	
	private static final String NOME_ARQUIVO = "agenda.xml"; 

	@Override
	public void inserir(Contato contato) {
		XStream xstream = new XStream();
		xstream.alias("contatos", List.class);
	    xstream.alias("contato", Contato.class);
	    List<Contato> contatos = new ArrayList<>();
	    contatos.add(contato);
	    OutputStream out = null;
        try {
	        out = new FileOutputStream(".//src//main//resources//" + NOME_ARQUIVO, false); 
	        xstream.toXML(contatos, out);
	        out.flush();
        } catch (IOException e ) {
	        throw new RuntimeException("Erro salvando arquivo", e);
        } 
	}

	@SuppressWarnings("unchecked")
	@Override
	public Contato buscar(Integer codigo) {
		
		Contato contato = null;
		
		XStream xstream = new XStream();
	    xstream.alias("contatos", List.class);
	    xstream.alias("contato", Contato.class);
	    
	    
	    System.out.println("Carregando arquivo: " + NOME_ARQUIVO);
	    this.contatos = (List<Contato>) xstream.fromXML(this.getClass().getResource("/" + NOME_ARQUIVO));
	    
	    for(Contato auxContato: this.contatos) {
	    	if(auxContato.getCodigo().compareTo(codigo) == 0) {
	    		contato = auxContato;
	    		break;
	    	}
	    }
	    
		return contato;
	}

}
