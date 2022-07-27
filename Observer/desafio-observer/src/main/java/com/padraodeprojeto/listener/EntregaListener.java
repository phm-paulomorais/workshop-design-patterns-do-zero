package com.padraodeprojeto.listener;

import java.util.List;

import com.padraodeprojeto.model.Pedido;
import com.padraodeprojeto.notifier.Notificador;

public class EntregaListener implements Listener {

	private Notificador notificador;

	public EntregaListener(Notificador notificador) {
		this.notificador = notificador;
		this.notificador.registrarListener(this);
	}

	@Override
	public void atualizar() {
		System.out.println("Atualizando sistema de entrega...");
		List<Pedido> pedidos = this.notificador.getPedidos();
		System.out.println("Produtos para entrega");
		for (Pedido pedido : pedidos) {
			System.out.println(pedido);
		}
		System.out.println();
	}
}
