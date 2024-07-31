/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculoimc;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class CalculoIdade {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int anoAtual,anoNascimento,idade;
        
        System.out.println("DEPARTAMENTO DE TRAGOS");
        
        System.out.println("Digite o ano atual: ");
        anoAtual = teclado.nextInt();
        System.out.println("digite seu ano de nascimento: ");
        anoNascimento = teclado.nextInt();
        
        idade = anoAtual - anoNascimento;
        
        System.out.println("Idade: " + idade);
        
        if (idade >= 18) {
            System.out.println("Voce esta apto para beber!");
        } else {
            System.out.println("Voce deveria voltar a beber nescau!");
        }
    }
}
