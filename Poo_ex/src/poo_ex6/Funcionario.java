/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ex6;

/**
 *
 * @author macig
 */
public class Funcionario {
    String nome;
    double salario;
    String departamento;
    
    public void aumentarSalario(double percentual) {
        if (percentual <= 0) {
            System.out.println("Percentual invalido para um aumento");
        } else {
            double salarioAnterior = salario;
            salarioAnterior *= (percentual/100);
            salario += salarioAnterior;
            System.out.printf("O novo salario atualizado com acrescimo e de R$:%.2f\n",salario,"\n");
        }
    }
}
