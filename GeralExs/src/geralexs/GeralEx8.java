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
public class GeralEx8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int escolha;
        double operacao;

        System.out.println("Digite um numero:");
        int numero1 = teclado.nextInt();
        System.out.println("Digite outro numero:");
        int numero2 = teclado.nextInt();

        do {
            System.out.println("-----------------------------------------------");
            System.out.println("Menu de opcoes:");
            System.out.println("1-Calcular soma");
            System.out.println("2-Calcular subtracao");
            System.out.println("3-Calcular multiplicacao");
            System.out.println("4-Calcular divisão");
            System.out.println("5-Sair");
            System.out.println("-----------------------------------------------");

            System.out.println("Digite a opcao que deseja utilizar:");
            escolha = teclado.nextInt();

            switch (escolha) {
                case 1:
                    operacao = numero1 + numero2;
                    System.out.println("Resultado: " + operacao);
                    break;
                case 2:
                    operacao = numero1 - numero2;
                    System.out.println("Resultado: " + operacao);
                    break;
                case 3:
                    operacao = numero1 * numero2;
                    System.out.println("Resultado: " + operacao);
                    break;
                case 4:
                    operacao = numero1 / numero2;
                    System.out.println("Resultado: " + operacao);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Esta nao e uma opcao valida, tente novamente");
            }
        } while (escolha != 5);
    }
}
