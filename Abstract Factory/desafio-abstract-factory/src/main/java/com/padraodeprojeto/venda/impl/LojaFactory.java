package com.padraodeprojeto.venda.impl;

import java.io.IOException;
import java.util.Properties;

import com.padraodeprojeto.boleto.Boleto;
import com.padraodeprojeto.notafiscal.NotaFiscal;
import com.padraodeprojeto.venda.ModuloVendaFactory;

public class LojaFactory implements ModuloVendaFactory {
	
	private Properties prop;
	private String chaveNotaFiscal;
	private String chaveBoleto;
	
	public LojaFactory(String chaveNotaFiscal, String chaveBoleto) throws IOException {
		this.prop = new Properties();
		prop.load(this.getClass().getResourceAsStream("/config.properties"));
		this.chaveNotaFiscal = chaveNotaFiscal;
		this.chaveBoleto = chaveBoleto;
	}
	
	public NotaFiscal criarNotaFiscalEletronica() {
		String classeNFe = this.prop.getProperty(this.getChaveNotaFiscal());
		try {
			
			Class<?> auxClass = Class.forName(classeNFe);
			
			return (NotaFiscal)auxClass.getConstructors()[0].newInstance();
			//return (NotaFiscal) Class.forName(classeNFe).newInstance();
		} catch (Exception e) {
			System.out.println("Ocorreu um erro, chave inválida para instanciar notal fiscal");
			e.printStackTrace();
		}
		return null;
	}

	public Boleto criarBoleto() {
		String classeBoleto = this.prop.getProperty(this.getChaveBoleto());
		try {
			return (Boleto)Class.forName(classeBoleto).getConstructors()[0].newInstance();
		} catch (Exception e) {
			System.out.println("Ocorreu um erro, chave inválida para instanciar boleto");
			e.printStackTrace();
		}
		return null;

	}

	public String getChaveNotaFiscal() {
		return chaveNotaFiscal;
	}

	public String getChaveBoleto() {
		return chaveBoleto;
	}
	
	
	
	

}
