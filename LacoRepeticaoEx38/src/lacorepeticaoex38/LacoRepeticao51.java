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
public class LacoRepeticao51 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double preco;
        double maior = 0;
        double menor = 1000000;

        for (int i = 0; i < 8; i++) {

            System.out.println("Digite o preco do produto: ");
            preco = teclado.nextDouble();

            if (preco > maior) {

                maior = preco;
                
            }

            if (preco < menor) {

                menor = preco;

            }
            
            if(i==7) {
                
                System.out.printf("O maior valor dos precos registrados e: R$%.2f\n", maior);
                System.out.printf("O menor valor dos precos registrados e: R$%.2f\n", menor);
                
            }

        }

    }

}
