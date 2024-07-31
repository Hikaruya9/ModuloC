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
public class Exercicio12 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double precoBase,desconto,precoFinal;
        
        System.out.println("Digite o valor do produto: ");
        precoBase = teclado.nextDouble();
        
        desconto = (precoBase / 100) * 5;
        precoFinal = precoBase - desconto;
        
        System.out.println("O valor do produto com o desconto promocional e: R$" + precoFinal);
        
    }
}
