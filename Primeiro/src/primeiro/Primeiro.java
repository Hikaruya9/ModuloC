/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primeiro;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class Primeiro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
      /*String nome;
        System.out.println("Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.println("O nome digitado e: " + nome); */
// Crie um algoritmo que pergunte o nome do aluno, pergunte a Nota1 e a Nota2, calcule a média e mostre o nome do aluno e sua média
        
        String nome;
        double Nota1;
        double Nota2;
        double soma;
        double media;
        
        System.out.println("Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.println("Digite sua primeira Nota: ");
        Nota1 = teclado.nextDouble();
        System.out.println("Digite sua segunda Nota: ");
        Nota2 = teclado.nextDouble();
        soma = Nota1 + Nota2;
        media = (soma) / 2;
        
        System.out.printf("Seu nome e: " + nome + "%n" + "A media de suas notas e: " + media + "%n");
        
    }
    
}