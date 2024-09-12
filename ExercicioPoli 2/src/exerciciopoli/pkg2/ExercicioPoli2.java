/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciopoli.pkg2;
import java.util.ArrayList;
import java.util.List;

public class ExercicioPoli2 {

public static void main(String[] args) {
     
        List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Gato());
        animais.add(new Passaro());
        
        
        for (Animal animal : animais) {
            animal.emitirSom();
            animal.mover();
            System.out.println(); 
        }
    }
}