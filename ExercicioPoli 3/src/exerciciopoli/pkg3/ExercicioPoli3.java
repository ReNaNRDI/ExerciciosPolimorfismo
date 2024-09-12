/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciopoli.pkg3;


public class ExercicioPoli3 {

    public static void main(String[] args) {
     
        ContaBancaria contaCorrente = new ContaCorrente(1000.0, 500.0);
        ContaBancaria contaPoupanca = new ContaPoupanca(2000.0);
        
   
        contaCorrente.depositar(500.0);
        contaCorrente.sacar(200.0);
        contaCorrente.mostrarSaldo();
        

        contaPoupanca.depositar(1000.0);
        contaPoupanca.sacar(500.0);
        ((ContaPoupanca) contaPoupanca).renderJuros();
        contaPoupanca.mostrarSaldo();
    }
}
