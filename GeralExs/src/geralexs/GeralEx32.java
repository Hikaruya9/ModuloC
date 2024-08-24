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
public class GeralEx32 {

    public static void checkPrime(int n) {
        int i, m = 0, flag = 0;
        m = n / 2;
        
        if (n == 0 || n == 1) {
            System.out.println(n + " is not prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                System.out.println(n + " is prime number");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type in a number:");
        int number = sc.nextInt();

        checkPrime(number);
    }
}
