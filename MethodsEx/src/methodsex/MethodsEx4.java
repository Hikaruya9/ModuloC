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
public class MethodsEx4 {

    public static int converteTemperatura(int celsius) { //Faz a conversão da temperatura de C° em F
        int farenheit = (celsius*9/5) + 32;
        return farenheit;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //Input pro teclado
        
        System.out.println("Digite os graus celsius:");
        int celsius = teclado.nextInt(); //Registra o valor digitado
        
        System.out.println(converteTemperatura(celsius)); //Imprime a conversão do método
    }
}
