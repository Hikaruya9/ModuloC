/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pessoas;

/**
 *
 * @author macig
 */
public class Aluno extends Pessoa {
    private String nome;
    private String escola;
    private String anoEscolar;
    private String turma;

    public Aluno(String nome, String escola, String anoEscolar, String turma) {
        this.nome = nome;
        this.escola = escola;
        this.anoEscolar = anoEscolar;
        this.turma = turma;
    }

    @Override
    public void apresentar() {
        System.out.println("Nome do aluno: "+this.nome+"\nEscola: "+this.escola+"\nAno que esta cursando: "+this.anoEscolar+"\nTurma: "+this.turma);
    }
}