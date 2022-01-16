package com.padroesdeprojetos.venda;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.padroesdeprojetos.venda.impl.LojaFactory;

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
