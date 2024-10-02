/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionarios;

/**
 *
 * @author macig
 */
public class Gerente implements Funcionario {
    private String nome;
    private double salarioBase;
    private double lucrosGerais;

    public Gerente(String nome, double salarioBase, double lucrosGerais) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.lucrosGerais = lucrosGerais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getLucrosGerais() {
        return lucrosGerais;
    }

    public void setLucrosGerais(double lucrosGerais) {
        this.lucrosGerais = lucrosGerais;
    }

    @Override
    public void calcularSalario() {
        double salarioFinal = salarioBase+((lucrosGerais/100)*10);
        System.out.printf("O salario do gerente sera de: R$%.2f\n", salarioFinal);
    }
}