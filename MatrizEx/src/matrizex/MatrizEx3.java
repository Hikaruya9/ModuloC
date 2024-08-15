/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizex;

/**
 *
 * @author Aluno
 */
public class MatrizEx3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) { //Traz os valores pra dentro das posições da matriz
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (i+i) + (j+1);
            }
        }

        /*
        for (int i = 1; i <= 3; i++) { //Impressão correta
            for (int j = 1; j <= 3; j++) {
                System.out.printf(matriz[i-1][j-1] + " ");
            }
            System.out.println("");
        }
        */

        for (int i = 1; i <= 3; i++) { //Impressão da mastriz transposta
            for (int j = 1; j <= 3; j++) {
                System.out.printf(matriz[j-1][i-1] + " ");
            }
            System.out.println("");
        }
    }
}
