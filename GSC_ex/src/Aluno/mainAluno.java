/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aluno;

import java.lang.reflect.Array;
/**
 *
 * @author Aluno
 */
public class mainAluno {
    public static void main(String[] args) {
        double notas[] = {7.50, 8, 9.25};
        Aluno a1 = new Aluno("Jorge","8394275-3", notas);
        
        System.out.println("Nome: "+a1.getNome()+"\nMatricula: "+a1.getMatricula()+"\nNotas: "+a1.getNotas());
        
        System.out.printf("Media: %.2f\n", a1.calcularMedia());
        
        a1.setNome("Cleiton");
        a1.setMatricula("8395285-3");
        Array.set(notas, 0, 8);
        Array.set(notas, 1, 7.25);
        Array.set(notas, 2, 9);
        
        System.out.printf("Media: %.2f\n", a1.calcularMedia());
    }
}
