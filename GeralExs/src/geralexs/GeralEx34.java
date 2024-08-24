/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geralexs;

/**
 *
 * @author Aluno
 */
public class GeralEx34 {

    public static void valuesIntoMatrix(int[][] matrix, int rowM, int colM) {
        for (int row = 0; row < rowM; row++) {
            for (int col = 0; col < colM; col++) {
                matrix[row][col] = (int) (Math.random() * 20) + 1;
            }
        }
    }

    public static void transposeMatrix(int[][] matrix, int[][] matrixT, int rowM, int colM) {
        for (int row = 0; row < rowM; row++) {
            for (int col = 0; col < colM; col++) {
                matrixT[col][row] = matrix[row][col];
            }
        }
    }

    public static void showMatrix(int[][] matrix, int rowM, int colM) {
        for (int row = 0; row < rowM; row++) {
            for (int col = 0; col < colM; col++) {
                System.out.printf(matrix[row][col] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int row = 4, col = 3;
        int[][] matriz = new int[row][col];
        int[][] matrizT = new int[col][row];

        valuesIntoMatrix(matriz, row, col);
        transposeMatrix(matriz, matrizT, row, col);
        showMatrix(matriz, row, col);
        System.out.println("----------------------------");
        showMatrix(matrizT, col, row);
    }
}
