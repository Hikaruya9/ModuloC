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
public class CondicoesEx5 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int ano,teste;
        
        System.out.println("Digite o ano que deseja verificar: ");
        ano = teclado.nextInt();
        
        teste = ano % 4;
        
        if (teste != 0) {
            System.out.println("O ano nao e bissexto");
        } else {
            System.out.println("O ano e bissexto");
        }
        
    }
    
}
