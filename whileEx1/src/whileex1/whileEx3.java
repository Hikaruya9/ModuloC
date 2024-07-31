/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whileex1;

import java.util.Scanner;
/**
 *
 * @author TI
 */
public class whileEx3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int idadeAluno,soma = 0,contAlunos = 0,mediaIdades;
        
        do {
            System.out.println("Digite a idade do aluno: ");
            idadeAluno = leia.nextInt();
            
            switch (idadeAluno) {
                case 999:
                    break;
                default:
                    soma += idadeAluno;
                    contAlunos++;
            }
        } while (idadeAluno != 999);
        
        mediaIdades = soma/contAlunos;
        System.out.println("Tem " + contAlunos + " alunos na turma");
        System.out.println("A media de idade da turma e: " + mediaIdades + " anos");
    }
}
