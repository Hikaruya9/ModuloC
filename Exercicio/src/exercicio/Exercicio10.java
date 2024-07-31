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
public class Exercicio10 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double altura,largura,area,tinta;
        
        System.out.println("Digite a altura da parede a ser pintada: ");
        altura = teclado.nextDouble();
        System.out.println("Digite a largura da parede a ser pintada: ");
        largura = teclado.nextDouble();
        
        area = largura * altura;
        tinta = area / 2;
        
        System.out.printf("A area a ser pintada e: " + area + "%n" + "A quantidade de tinta utilizada e: " + tinta + "L" + "%n");
        
    }
}
