/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetoresex;

import java.util.Random;

/**
 *
 * @author TI
 */
public class VetoresEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] numeros = new int[10];
        Random numAleatorio = new Random();
        
        for (int i = 0; i < numeros.length; i++) {
            
            numeros[i] = numAleatorio.nextInt(1,100);
            System.out.println(numeros[i]);
            
        }
        
    }
    
}