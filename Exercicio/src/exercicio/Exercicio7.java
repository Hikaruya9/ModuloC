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
public class Exercicio7 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);
        
        float numero,dobro,terca;
        
        System.out.println("Digite um numero real: ");
        numero = teclado.nextFloat();
        
        dobro = numero * 2;
        terca = numero / 3;
        
        System.out.printf("O dobro de " + numero + " e " + dobro + "%n" + "A terça parte de " + numero + " e " + terca + "%n");
        
    }       
}
