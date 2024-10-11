/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionarios;

/**
 *
 * @author Aluno
 */
public class Vendedor extends Funcionario {

    private double comissao;

    public Vendedor(String nome, double salario, String cargo, double comissao) {
        super(nome, salario, cargo);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public void showInfo() {
        System.out.println("Nome: " + getNome());
        System.out.printf("Salario: R$%.2f\n", getSalario());
        System.out.printf("Cargo: " + getCargo() + "\nComissao (valor fixo): R$%.2f\n", getComissao());
    }
}
