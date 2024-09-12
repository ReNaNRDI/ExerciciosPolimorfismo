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
class PagamentoCartaoCredito extends Pagamento {
    private double taxaJuros;

    public PagamentoCartaoCredito(double valor, double taxaJuros) {
        super(valor);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public double calcularValor() {
        return valor + (valor * taxaJuros);
    }
}