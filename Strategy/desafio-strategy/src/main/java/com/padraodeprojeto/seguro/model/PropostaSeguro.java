package com.padraodeprojeto.seguro.model;

import com.padraodeprojeto.seguro.service.CalculadoraPremioSeguro;

public class PropostaSeguro {
    private Cliente cliente;
    private CalculadoraPremioSeguro calculadora;

    public PropostaSeguro(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public String gerar(Double valorVeiculo) {
        return "\n\nCliente: " + cliente.getNome() + "\n"
                + "Idade: " + cliente.getIdade() + "\n"
                + "Sexo: " + cliente.getSexo() + "\n\n"
                + "Valor calculado do prêmio: " + calculadora.calcular(cliente, valorVeiculo) + "\n\n\n";
    } 

    public void setCalculadora(CalculadoraPremioSeguro calculadora) {
        this.calculadora = calculadora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
