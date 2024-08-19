/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geralexs;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class GeralEx17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;

        System.out.println("Digite um numero:");
        int n1 = sc.nextInt();
        System.out.println("Digite outro numero:");
        int n2 = sc.nextInt();

        while (n1 % n2 != 0) {
            temp = n1 % n2;
            n1 = n2;
            n2 = temp;
        }
        System.out.println("O MDC dos numeros e " + n2);
    }
}
