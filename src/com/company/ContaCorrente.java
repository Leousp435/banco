package com.company;

public class ContaCorrente extends Conta{

    public void imprimirExtrato(){
        System.out.println("==== Extrato Conta Corrente ====");
        super.imprimirDadosConta();
    }

}