/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionario;

/**
 *
 * @author macig
 */
public class mainFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Jorge", 2256.63, "Marketing");
        
        System.out.println("Nome: "+f1.getNome()+"\nSalario: "+f1.getSalario()+"\nDepartamento: "+f1.getDepartamento());

        System.out.printf("Salario com o aumento: %.2f\n",f1.aumentarSalario(50));
        
        f1.setNome("Cleber");
        System.out.println(f1.getNome());
    }
}
