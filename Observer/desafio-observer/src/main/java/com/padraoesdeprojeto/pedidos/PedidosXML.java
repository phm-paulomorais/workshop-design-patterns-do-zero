package com.padraoesdeprojeto.pedidos;

import java.util.List;

import com.padraoesdeprojeto.model.Pedido;
import com.thoughtworks.xstream.XStream;

public class PedidosXML {
	private List<Pedido> pedidos;
	
	@SuppressWarnings("unchecked")
    public PedidosXML(String nomeArquivo) {
		XStream xstream = new XStream();
	    xstream.alias("pedidos", List.class);
	    xstream.alias("pedido", Pedido.class);
	    
	    
	    System.out.println("Carregando arquivo: " + nomeArquivo);
	    this.pedidos = (List<Pedido>) xstream.fromXML(this.getClass().getResource("/" + nomeArquivo));
	    	
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}
}
