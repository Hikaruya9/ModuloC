/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchcaseex;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Aluno
 */
public class SwitchCaseEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> diaSemana = new ArrayList<>(Arrays.asList("Domingo", "Segunda-feira", "Terca-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sabado"));
        int escolha;

        System.out.println("Digite o numero inteiro referente a semana (1(domingo) a 7(sabado)");
        escolha = teclado.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Hoje e " + diaSemana.get(escolha - 1));
                break;
            case 2:
                System.out.println("Hoje e " + diaSemana.get(escolha - 1));
                break;
            case 3:
                System.out.println("Hoje e " + diaSemana.get(escolha - 1));
                break;
            case 4:
                System.out.println("Hoje e " + diaSemana.get(escolha - 1));
                break;
            case 5:
                System.out.println("Hoje e " + diaSemana.get(escolha - 1));
                break;
            case 6:
                System.out.println("Hoje e " + diaSemana.get(escolha - 1));
                break;
            case 7:
                System.out.println("Hoje e " + diaSemana.get(escolha - 1));
                break;
            default:
                System.out.println("Este nao e um dia valido!");
        }
    }
}
