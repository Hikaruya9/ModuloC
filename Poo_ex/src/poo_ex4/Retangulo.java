/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ex4;

/**
 *
 * @author macig
 */
public class Retangulo {
    double base;
    double altura;
    
    public void calcularArea() {
        System.out.printf("A area do retangulo e: %.2f\n", (base*altura));
    }
    
    public void calcularPerimetro() {
        System.out.printf("O perimetro do retangulo e: %.2f\n", ((2*base)+(2*altura)), "\n");
    }
}
