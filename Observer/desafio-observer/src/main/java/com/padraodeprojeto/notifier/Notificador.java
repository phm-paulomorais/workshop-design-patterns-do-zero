package com.padraodeprojeto.notifier;

import java.util.List;

import com.padraodeprojeto.listener.Listener;
import com.padraodeprojeto.model.Pedido;


public interface Notificador {

	public void registrarListener(Listener listener);
	public void removerListener(Listener listener);
	public void notificarListeners();
	
	public void novosPedidos(List<Pedido> pedidos);
	public List<Pedido> getPedidos();
	
}
