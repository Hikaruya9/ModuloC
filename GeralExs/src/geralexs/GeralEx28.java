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
public class GeralEx28 {

    public static boolean verifyEvenOdd(int numero) {
        boolean result = false;
        if (numero%2 == 0) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Type in a number:");
        int number = sc.nextInt();
        
        System.out.println("Is it an even number?\n"+verifyEvenOdd(number));
    }
}
