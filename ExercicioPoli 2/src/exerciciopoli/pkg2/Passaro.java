/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciopoli.pkg2;

/**
 *
 * @author aluno.saolucas
 */

    class Passaro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O pássaro faz: Piu Piu");
    }

    @Override
    public void mover() {
        System.out.println("O pássaro voa pelo ceu");
    }
}
