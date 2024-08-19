/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geralexs;

/**
 *
 * @author Aluno
 */
public class GeralEx14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int soma;
        int n1 = 0, n2 = 1;

        for (int i = 0; i < 10; i++) {
            soma = n1 + n2;
            System.out.printf("[ " + n1 + " ]");
            n1 = n2;
            n2 = soma;
        }
        System.out.println("");
    }

}
