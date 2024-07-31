/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetoresex;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class vetoresEx14 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];
        int numeroDigitado, indiceDigitado;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100) + 1;
        }

        System.out.println("Digite o numero inteiro que deseja buscar: ");
        numeroDigitado = teclado.nextInt();
        System.out.println("Digite o indice do array que deseja vasculhar (1 a 10): ");
        indiceDigitado = teclado.nextInt() - 1;

        if (numeroDigitado == numeros[indiceDigitado]) {
            System.out.println("Voce acertou!");
        } else {
            System.out.println("Voce errou!");
            System.out.println("O numero dessa posicao era " + numeros[indiceDigitado]);
        }
    }
}
