/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ex5;

/**
 *
 * @author macig
 */
public class Circulo {
    double raio;
    
    public void calcularArea() {
        System.out.printf("A area do circulo de raio "+raio+" e %.2f\n", (Math.PI*Math.pow(raio, 2)));
    }
    
    public void calcularCircunferencia() {
        System.out.printf("A circunferencia do circulo de raio "+raio+" e %.2f\n", (2*Math.PI*raio), "\n");
    }
}
