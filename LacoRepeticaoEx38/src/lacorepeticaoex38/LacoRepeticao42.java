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
public class LacoRepeticao42 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.println("Digite um numero inteiro: ");
        numero = teclado.nextInt();

        for(int i = 0; i <= numero; i++) {
        
            System.out.println(i);
            
            if(i == numero) {
                
                System.out.println("Finalizado");
                
            }
        }
            
    }

    
}
