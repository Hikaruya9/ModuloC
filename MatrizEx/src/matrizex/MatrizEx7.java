/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizex;

/**
 *
 * @author Aluno
 */
public class MatrizEx7 {

    public static void criaMatriz(int[][] array, int linha, int coluna, int max) {
        for (int i = 0; i < linha; i++) { //Cria os valores na matriz aleatoriamente
            for (int j = 0; j < coluna; j++) {
                array[i][j] = (int) ((Math.random() *max) + 1);
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
        int[][] matriz = new int[4][4];
        int menor = 100, maior = 0;
        
        criaMatriz(matriz,4,4,100);
        System.out.println("Matriz limpa:");
        exibeMatriz(matriz,4,4);
        System.out.println("-------------------------------");
        
        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }
        
        System.out.println("O menor numero da matriz e: " + menor);
        System.out.println("O maior numero da matriz e: " + maior);
    }
}
