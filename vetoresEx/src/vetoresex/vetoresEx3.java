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
public class vetoresEx3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[10];
        int num;
        int posicao = 0;
        boolean encontrado = false;

        System.out.println("Digite um numero inteiro para verificar: ");
        num = teclado.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100) + 1;
        }

        for (int numero : numeros) {
            posicao++;
            System.out.println(numero);
            if (num == numero) {
                System.out.printf("Elemento encontrado!%nEle estava na posicao " + (posicao + 1) + " do vetor!%n");
                encontrado = true;
                break;
            } else if (posicao == numeros.length && encontrado == false) {
                System.out.println("Elemento nao encontrado!");
            }
        }
    }
}
