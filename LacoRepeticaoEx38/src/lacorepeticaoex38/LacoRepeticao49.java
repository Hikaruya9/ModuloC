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
public class LacoRepeticao49 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numeros[] = new int[6];
        int par = 0;
        int impar = 0;

        for (int i = 0; i < 6; i++) {

            System.out.println("Digite um numero: ");
            numeros[i] = teclado.nextInt();

            if (numeros[i] % 2 != 0) {

                impar++;

            } else {

                par++;

            }

            if (i == numeros.length-1) {

                if (par == 1 || par == 0) {

                    System.out.println(par + " numero e par e " + impar + " numeros sao impares");
 
                } else if (impar == 1 || impar == 0) {

                    System.out.println(par + " numeros sao pares e " + impar + " numero e impar");

                } else {

                    System.out.println(par + " numeros sao pares e " + impar + " numeros sao impares");

                }

            }
            
        }

    }

}
