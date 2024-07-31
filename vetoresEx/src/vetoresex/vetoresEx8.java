/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetoresex;

/**
 *
 * @author TI
 */
public class vetoresEx8 {

    public static void main(String[] args) {
        int[] numeros1 = new int[5];
        int[] numeros2 = new int[5];
        int[] numeros12 = new int[numeros1.length + numeros2.length];

        /* for(int i = 0; i < numeros1.length; i++) {
            numeros1[i] = (int) (Math.random() * 100) + 1;
            numeros2[i] = (int) (Math.random() * 100) + 1;
        } */
        System.out.println("Valores dos dois arrays: ");
        for (int i = 0; i < numeros1.length; i++) { //loop pra guardar e mostrar os valores do primeiro vetor
            numeros1[i] = (int) (Math.random() * 100) + 1;
            System.out.printf(numeros1[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < numeros2.length; i++) { //loop pra guardar e mostrar os valores do segundo vetor
            numeros2[i] = (int) (Math.random() * 100) + 1;
            System.out.printf(numeros2[i] + " ");
        }
        System.out.println("");

        for (int i = 0; i < numeros12.length; i++) { //loop pra guardar os valores dos vetores dentro do terceiro vetor
            if (i % 2 == 0) {
                numeros12[i] = numeros1[i / 2];
            } else {
                numeros12[i] = numeros2[(i - 1) / 2];
            }
        }

        for (int numero : numeros12) {
            System.out.printf(numero + " ");
        }
        System.out.println("");
    }
}
