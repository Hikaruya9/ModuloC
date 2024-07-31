/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lacorepeticaoex38;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class LacoRepeticao48 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int numeros[] = new int[7];
        int soma = 0;
        
        for(int i = 0; i < numeros.length; i++) {
            
            System.out.println("Digite um numero inteiro: ");
            numeros[i] = teclado.nextInt();
            
            soma += numeros[i];
            
            if(i == numeros.length-1) {
                
                System.out.println(soma);
                
            }
            
        }
        
    }
    
}
