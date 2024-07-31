/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetoresex;

/**
 *
 * @author TI
 */
public class vetoresEx10 {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        int numMaior = 0;
        int numMenor = 100;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100) + 1;
        }

        System.out.println("Lista de numeros do array: ");
        for (int numero : numeros) {
            if (numMaior < numero) {
                numMaior = numero;
            }
            if (numMenor > numero) {
                numMenor = numero;
            }
            System.out.printf(numero + " ");
        }
        System.out.println("");
        System.out.println(numMaior + " e o maior numero do vetor");
        System.out.println(numMenor + " e o menor numero do vetor");
    }
}
