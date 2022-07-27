package com.padraodeprojeto.notifier;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.padraodeprojeto.listener.Listener;
import com.padraodeprojeto.model.Pedido;

public class NotificadorPedidos implements Notificador {
	
	private Set<Listener> listeners;
	private List<Pedido> pedidos;
	
	
	public NotificadorPedidos(){
		listeners = new HashSet<Listener>();
	}

	@Override
	public void registrarListener(Listener listener) {
		listeners.add(listener);
		
	}

	@Override
	public void removerListener(Listener listener) {
		listeners.remove(listener);
		
	}

	@Override
	public void notificarListeners() {
		for (Listener listener : listeners) {
			listener.atualizar();
		}
		
	}

	@Override
	public void novosPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
		this.notificarListeners();
	}

	@Override
	public List<Pedido> getPedidos() {
		return this.pedidos;
	}
	
	
}
