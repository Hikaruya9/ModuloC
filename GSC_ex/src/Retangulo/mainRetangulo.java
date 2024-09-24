/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Retangulo;

/**
 *
 * @author Aluno
 */
public class mainRetangulo {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(3.90, 2.10);
        
        System.out.println(r1.getLargura());
        System.out.println(r1.getAltura());
        
        System.out.println(r1.calcularArea());
        
        r1.setLargura(4.20);
        r1.setAltura(2.50);
        
        System.out.println(r1.calcularPerimetro());
    }
}
