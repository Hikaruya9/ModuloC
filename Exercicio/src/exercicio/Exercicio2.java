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
public class Exercicio2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //importação do Scanner
        Scanner teclado = new Scanner(System.in);
        //declara a var do nome
        String nome;
        //Guarda o nome digitado na var
        System.out.println("Digite seu nome: ");
        nome = teclado.nextLine();
        //Mostra uma mensagem na tela
        System.out.println("Ola " + nome + ", e um prazer te conhecer!");
        
    }
    
}
