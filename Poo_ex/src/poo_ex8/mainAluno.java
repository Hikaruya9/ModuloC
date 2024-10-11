/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ex8;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class mainAluno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double notas[] = new double[3];
        Aluno a1 = new Aluno("Joao", "53728484", notas);
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Insira a nota do aluno: "+a1.getNome());
            notas[i] = sc.nextDouble();
        }
        
        System.out.printf("Media das notas do aluno "+a1.getNome()+" de matricula "+a1.getMatricula()+": %.1f\n", a1.calcularMedia());
    }
}
