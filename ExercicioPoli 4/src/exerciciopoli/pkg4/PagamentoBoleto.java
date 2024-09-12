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
class PagamentoBoleto extends Pagamento {
    private static final double TAXA_BOLETO = 0.02; 

    public PagamentoBoleto(double valor) {
        super(valor);
    }

    @Override
    public double calcularValor() {
        return valor + (valor * TAXA_BOLETO);
    }
}