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
public class MethodsEx8 {

    public static void intArrayRandom(int[] numeros,int max) { //Traz valores aleatorios pro array
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * max) + 1;
        }
    }
    
    public static double calculaMedia(int[] numeros) { //Faz o cálculo da média do array
        double soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        double media = soma / numeros.length;
        return media;
    }
    
    public static void intArrayShow(int[] numeros) { //Mostra os valores do array
        for (int numero : numeros) {
            System.out.printf("[ "+numero+" ]");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] numeros = new int[5];
        
        intArrayRandom(numeros,10); //Chama o método de criação de números aleatórios
        intArrayShow(numeros); //Mostra os números limpos do array
        double resultado = calculaMedia(numeros); //Guarda o resultado do calculo da média do método numa variável
        System.out.println(resultado); //Imprime o resultado da média
    }
}
