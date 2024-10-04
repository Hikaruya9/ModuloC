/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionarios;

/**
 *
 * @author Aluno
 */
public class Desenvolvedor extends Funcionario{
    private int tasksRealizadas;
    private double bonusTask;

    public Desenvolvedor(String nome, double salario, int tasksRealizadas, double bonusTask) {
        super(nome, salario);
        this.tasksRealizadas = tasksRealizadas;
        this.bonusTask = bonusTask;
    }
    
    @Override
    public void calcularBonus() {
        double bonus = this.tasksRealizadas*this.bonusTask;
        System.out.printf("Bonus: R$%.2f\n", bonus);
        System.out.printf("Salario com bonus aplicado: R$%.2f\n", (bonus+salario));
    }
}