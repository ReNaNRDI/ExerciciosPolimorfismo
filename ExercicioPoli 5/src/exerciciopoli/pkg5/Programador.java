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

    class Programador extends Funcionario {
    private static final double BONUS_PROGRAMADOR = 0.1; 

    public Programador(double salarioBase) {
        super(salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (salarioBase * BONUS_PROGRAMADOR);
    }
    }


