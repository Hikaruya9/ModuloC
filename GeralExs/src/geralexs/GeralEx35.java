/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geralexs;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class GeralEx35 {

    public static void intArrayRandom(int[] list, int max) {
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * max) + 1;
        }
    }

    public static void intArrayShow(int[] list) {
        for (int numero : list) {
            System.out.printf("[" + numero + "]");
        }
        System.out.println("");
    }

    public static void rotateArrayRight(int[] list, int number) {
        number %= list.length;
        int temp, previous;
        for (int i = 0; i < number; i++) {
            previous = list[list.length-1];
            for (int j = 0; j < list.length; j++) {
                temp = list[j];
                list[j] = previous;
                previous = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lista = new int[5];

        intArrayRandom(lista, 10);
        System.out.println("Lista original:");
        intArrayShow(lista);
        System.out.println("-----------------------------------");

        System.out.println("Digite quantas vezes voce quer rotacionar a lista:");
        int numero = sc.nextInt();
        System.out.println("-----------------------------------");

        rotateArrayRight(lista, numero);
        System.out.println("Lista rotacionada:");
        intArrayShow(lista);
        
        numero %= lista.length;
        System.out.println("");
        System.out.println("");
        System.out.println(numero);
    }
}
