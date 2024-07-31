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
public class Exercicio13 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double salario,aumento,salarioFinal;
        
        System.out.println("Digite o seu salario: ");
        salario = teclado.nextDouble();
        
        aumento = (salario / 100) * 15;
        salarioFinal = salario + aumento;
        
        System.out.println("O seu salario com o aumento aplicado sera de: R$" + salarioFinal);
        
    }
}
