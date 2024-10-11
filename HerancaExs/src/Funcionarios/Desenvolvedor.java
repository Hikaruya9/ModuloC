/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionarios;

/**
 *
 * @author Aluno
 */
public class Desenvolvedor extends Funcionario{
    private String linguagemProgramacao;

    public Desenvolvedor(String nome, double salario, String cargo, String linguagemProgramacao) {
        super(nome, salario, cargo);
        this.linguagemProgramacao = linguagemProgramacao;
    }

    public String getLinguagemProgramacao() {
        return linguagemProgramacao;
    }

    public void setLinguagemProgramacao(String linguagemProgramacao) {
        this.linguagemProgramacao = linguagemProgramacao;
    }
    
    public void showInfo() {
        System.out.println("Nome: " + getNome());
        System.out.printf("Salario: R$%.2f\n", getSalario());
        System.out.println("Cargo: " + getCargo() + "\nLinguagem de programacao: "+getLinguagemProgramacao());
    }
}