/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pessoas;

/**
 *
 * @author Aluno
 */
public class Aluno extends Pessoa {

    private String matricula;

    public Aluno(String nome, int idade, String adress, String matricula) {
        super(nome, idade, adress);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void showInfo() {
        System.out.println("Nome: " + getNome() + "\nIdade: " + getIdade() + "\nEndereco: " + getAdress() + "\nMatricula: " + getMatricula());
    }
}
