/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pessoas;

/**
 *
 * @author macig
 */
public class Funcionario extends Pessoa {

    private String nome;
    private String empresaAtual;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String empresaAtual, String cargo, double salario) {
        this.nome = nome;
        this.empresaAtual = empresaAtual;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    @Override
    public void apresentar() {
        System.out.printf("Nome do funcionario: " + this.nome + "\nEmpresa: " + this.empresaAtual + "\nCargo na empresa: " + this.cargo + "\nSalario: R$%.2f\n", this.salario);
    }
}
