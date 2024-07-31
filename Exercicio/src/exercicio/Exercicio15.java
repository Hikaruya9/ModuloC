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
public class Exercicio15 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double dias,horasTrabalhadas,valorHora,salarioFinal;
        
        System.out.println("Digite quantos dias voce trabalhou nesse mes: ");
        dias = teclado.nextDouble();
        
        horasTrabalhadas = 8;
        valorHora = 25;
        
        salarioFinal = (horasTrabalhadas * valorHora) * dias;
        
        System.out.println("O salario que caira nesse mes sera de: R$" + salarioFinal);
        
    }   
}
