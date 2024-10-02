/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Formas;

/**
 *
 * @author Aluno
 */
public class mainFormas {

    public static void main(String[] args) {
        Circulo c1 = new Circulo(3);
        Quadrado q1 = new Quadrado(2);
        Triangulo t1 = new Triangulo(4,6,5,7);

        System.out.println("Area circulo: "+c1.calcularArea());
        System.out.println("Perimetro circulo: "+c1.calcularPerimetro());
        System.out.println("Area quadrado: "+q1.calcularArea());
        System.out.println("Perimetro quadrado: "+q1.calcularPerimetro());
        System.out.println("Area triangulo: "+t1.calcularArea());
        System.out.println("Perimetro triangulo: "+t1.calcularPerimetro());
    }
}