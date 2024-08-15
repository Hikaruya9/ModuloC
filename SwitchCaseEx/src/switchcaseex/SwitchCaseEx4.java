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
public class SwitchCaseEx4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int escolha;
        
        System.out.println("1: Iniciar");
        System.out.println("2: Configuracoes");
        System.out.println("3: Sair");
        System.out.println("-----------------------------");
        System.out.println("Esolha uma das opcoes:");
        escolha = teclado.nextInt();
        
        
        switch (escolha) {
            case 1:
                System.out.println("Voce entrou na opcao Iniciar.");
                break;
            case 2:
                System.out.println("Voce entrou nas configuracoes.");
                break;
            case 3:
                System.out.println("Voce saiu do programa.");
                break;
            default:
                System.out.println("Esta nao e uma opcao valida!");
        }
    }
}
