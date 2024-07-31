/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lacorepeticaoex38;

import java.util.Random;

/**
 *
 * @author TI
 */
public class LacoRepeticao50 {

    public static void main(String[] args) {
        
        int numero;
        int n1 = 0;
        int n2 = 0;

        Random numeroAleatorio = new Random();

        for (int i = 0; i < 20; i++) {

            numero = numeroAleatorio.nextInt(10);
            System.out.println(numero);

            if (numero > 5) {
                
                n1++;

            }
            
            if(numero%3 == 0) {
                
                n2++;
                
            }
            
            if(i == 19) {
                
                System.out.println(n1 + " destes numeros sao maiores que 5 e " + n2 + " destes numeros sao divisiveis por 3");
                
            }
            
        }

    }

}
