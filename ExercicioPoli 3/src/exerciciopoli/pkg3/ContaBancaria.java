/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciopoli.pkg3;


abstract class  ContaBancaria {
       protected double saldo;

    
    public abstract void sacar(double valor);

    
    public abstract void depositar(double valor);

    
    public void mostrarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }
}

