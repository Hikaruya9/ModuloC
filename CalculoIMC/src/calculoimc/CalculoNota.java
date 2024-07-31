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
public class CalculoNota {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double nota1,nota2,notaMedia;
        
        System.out.println("ESCOLA DE NERDS");
        
        System.out.println("Digite sua primeira nota: ");
        nota1 = teclado.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        nota2 = teclado.nextDouble();
        
        notaMedia = (nota1 + nota2) / 2;
        
        System.out.printf("Sua m edia: %.1f\n", notaMedia);
        
        if (notaMedia < 7.0) {
            System.out.println("ALUNO REPROVADO");
        } else {
            System.out.println("ALUNO APROVADO");
        }
        
    }
    
}
