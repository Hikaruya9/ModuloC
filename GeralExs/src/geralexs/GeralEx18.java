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
public class GeralEx18 {

    public static int geraNumero(int max) {
        int numeroAleatorio = (int) (Math.random() * max) + 1;
        return numeroAleatorio;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, max = 10;
        int numeroAleatorio = geraNumero(max);

        do {
            System.out.println("Chute um numero de 1 a " + max + ":");
            numero = sc.nextInt();

            if (numero == numeroAleatorio) {
                System.out.println("Voce acertou o numero, parabens!");
            } else {
                System.out.println("Voce errou o numero, tente novamente!");
                System.out.println("-----------------------------------------");
            }
        } while (numero != numeroAleatorio);
    }
}
