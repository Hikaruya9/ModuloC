/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionarios;

/**
 *
 * @author Aluno
 */
public class Vendedor extends Funcionario{
    private double bonusVenda;
    private int quantidadeVendas;

    public Vendedor(String nome, double salario, double bonusVenda, int quantidadeVendas) {
        super(nome, salario);
        this.bonusVenda = bonusVenda;
        this.quantidadeVendas = quantidadeVendas;
    }

    @Override
    public void calcularBonus() {
        double bonus = this.bonusVenda*this.quantidadeVendas;
        System.out.printf("Bonus: R$%.2f\n", bonus);
        System.out.printf("Salario com bonus aplicado: R$%.2f\n", (bonus+salario));
    }
}