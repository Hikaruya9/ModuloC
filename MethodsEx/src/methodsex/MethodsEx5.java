/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodsex;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class MethodsEx5 {

    public static int verificaVogais(String palavra) { //Faz a contagem de quantas vogais tem na String
        int contVogal = 0;
        for (int i = 0; i < palavra.length(); i++) {
            switch (palavra.charAt(i)) {
                case 'a','e','i','o','u':
                    contVogal++;
                    break;
            }
        }
        return contVogal;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //Input pro teclado

        System.out.println("Digite uma palavra:");
        String palavra = teclado.nextLine(); //Guarda a palavra digitada

        System.out.println("A palavra digitada tem " + verificaVogais(palavra) + " vogais"); //Imprime quantas vogais tem na palavra
    }
}
