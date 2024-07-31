/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Exercicio9 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double reais,dolares;
        
        System.out.println("Digite quanto você tem: " );
        reais = teclado.nextDouble();
        
        dolares = reais / 5.45;
        
        System.out.println("Com R$" + reais + " voce consegue comprar: US$" + dolares);
        
    }
}
