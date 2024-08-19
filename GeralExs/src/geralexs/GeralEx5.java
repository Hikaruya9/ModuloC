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
public class GeralEx5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numero = teclado.nextInt();

        if (numero > 0) {
            System.out.println("O numero digitado e positivo!");
        } else if (numero == 0) {
            System.out.println("O numero digitado e zero!");
        } else {
            System.out.println("O numero digitado e negativo!");
        }
    }
}
