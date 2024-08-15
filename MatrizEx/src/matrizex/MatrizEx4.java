/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizex;

/**
 *
 * @author Aluno
 */
public class MatrizEx4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int somaP = 0, somaSec = 0;

        for (int i = 0; i < 3; i++) { //Traz os valores da matriz
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) ((Math.random() * 9) + 1);
            }
        }

        for (int i = 0; i < 3; i++) { //Matriz imprimida
            for (int j = 0; j < 3; j++) {
                System.out.printf(matriz[i][j] + " ");

                if (i == j) {
                    somaP += matriz[i][j];
                }

                if (i + j == 2) {
                    somaSec += matriz[i][j];
                }
            }
            System.out.println("");
        }

        //Traz os resultados das somas das diagonais
        System.out.println("------------------------------------------------------");
        System.out.println("A soma da diagonal principal da matriz e " + somaP);
        System.out.println("A soma da diagonal secundaria da matriz e " + somaSec);
    }
}
