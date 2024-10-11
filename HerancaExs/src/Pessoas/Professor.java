/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pessoas;

/**
 *
 * @author Aluno
 */
public class Professor extends Pessoa {

    private String disciplina;

    public Professor(String nome, int idade, String adress, String disciplina) {
        super(nome, idade, adress);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void showInfo() {
        System.out.println("Nome: " + getNome() + "\nIdade: " + getIdade() + "\nEndereco: " + getAdress() + "\nDisciplina: " + getDisciplina());
    }
}
