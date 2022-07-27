package com.padraodeprojeto.seguro.service;

import com.padraodeprojeto.seguro.model.Cliente;

public class CalculadoraPremioSeguroParaCarro implements CalculadoraPremioSeguro {

    @Override
    public Double calcular(Cliente cliente, Double valorVeiculo) {
        Double taxaPadrao = 50.0;
        if (cliente.getIdade() >= 60)
            taxaPadrao = 0.0;
        
        return taxaPadrao + valorVeiculo * 0.1;
    }
    
}
