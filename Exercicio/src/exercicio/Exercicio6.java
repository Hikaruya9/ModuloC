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
public class Exercicio6 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);
        
        int numero,antecessor,sucessor;
        
        System.out.println("Digite um numero inteiro: ");
        numero = teclado.nextInt();
        
        antecessor = numero - 1;
        sucessor = numero + 1;
        
        System.out.printf("O antecessor de " + numero + " e " + antecessor + "%n" + "O sucessor de " + numero + " e " + sucessor + "%n");
        
    }    
}
