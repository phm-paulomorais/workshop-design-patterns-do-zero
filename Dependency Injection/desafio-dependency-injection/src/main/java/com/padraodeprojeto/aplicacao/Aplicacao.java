package com.padraodeprojeto.aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.padraodeprojeto.bean.FilmeService;
import com.padraodeprojeto.model.Filme;
import com.padraodeprojeto.util.cdi.WeldContext;

public class Aplicacao {

	public static void main(String[] args) throws ParseException {
		FilmeService filmeService = WeldContext.INSTANCE.getBean(FilmeService.class);
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		Date dataDeLancamento = formato.parse("01/07/2000"); 
		
		Filme filme = new Filme("Matrix", dataDeLancamento);
		
		filmeService.salvar(filme);

	}
	

}
