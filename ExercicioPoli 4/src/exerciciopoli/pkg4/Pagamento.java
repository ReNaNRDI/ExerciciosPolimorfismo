/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciopoli.pkg4;

/**
 *
 * @author aluno.saolucas
 */
abstract class Pagamento {
  protected double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

  
    public abstract double calcularValor();
}
