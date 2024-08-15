/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizex;

import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class MatrizEx5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int numero, multiplicacao;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Matriz:");
        for (int i = 0; i < 3; i++) { //cria e imprime os valores da matriz
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int)((Math.random() * 9) + 1);
                System.out.printf(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("-----------------------------------------------------");
        System.out.println("Digite o numero que voce quer multiplicar a matriz:");
        numero = teclado.nextInt();
        System.out.println("-----------------------------------------------------");

        System.out.println("Valores da multiplicacao escalar da matriz:");
        for (int i = 0; i < 3; i++) { //Faz a multiplicação escalar
            for (int j = 0; j < 3; j++) {
                multiplicacao = numero*matriz[i][j];
                System.out.printf(multiplicacao + " ");
            }
            System.out.println("");
        }
    }
}
