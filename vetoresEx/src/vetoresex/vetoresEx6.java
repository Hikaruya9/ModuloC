/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetoresex;

/**
 *
 * @author TI
 */
public class vetoresEx6 {

    public static void main(String[] args) {
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100) + 1;
            System.out.printf(numeros[i] + " ");
        }

        System.out.printf("\nOrdem invertida!\n");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.printf(numeros[i] + " ");
        }

        System.out.println(" ");
    }
}
