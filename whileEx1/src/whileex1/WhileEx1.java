/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package whileex1;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class WhileEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int opcao, soma = 0;

        do {
            System.out.println("Digite o numero inteiro que deseja somar (1111 caso queira parar): ");
            opcao = leia.nextInt();

            if (opcao != 1111) {
                soma += opcao;
            }
        } while (opcao != 1111);
        System.out.println("A soma dos numeros digitados e: " + soma);
    }
}
