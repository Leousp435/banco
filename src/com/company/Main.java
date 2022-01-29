package com.company;

public class Main {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca poupanca = new ContaPoupanca();

        cc.depositar(100.00);
        cc.transferir(100, (Conta) poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
