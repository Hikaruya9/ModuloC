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
public class Exercicio8 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        float metros,quilometros,decimetros,centimetros;
        
        System.out.println("Digite a distancia em metros: ");
        metros = teclado.nextFloat();
        
        quilometros = metros / 1000;
        decimetros = metros * 10;
        centimetros = metros * 100;
        
        System.out.printf("A distancia de " + metros + "m corresponde a: " + "%n" + quilometros + "Km" + "%n" + decimetros + "dm" + "%n" + centimetros + "cm" + "%n");
        
    }
    
}
