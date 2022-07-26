package com.padraoesdeprojeto.aplicacao;

import com.padraoesdeprojeto.listener.EntregaListener;
import com.padraoesdeprojeto.listener.FaturamentoListener;
import com.padraoesdeprojeto.listener.Listener;
import com.padraoesdeprojeto.notifier.Notificador;
import com.padraoesdeprojeto.notifier.NotificadorPedidos;
import com.padraoesdeprojeto.pedidos.PedidosXML;

public class AplicacaoMain {

	public static void main(String[] args) {
		Notificador notificador = new NotificadorPedidos();
		
		Listener entregaListener = new EntregaListener(notificador);
		Listener faturamentoListener = new FaturamentoListener(notificador);
		
		PedidosXML pedidos = new PedidosXML("pedidos.xml");
		System.out.println();
		notificador.novosPedidos(pedidos.getPedidos());
		
	}

}
