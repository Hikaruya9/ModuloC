/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizex;

/**
 *
 * @author Aluno
 */
public class MatrizEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int soma = 0;

        for (int i = 0; i < 3; i++) { //linha
            for (int j = 0; j < 3; j++) { //coluna
                matriz[i][j] = (i+1) * (j+1);
                soma += matriz[i][j];
            }
        }
        
        //Matriz imprimida e somada
        for (int i = 1; i <= 3; i++) { //linha
            for (int j = 1; j <= 3; j++) { //coluna
                System.out.println(i + " x " + j + " = " + matriz[i-1][j-1]);
            }
        }
        
        //resultado da soma
        System.out.println("A soma de todos os valores da matriz e: " + soma);
    }
}
