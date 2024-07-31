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
public class Exercicio16 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double cigarrosDia,anosFumando,tempoPerdido,tempoDias;
        
        System.out.println("Digite quantos cigarros sao fumados por dia: ");
        cigarrosDia = teclado.nextDouble();
        System.out.println("Digite ha quantos anos voce esta fumando: ");
        anosFumando = teclado.nextDouble();
        
        tempoPerdido = 10;
        tempoDias = (tempoPerdido*(cigarrosDia*(anosFumando*365)))/1440;
        
        System.out.println("Voce perdeu " + tempoDias + " dias da sua vida fumando.");
        
    }
    
}
