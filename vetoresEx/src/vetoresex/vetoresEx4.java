/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetoresex;

/**
 *
 * @author TI
 */
public class vetoresEx4 {

    public static void main(String[] args) {
        int[] numeros = new int[10];

        System.out.println("Vetor desorganizado: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100) + 1;
            System.out.printf(numeros[i] + " ");
        }

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.printf("%nVetor organizado: %n");
        for (int i : numeros) {
            System.out.printf(i + " ");
        }
        System.out.printf("%n");
    }
}
