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
public class GeralEx13 {

    public static double soma(double n1, double n2) {
        double resultado = n1 + n2;
        return resultado;
    }

    public static double subtrai(double n1, double n2) {
        double resultado = n1 - n2;
        return resultado;
    }

    public static double multiplica(double n1, double n2) {
        double resultado = n1 * n2;
        return resultado;
    }

    public static double divide(double n1, double n2) {
        double resultado = n1 / n2;
        return resultado;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero:");
        double numero1 = teclado.nextDouble();
        System.out.println("Digite outro numero:");
        double numero2 = teclado.nextDouble();

        System.out.println("Digite o tipo de operacao (1-soma, 2-subtrai, 3-multiplica, 4-divide):");
        int escolha = teclado.nextInt();
        
        switch (escolha) {
            case 1:
                System.out.println(soma(numero1, numero2));
                break;
            case 2:
                System.out.println(subtrai(numero1, numero2));
                break;
            case 3:
                System.out.println(multiplica(numero1, numero2));
                break;
            case 4:
                System.out.println(divide(numero1, numero2));
                break;
            default:
                System.out.println("Esta nao e uma opcao valida!");
        }
    }
}
