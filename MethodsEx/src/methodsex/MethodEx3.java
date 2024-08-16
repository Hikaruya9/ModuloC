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
public class MethodEx3 {

    public static int fatora(int numero) { //Fatora o numero digitado
        int resultado = 1;
        for(int i = numero; i > 0; i--) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //Input pro teclado
        
        System.out.println("Digite o numero que deseja fatorar:");
        int numero = teclado.nextInt(); //Guarda o número digitado
        
        //Traz o resultado do fatorial
        System.out.println("Resultado:");
        System.out.println(fatora(numero));
    }
}