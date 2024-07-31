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
public class CondicoesEx3 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String nome;
        double nota1,nota2,media;
        
        System.out.print("Digite o nome do aluno: ");
        nome = teclado.nextLine();
        System.out.print("Digite a primeira nota do aluno: ");
        nota1 = teclado.nextDouble();
        System.out.println("Digite a segunda nota do aluno: ");
        nota2 = teclado.nextDouble();
        
        media = (nota1+nota2) / 2;
        
        System.out.printf("O aluno " + nome + " teve uma media de %.1f\n", media);
        
        if (media >= 7) {
            System.out.println("O aluno teve um bom aproveitamento");
        } else {
            System.out.println("O aluno reprovou");
        }
        
    }
}
