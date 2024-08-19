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
public class GeralEx22 {

    public static boolean checkPalindrome(String palavra) {
        boolean resultado = false;
        String reverse = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            reverse += palavra.charAt(i);
        }

        if (palavra.equals(reverse)) {
            resultado = true;
        }

        return resultado;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String palavra = sc.nextLine();
        palavra = palavra.toLowerCase();

        System.out.println("A palavra digitada e um palindromo?\n" + checkPalindrome(palavra));
    }
}
