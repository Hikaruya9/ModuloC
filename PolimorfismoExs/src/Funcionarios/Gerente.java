/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionarios;

/**
 *
 * @author Aluno
 */
public class Gerente extends Funcionario{
    private double lucrosSede;
    private int percentualLucros;

    public Gerente(String nome, double salario, double lucrosSede,int percentualLucros) {
        super(nome, salario);
        this.lucrosSede = lucrosSede;
        this.percentualLucros = percentualLucros;
    }
    
    @Override
    public void calcularBonus() {
        double bonus = (this.lucrosSede/100)*this.percentualLucros;
        System.out.printf("Bonus: R$%.2f\n", bonus);
        System.out.printf("Salario com bonus aplicado: R$%.2f\n", (bonus+salario));
    }
}