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
public class SwitchCaseEx2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a nota (0 a 10): ");
        int nota = teclado.nextInt();
        
        switch (nota) {
            case 0,1,2:
                System.out.println("Voce esta na classificacao F! Reprovado!");
                break;
            case 3,4:
                System.out.println("Voce esta na classificacao D!");
                break;
            case 5,6:
                System.out.println("Voce esta na classificacao C!");
                break;
            case 7,8:
                System.out.println("Voce esta na classificacao B!");
                break;
            case 9,10:
                System.out.println("Voce esta na classificacao A! Parabens!");
                break;
            default:
                System.out.println("Esta nao e uma nota valida!");
        }
    }
}