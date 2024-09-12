/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciopoli.pkg3;


class ContaPoupanca extends ContaBancaria {
    private static final double TAXA_JUROS = 0.05;

    public ContaPoupanca(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
    }

   
    public void renderJuros() {
        double juros = saldo * TAXA_JUROS;
        saldo += juros;
        System.out.println("Juros de R$ " + juros + " aplicados com sucesso.");
    }
}