/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetoresex;

/**
 *
 * @author TI
 */
public class vetoresEx5 {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        int soma = 0;
        int media;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100) + 1;
            System.out.printf(numeros[i] + " ");
        }

        for (int i : numeros) {
            soma += i;
        }

        media = soma / numeros.length;
        System.out.printf("%nA media dos valores e: " + media + "%n");

        //J P C
    }
}
