package com.padraodeprojeto.seguro.aplicacao;

import java.util.Scanner;

import com.padraodeprojeto.seguro.enums.Sexo;
import com.padraodeprojeto.seguro.enums.TipoVeiculo;
import com.padraodeprojeto.seguro.model.Cliente;
import com.padraodeprojeto.seguro.model.PropostaSeguro;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        Cliente cliente = new Cliente();
        
        System.out.println("Nome do cliente: ");
        cliente.setNome(scaner.nextLine());
        
        System.out.println("Idade: ");
        cliente.setIdade(scaner.nextInt());
        
        System.out.println("Sexo (1 - MASC / 2 - FEM): ");
        Sexo sexo = Sexo.values()[scaner.nextInt() - 1];
        cliente.setSexo(sexo);
        
        PropostaSeguro propostaSeguro = new PropostaSeguro(cliente);
        
        boolean continuar = true;
        
        while(continuar) {
            System.out.println("Tipo do veículo: (1 - Carro / 2 - Moto) \nEncerrar operação: 3 ");
            
            int opcaoSelecionada = scaner.nextInt();
            
            if (opcaoSelecionada == 3) {
            	continuar = false;
            	break;
            }
            
            TipoVeiculo tipoVeiculo = TipoVeiculo.values()[opcaoSelecionada - 1];
            
            System.out.println("Valor do veículo: ");
            Double valor = scaner.nextDouble();
            
            
            propostaSeguro.setCalculadora(tipoVeiculo.getCalculadoraPremio());
            System.out.println(propostaSeguro.gerar(valor));
        }
    }

}
