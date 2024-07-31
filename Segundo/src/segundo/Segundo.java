/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package segundo;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Segundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        /*x²-3x-54=0
        x1=9
        x2=-6 */
        double a,b,c,delta,x1,x2;
        
        System.out.println("Digite o valor de a: ");
        a = teclado.nextDouble();
        System.out.println("Digite o valor de b: ");
        b = teclado.nextDouble();
        System.out.println("Digite o valor de c: ");
        c = teclado.nextDouble();
        delta = Math.sqrt(Math.pow(b, 2)-4*a*c);
        x1 = (-b+(delta))/(2*a);
        x2 = (-b-(delta))/(2*a);
        
        System.out.printf("O valor de X1 e: " + x1 + "%n" + "O valor de X2 e: " + x2 + "%n");
        
    }
    
}