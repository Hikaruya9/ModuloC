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
public class GeralEx16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um ano:");
        int ano = sc.nextInt();

        if (ano % 100 == 0 && ano % 400 != 0) {
            System.out.println("Esse nao e um ano bissexto!");
        } else if (ano % 4 == 0) {
            System.out.println("Esse e um ano bissexto!");
        } else {
            System.out.println("Esse nao e um ano bissexto!");
        }
    }
}
