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
public class CondicoesEx6 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int anoAtual,anoNascimento,idade,anosRestantes,anosPassados;
        
        System.out.println("Digite o ano atual: ");
        anoAtual = teclado.nextInt();
        System.out.println("Digite seu ano de nascimento: ");
        anoNascimento = teclado.nextInt();
        
        idade = anoAtual - anoNascimento;
        
        if (idade < 18) {
            anosRestantes = 18 - idade;
            System.out.println("Ainda faltam " + anosRestantes + " para pode se alistar");
        } else {
            anosPassados = idade - 18;
            System.out.println("Ja se passaram " + anosPassados + " desde o alistamento");
        }
        
    }
    
}
