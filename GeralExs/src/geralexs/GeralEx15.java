/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geralexs;

/**
 *
 * @author Aluno
 */
public class GeralEx15 {

    public static void intArrayRandom(int[] numeros, int max) {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * max) + 1;
        }
    }

    public static void intArrayShow(int[] numeros) {
        for (int numero : numeros) {
            System.out.printf("[ " + numero + " ]");
        }
        System.out.println("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int temp;

        intArrayRandom(numeros, 100); //Traz os valores do array aleatoriamente

        intArrayShow(numeros); //Exibe array limpo

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        intArrayShow(numeros); //Exibe array reordenado
    }
}
