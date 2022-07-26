package com.padraoesdeprojeto.notifier;

import java.util.List;

import com.padraoesdeprojeto.listener.Listener;
import com.padraoesdeprojeto.model.Pedido;


public interface Notificador {

	public void registrarListener(Listener listener);
	public void removerListener(Listener listener);
	public void notificarListeners();
	
	public void novosPedidos(List<Pedido> pedidos);
	public List<Pedido> getPedidos();
	
}
