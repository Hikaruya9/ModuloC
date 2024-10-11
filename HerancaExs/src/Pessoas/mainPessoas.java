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
        Funcionario funcionario = new Funcionario("Jorge", 47, "Tramandai - RS, Avenida Rubem Berta, 1420", "Diretor");
        Aluno aluno = new Aluno("Joao", 13, "Tramandai - RS, Avenida Fernandes Bastos, 937", "573985739");
        Professor prof = new Professor("Vinicius", 34, "Tramandai - RS, Rua Mario Totta, 524", "Fisica");
        
        funcionario.showInfo();
        System.out.println("----------------------------------------------------------");
        aluno.showInfo();
        System.out.println("----------------------------------------------------------");
        prof.showInfo();
    }
}