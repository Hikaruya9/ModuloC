/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geralexs;

/**
 *
 * @author Aluno
 */
public class GeralEx23 {

    public static void intArrayRandom(int[] numeros, int max) {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * max) + 1;
        }
    }

    public static void intArrayShow(int[] numeros) {
        for (int numero : numeros) {
            System.out.printf("[ " + numero + " ] ");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = new int[10];

        intArrayRandom(numeros, 10);

        System.out.println("Array com dupes:");
        intArrayShow(numeros);
        System.out.println("\n-------------------------------------------");

        System.out.println("Array sem dupes:");
        for (int i = 0; i < numeros.length; i++) {
            int contDupes = 0;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    contDupes++;
                    break;
                }
            }
            if (contDupes == 0) {
                System.out.printf("[ " + numeros[i] + " ] ");
            }
        }
        System.out.println("");
    }
}
