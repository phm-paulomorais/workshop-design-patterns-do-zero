package com.padraodeprojeto.seguro.enums;

import com.padraodeprojeto.seguro.service.CalculadoraPremioSeguro;
import com.padraodeprojeto.seguro.service.CalculadoraPremioSeguroParaCarro;
import com.padraodeprojeto.seguro.service.CalculadoraPremioSeguroParaMoto;

public enum TipoVeiculo {
    CARRO {
        @Override
        public CalculadoraPremioSeguro getCalculadoraPremio() {
            return new CalculadoraPremioSeguroParaCarro();
        }
    }, MOTO {
        @Override
        public CalculadoraPremioSeguro getCalculadoraPremio() {
            return new CalculadoraPremioSeguroParaMoto();
        }
    };
    
    public abstract CalculadoraPremioSeguro getCalculadoraPremio();
}
