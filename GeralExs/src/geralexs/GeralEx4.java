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
public class GeralEx4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um numero:");
        int numero1 = teclado.nextInt();
        System.out.println("Digite outro numero");
        int numero2 = teclado.nextInt();
        
        if(numero1 > numero2) {
            System.out.println("O maior numero e o "+numero1);
        } else {
            System.out.println("O maior numero e o "+numero2);
        }
    }
}
