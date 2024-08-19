/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geralexs;

/**
 *
 * @author Aluno
 */
public class GeralEx24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        System.out.println("Matriz completa:");
        for (int row = 0; row < matriz.length; row++) {
            for (int col = 0; col < matriz.length; col++) {
                matriz[row][col] = (int) (Math.random() * 10) + 1;
                System.out.printf(matriz[row][col]+" ");
            }
            System.out.println("");
        }

        System.out.println("--------------------------");
        for (int row = 0; row < matriz.length; row++) {
            int somaRow = 0;
            int somaCol = 0;
            for (int col = 0; col < matriz.length; col++) {
                somaRow += matriz[row][col];
                somaCol += matriz[col][row];
            }
            System.out.println("A soma da linha " + (row+1) + " e " + somaRow);
            System.out.println("A soma da coluna " + (row+1) + " e " + somaCol);
        }
    }
}
