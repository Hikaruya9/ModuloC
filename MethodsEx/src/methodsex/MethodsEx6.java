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
public class MethodsEx6 {

    public static boolean verificaPalindromo(String palavra) { //Verifica se a palavra é um palindromo
        String rev = "";
        boolean resultado = false;
        
        for (int i = palavra.length()-1; i >= 0; i--) { //Forma a palavra revertida em outra variável
            rev += palavra.charAt(i);
        }
        
        if (palavra.equals(rev)) { //Verifica se a palavra revertida é igual à original
            resultado = true;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //Input do teclado

        System.out.println("Digite uma palavra:");
        String palavra = teclado.nextLine(); //Guarda a palavra digitada
        palavra = palavra.toLowerCase(); //Transforma a palavra em apenas minúsculas

        System.out.println("A palavra e um palindromo?");
        System.out.println(verificaPalindromo(palavra)); //Imprime o resultado da verificação do palindromo
    }
}
