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
    private String department;

    public Gerente(String nome, double salario, String cargo, String department) {
        super(nome, salario, cargo);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void showInfo() {
        System.out.println("Nome: "+getNome());
        System.out.printf("Salario: R$%.2f\n",getSalario());
        System.out.println("Cargo: "+getCargo()+"\nDepartamento: "+getDepartment());
    }
}