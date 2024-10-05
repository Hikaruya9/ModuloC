/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pessoas;

/**
 *
 * @author macig
 */
public class Professor extends Pessoa{
    private String nome;
    private String escolaLeciona;
    private String materia;
    private double salario;

    public Professor(String nome, String escolaLeciona, String materia, double salario) {
        this.nome = nome;
        this.escolaLeciona = escolaLeciona;
        this.materia = materia;
        this.salario = salario;
    }
    
    @Override
    public void apresentar() {
        System.out.printf("Nome do professor: " + this.nome + "\nEscola em que trabalha: " + this.escolaLeciona + "\nMateria que leciona: " + this.materia + "\nSalario: R$%.2f\n", this.salario);
    }
}
