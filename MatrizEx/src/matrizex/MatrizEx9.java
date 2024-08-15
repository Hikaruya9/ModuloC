/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizex;

/**
 *
 * @author Aluno
 */
public class MatrizEx9 {

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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        
        criaMatriz(matriz1,3,3,9);
        criaMatriz(matriz2,3,3,9);
        
        System.out.println("Primeira matriz:");
        exibeMatriz(matriz1,3,3);
        System.out.println("--------------------------");
        System.out.println("Segunda matriz:");
        exibeMatriz(matriz2,3,3);
        System.out.println("--------------------------");
        
        System.out.println("Matrizes subtraidas:");
        for (int linha = 0; linha < matriz1.length; linha++) {
            for (int coluna = 0; coluna < matriz2.length; coluna++) {
                int subtracao = matriz1[linha][coluna] - matriz2[linha][coluna];
                System.out.printf(subtracao + " ");
            }
            System.out.println("");
        }
    }
}