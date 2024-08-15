/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizex;

/**
 *
 * @author Aluno
 */
public class MatrizEx2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int cont = 0;

        for (int i = 0; i < 3; i++) { //Cria os valores na matriz aleatoriamente
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random() * 2);
            }
        }

        for (int i = 1; i <= 3; i++) { //Imprime os valores armazenados na matriz
            for (int j = 1; j <= 3; j++) {
                System.out.printf(matriz[i - 1][j - 1] + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i < 3; i++) { //Faz a verificação se é uma matriz identidade
            for (int j = i; j < 3; j++) {
                if (matriz[i][j] == 1) {
                    cont++;
                    break;
                } else {
                    break;
                }
            }
        }

        if (cont == matriz.length) { //
            System.out.println("Esta e uma matriz identidade!");
        } else {
            System.out.println("NAO e uma matriz identidade!");
        }
    }
}