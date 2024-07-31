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
public class Exercicio4 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
    
        int n1,n2,soma;
    
        System.out.println("Digite o primeiro numero: ");
        n1 = teclado.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = teclado.nextInt();
        
        soma = n1 + n2;
        
        System.out.println("A soma entre " + n1 + " e " + n2 + " e igual a " + soma);
        
    }
}