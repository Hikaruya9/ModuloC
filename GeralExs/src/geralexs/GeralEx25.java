/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geralexs;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class GeralEx25 {

    public static void fillArrayList(ArrayList<Integer> list, int min, int max) {
        for (int i = min; i < max; i++) {
            list.add(i);
        }
    }

    public static int generateRandomNumber(int min, int max) {
        int number = (int) (Math.random() * (max-min+1)) + min;
        return number;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        int min = 0, max = 100, chute = 0;
        int numero = generateRandomNumber(min, max);

        fillArrayList(lista, min, max);

        while (chute != numero) {
            chute = (min + max) / 2;
            if (numero > chute) {
                min = chute + 1;
                System.out.println("O numero esta acima de " + chute + "!");
            } else if (numero < chute) {
                max = chute - 1;
                System.out.println("O numero esta abaixo de " + chute + "!");
            }
            System.out.println("--------------------------------------------");
        }

        System.out.println("O numero foi encontrado!");
        System.out.println(chute);
    }

}
