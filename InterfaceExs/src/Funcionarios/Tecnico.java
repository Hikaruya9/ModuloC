/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionarios;

/**
 *
 * @author macig
 */
public class Tecnico implements Funcionario {
    private String nome;
    private double salarioBase;
    private double numeroConsertos;
    private double bonusConserto;

    public Tecnico(String nome, double salarioBase, int numeroConsertos, double bonusConserto) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.numeroConsertos = numeroConsertos;
        this.bonusConserto = bonusConserto;
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

    public double getNumeroConsertos() {
        return numeroConsertos;
    }

    public void setNumeroConsertos(double numeroConsertos) {
        this.numeroConsertos = numeroConsertos;
    }
    
    public double getBonusConserto() {
        return bonusConserto;
    }

    public void setBonusConserto(double bonusConserto) {
        this.bonusConserto = bonusConserto;
    }

    @Override
    public void calcularSalario() {
        double salarioFinal = salarioBase+(numeroConsertos*bonusConserto);
        System.out.printf("O salario do tecnico sera de: R$%.2f\n", salarioFinal);
    }
}