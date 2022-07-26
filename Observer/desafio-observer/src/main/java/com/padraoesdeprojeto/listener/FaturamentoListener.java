package com.padraoesdeprojeto.listener;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;

import com.padraoesdeprojeto.model.Pedido;
import com.padraoesdeprojeto.notifier.Notificador;

public class FaturamentoListener implements Listener {

	private Notificador notificador;

	public FaturamentoListener(Notificador notificador) {
		this.notificador = notificador;
		this.notificador.registrarListener(this);
	}

	@Override
	public void atualizar() { 
		System.out.println("Atualizando sistema de faturamento...");
		List<Pedido> pedidos = this.notificador.getPedidos();
		BigDecimal valorTotal = BigDecimal.ZERO;
		for (Pedido p : pedidos) {
			valorTotal = valorTotal.add(p.getValor());
		}
		DecimalFormat formato = new DecimalFormat("R$ #,##0.00");
		System.out.println("Faturamento dos pedidos: "
				+ formato.format(valorTotal.doubleValue()));
		System.out.println();
	}

}
