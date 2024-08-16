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
public class MethodsEx {

    public static int soma(int n1, int n2) { //Faz a soma de dois numeros
        int resultado = n1 + n2;
        return resultado;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //Input pro teclado
        int numero1,numero2;
        
        System.out.println("Digite um numero:");
        numero1 = teclado.nextInt(); //Guarda o primeiro número digitado
        System.out.println("Digite o numero que deseja somar:");
        numero2 = teclado.nextInt(); //Guarda o segundo número digitado
        
        System.out.println("Resultado: " + soma(numero1,numero2)); //Imprime o resultado
    }
}
