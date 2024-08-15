/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchcaseex;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class SwitchCaseEx5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1, numero2, operacao, resultado = 0;

        System.out.println("Digite o tipo de operacao que deseja realizar: ");
        System.out.println("1-adicao, 2-subtracao, 3-multiplicacao, 4-divisao");
        operacao = teclado.nextInt();

        System.out.println("Digite o primeiro numero que deseja somar:");
        numero1 = teclado.nextInt();
        System.out.println("Digite o segundo numero que deseja somar:");
        numero2 = teclado.nextInt();
        
        switch (operacao) {
            case 1:
                resultado = numero1+numero2;
                break;
            case 2:
                resultado = numero1-numero2;
                break;
            case 3:
                resultado = numero1*numero2;
                break;
            case 4:
                resultado = numero1/numero2;
                break;
            default:
                System.out.println("Esta nao e uma opcao valida");
        }
        System.out.println("O resultado da operacao e: " + resultado);
    }
}
