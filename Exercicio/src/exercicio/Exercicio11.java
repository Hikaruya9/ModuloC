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
public class Exercicio11 {
    
    public static void main(String[] args) {
     
        Scanner teclado = new Scanner(System.in);
        
        double a,b,c,delta,x1,x2;
        
        System.out.println("Digite o valor de A: ");
        a = teclado.nextDouble();
        System.out.println("Digite o valor de B: ");
        b = teclado.nextDouble();
        System.out.println("Digite o valor de C: ");
        c = teclado.nextDouble();
        
        delta = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        
        x1 = (-b+(delta))/(2*a);
        x2 = (-b-(delta))/(2*a);
        
        System.out.printf("O valor de x' e: " + x1 + "%n" + "O valor de x'' e: " + x2 + "%n");
        
    }    
}
