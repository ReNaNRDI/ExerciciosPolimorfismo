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
public class ExercicioPoli4 {
   public static void main(String[] args) {
   
        Pagamento pagamentoCartao = new PagamentoCartaoCredito(1000.0, 0.05); 
        Pagamento pagamentoBoleto = new PagamentoBoleto(1000.0);
        
     
        System.out.println("Valor com carto de credito: R$ " + pagamentoCartao.calcularValor());
        System.out.println("Valor com boleto: R$ " + pagamentoBoleto.calcularValor());
    }
}
