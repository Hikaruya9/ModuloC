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
public class GeralEx20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] lista = {1, 2, 3, 4, 5};

        System.out.println("Digite o numero que deseja buscar na lista:");
        int numero = sc.nextInt();

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == numero) {
                System.out.println("O numero " + numero + " esta na posicao " + (i + 1) + " da lista");
                break;
            } else if (i == lista.length - 1) {
                System.out.println("O numero digitado nao encontra-se na lista");
            }
        }
    }
}
