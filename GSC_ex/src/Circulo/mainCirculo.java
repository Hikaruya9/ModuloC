/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Circulo;

/**
 *
 * @author macig
 */
public class mainCirculo {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(8);
        
        System.out.printf("%.2f\n",c1.getRaio());
        System.out.printf("%.2f\n",c1.calcularArea());
        
        c1.setRaio(25);
        
        System.out.printf("%.2f\n",c1.getRaio());
        System.out.printf("%.2f\n",c1.calcularCircunferencia());
    }
}
