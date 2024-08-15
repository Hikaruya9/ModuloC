/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizex;

/**
 *
 * @author Aluno
 */
public class MatrizEx6 {
    public static void criaMatriz(int[][] array, int linha, int coluna) {
        for (int i = 0; i < linha; i++) { //Cria os valores na matriz aleatoriamente
            for (int j = 0; j < coluna; j++) {
                array[i][j] = (int) ((Math.random() * 9) + 1);
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
    
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        
        criaMatriz(matriz, 4, 4);
        System.out.println("Matriz limpa:");
        exibeMatriz(matriz, 4, 4);
        System.out.println("----------------------------------------------");
        
        for (int i = 0; i < matriz.length; i++) {
            int somaL = 0;
            int somaC = 0;
            for (int j = 0; j < matriz.length; j++) {
                somaL += matriz[i][j];
                somaC += matriz[j][i];
            }
            System.out.println("A soma da linha " + (i+1) + " e " + somaL);
            System.out.println("A soma da coluna " + (i+1) + " e " + somaC);
            System.out.println("----------------------------------------------");
        }
    }
}