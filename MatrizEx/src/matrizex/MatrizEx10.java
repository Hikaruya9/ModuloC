/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizex;

/**
 *
 * @author Aluno
 */
public class MatrizEx10 {

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
        int[][] matriz = new int[4][4];
        int soma = 0;
        double media;
        
        criaMatriz(matriz,4,4,100);
        System.out.println("Matriz limpa:");
        exibeMatriz(matriz,4,4);
        System.out.println("-------------------------------");
        
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                soma += matriz[linha][coluna];
            }
        }
        
        media = soma / (matriz.length*matriz.length);
        System.out.printf("A media dos elementos da matriz e %.2f\n", media);
    }
    
}
