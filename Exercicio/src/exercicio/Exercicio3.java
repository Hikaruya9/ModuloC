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
public class Exercicio3 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Importa o Scanner
        Scanner teclado = new Scanner(System.in);
        //Declara as var
        String nome;
        double salario;
        //Guarda o nome e o salário
        System.out.println("Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.println("Digite seu salario: ");
        salario = teclado.nextDouble();
        //Mostra uma mensagem na tela
        System.out.println("O funcionario " + nome + "tem um salario de R$" + salario + " em Junho.");
        
    }
}
