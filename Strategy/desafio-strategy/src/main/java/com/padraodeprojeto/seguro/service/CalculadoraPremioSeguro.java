package com.padraodeprojeto.seguro.service;

import com.padraodeprojeto.seguro.model.Cliente;

public interface CalculadoraPremioSeguro {
	
    public Double calcular(Cliente cliente, Double valorVeiculo);
    
}
