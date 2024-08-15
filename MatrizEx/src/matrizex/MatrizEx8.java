/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizex;

/**
 *
 * @author Aluno
 */
public class MatrizEx8 {

    public static void criaMatriz(int[][] array, int linha, int coluna, int max) {
        for (int i = 0; i < linha; i++) { //Cria os valores na matriz aleatoriamente
            for (int j = 0; j < coluna; j++) {
                array[i][j] = (int) ((Math.random() * max) + 1);
            }
        }
    }

    public static void exibeMatriz(int[][] array, int linha, int coluna) {
        for (int i = 0; i < linha; i++) { //Exibe os valores na matriz aleatoriamente
            for (int j = 0; j < coluna; j++) {
                System.out.printf(array[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int multiplicaMatrizes(int[][] primeiraMatriz, int[][] segundaMatriz, int linha, int coluna) {
        int produto = 0;
        for (int i = 0; i < segundaMatriz.length; i++) {
            produto += primeiraMatriz[linha][i] * segundaMatriz[i][coluna]; //Soma o resultado da multiplicação à variável
        }
        return produto; //retorna o resultado do laço
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];

        criaMatriz(matriz1, 2, 2, 9);
        criaMatriz(matriz2, 2, 2, 9);

        //Imprime as duas matrizes limpas
        System.out.println("Primeira matriz:");
        exibeMatriz(matriz1, 2, 2);
        System.out.println("-------------------------");
        System.out.println("Segunda matriz:");
        exibeMatriz(matriz2, 2, 2);
        System.out.println("-------------------------");

        System.out.println("Matriz produto:");
        for (int linha = 0; linha < matriz1.length; linha++) { //Faz a multiplicacao das matrizes por method
            for (int coluna = 0; coluna < matriz2.length; coluna++) {
                System.out.printf(multiplicaMatrizes(matriz1, matriz2, linha, coluna) + " ");
            }
            System.out.println("");
        }
    }
}