package com.padroesdeprojetos.venda;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.padraodeprojeto.venda.ModuloVendaFactory;
import com.padraodeprojeto.venda.Venda;
import com.padraodeprojeto.venda.impl.LojaFactory;

public class VendaBeloHorizonteTest {

	private Venda venda;
	
	@Before
	public void init() {
		ModuloVendaFactory moduloVendaFactory;
		try {
			moduloVendaFactory = new LojaFactory("nfe.belohorizonte", "boleto.cef");
			venda = new Venda(moduloVendaFactory);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void realizaVenda() {
		this.venda.realizar();
	}

	
}
