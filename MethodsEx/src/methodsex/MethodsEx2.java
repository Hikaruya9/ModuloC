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
public class MethodsEx2 {

    public static String verificaParImpar(int numero) { //Verifica se o número é impar ou par
        String parImpar;
        if (numero%2 == 0) {
            parImpar = "par";
        } else {
            parImpar = "impar";
        }
        return parImpar;
    }

    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in); //Input pro teclado
        
        System.out.println("Digite um numero:");
        int numero = teclado.nextInt(); //Guarda o número digitado
        
        System.out.println("O numero digitado e " + verificaParImpar(numero)); //Imprime o resultado da verificação do método
    }
    
}
