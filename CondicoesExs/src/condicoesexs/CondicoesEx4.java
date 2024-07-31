/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicoesexs;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class CondicoesEx4 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int numero,teste;
        
        System.out.println("Digite um numero inteiro: ");
        numero = teclado.nextInt();
        
        teste = numero % 2;
        
        if (teste == 1) {
            System.out.println("O numero " + numero + " e impar");
        } else {
            System.out.println("O numero " + numero + " e par");
        }
        
    }
    
}
