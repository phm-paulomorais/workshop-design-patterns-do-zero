package com.padraodeprojeto.bean.impl;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.padraodeprojeto.bean.FilmeRepository;
import com.padraodeprojeto.model.Filme;
import com.thoughtworks.xstream.XStream;

public class FilmeRepositoryImpl implements FilmeRepository {

	@Override
	public void salvar(Filme filme) {
		XStream xstream = new XStream();
	    xstream.alias("filme", Filme.class);
	    OutputStream out = null;
        try {
	        out = new FileOutputStream(filme.getNome() + ".xml");
	        xstream.toXML(filme, out);
        } catch (FileNotFoundException e) {
	        throw new RuntimeException("Erro salvando arquivo", e);
        }
		
	}

}
