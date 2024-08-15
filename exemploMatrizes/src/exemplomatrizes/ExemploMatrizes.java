/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplomatrizes;

/**
 *
 * @author Aluno
 */
public class ExemploMatrizes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] tabuada = new int[10][10];

        for (int i = 0; i < 10; i++) { //Linha
            for (int j = 0; j < 10; j++) { //Coluna
                tabuada[i][j] = (i + 1) * (j + 1);
            }
        }

        //Imprimindo tabuada
        for (int i = 0; i < 10; i++) {
            System.out.println("Tabuada do " + (i+1));
            for (int j = 0; j < 10; j++) {
                System.out.println((i+1) + " x " + (j+1) + " = " + tabuada[i][j]);
            }
            System.out.println("-------------------------------");
        }
    }
}