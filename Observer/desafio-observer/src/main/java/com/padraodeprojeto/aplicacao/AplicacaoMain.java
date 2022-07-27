package com.padraodeprojeto.aplicacao;

import com.padraodeprojeto.listener.EntregaListener;
import com.padraodeprojeto.listener.FaturamentoListener;
import com.padraodeprojeto.listener.Listener;
import com.padraodeprojeto.notifier.Notificador;
import com.padraodeprojeto.notifier.NotificadorPedidos;
import com.padraodeprojeto.pedidos.PedidosXML;

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
