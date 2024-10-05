/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Pessoas;

/**
 *
 * @author Aluno
 */
public class mainPessoas {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Germano", "Assis Brasil EEMF", "9 ano", "91");
        Professor p1 = new Professor("Aline", "Assis Brasil EEMF", "Matematica", 2132.67);
        Funcionario f1 = new Funcionario("Gerson", "Assis Brasil EEMF", "Diretor", 3590.50);
        
        a1.apresentar();
        System.out.println("----------------------------------------------");
        p1.apresentar();
        System.out.println("----------------------------------------------");
        f1.apresentar();
    }
}