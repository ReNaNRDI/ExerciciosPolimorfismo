/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciopoli.pkg5;

/**
 *
 * @author aluno.saolucas
 */
public class ExercicioPoli5 {

      public static void main(String[] args) {
     
        Funcionario gerente = new Gerente(5000.0);
        Funcionario programador = new Programador(4000.0);
        
   
        System.out.println("Salario do gerente: R$ " + gerente.calcularSalario());
        System.out.println("Salário do programador: R$ " + programador.calcularSalario());
    }
}