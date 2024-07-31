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
public class Exercicio14 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double dias,quilometros,valorDias,valorKm,valorTotal;
        
        System.out.println("Digite quantos quilometros foram rodados com o carro: ");
        quilometros = teclado.nextDouble();
        System.out.println("digite quantos dias o carro foi alugado: ");
        dias = teclado.nextDouble();
        
        valorDias = dias * 90;
        valorKm = quilometros * 0.20;
        valorTotal = valorDias + valorKm;
        
        System.out.println("O valor cobrado devera ser de: R$" + valorTotal);
        
    }
}
