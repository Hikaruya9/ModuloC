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
public class CondicoesEx2 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int anoAtual,anoNascimento,idade;
        
        System.out.println("Digite o ano atual: ");
        anoAtual = teclado.nextInt();
        System.out.println("Digite seu ano de nascimento: ");
        anoNascimento = teclado.nextInt();
        
        idade = anoAtual - anoNascimento;
        
        System.out.println("Sua idade: " + idade);
        
        if (idade >= 16) {
            System.out.println("Voce pode votar!");
        } else {
            System.out.println("Voce nao pode votar!");
        }
        
    }
    
}
