/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Exercicio5 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);
        
        double nota1,nota2,media;
        
        System.out.println("Digite sua primeira nota: ");
        nota1 = teclado.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        nota2 = teclado.nextDouble();
        
        media = (nota1 + nota2) / 2;
        System.out.println("A media entre " + nota1 + " e " + nota2 + " e igual a " + media);
        
    }
}
