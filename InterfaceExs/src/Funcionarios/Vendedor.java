/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionarios;

/**
 *
 * @author macig
 */
public class Vendedor implements Funcionario{
    private String nome;
    private double salarioBase;
    private int numeroVendas;
    private double bonusVenda;

    public Vendedor(String nome, double salarioBase, int numeroVendas, double bonusVenda) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.numeroVendas = numeroVendas;
        this.bonusVenda = bonusVenda;
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

    public int getNumeroVendas() {
        return numeroVendas;
    }

    public void setNumeroVendas(int numeroVendas) {
        this.numeroVendas = numeroVendas;
    }

    public double getBonusVenda() {
        return bonusVenda;
    }

    public void setBonusVenda(double bonusVenda) {
        this.bonusVenda = bonusVenda;
    }

    @Override
    public void calcularSalario() {
        double salarioFinal = salarioBase+(numeroVendas*bonusVenda);
        System.out.printf("O salario do vendedor sera de: R$%.2f\n", salarioFinal);
    }
}