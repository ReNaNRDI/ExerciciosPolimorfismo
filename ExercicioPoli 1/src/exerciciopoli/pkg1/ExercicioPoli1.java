/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciopoli.pkg1;


public class ExercicioPoli1 {
    public static void main(String[] args) {
       
        FormaGeometrica circulo = new Circulo(5.0);
        FormaGeometrica retangulo = new Retangulo(4.0, 6.0);
        FormaGeometrica triangulo = new Triangulo(3.0, 7.0);
      
        System.out.println("Area do circulo: " + circulo.calcularArea());
        System.out.println("Area do retangulo: " + retangulo.calcularArea());
        System.out.println("Area do Triangulo: " + triangulo.calcularArea());
        }
}
