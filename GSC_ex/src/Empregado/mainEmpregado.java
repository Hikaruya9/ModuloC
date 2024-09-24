/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empregado;

/**
 *
 * @author macig
 */
public class mainEmpregado {
    public static void main(String[] args) {
        Empregado e1 = new Empregado("Jorge", "Cozinheiro", 3250.89);
        Empregado e2 = new Empregado("Waldemir", "Garcom", 2540.57);
        
        System.out.println("Nome: "+e1.getNome()+"\nCargo: "+e1.getCargo());
        System.out.printf("Salario: R$%.2f\n",e1.getSalario());
        System.out.printf("Bonus salarial: R$%.2f\n",e1.calcularBonus());
        System.out.println("");
        System.out.println("Nome: "+e2.getNome()+"\nCargo: "+e2.getCargo());
        System.out.printf("Salario: R$%.2f\n",e2.getSalario());
        System.out.println("");
        
        e1.setSalario(3785.90);
        e2.setCargo("Gerente");
        e2.setSalario(5278.80);
        
        System.out.println("Nome: "+e1.getNome()+"\nCargo: "+e1.getCargo());
        System.out.printf("Salario: R$%.2f\n",e1.getSalario());
        System.out.println("");
        System.out.println("Nome: "+e2.getNome()+"\nCargo: "+e2.getCargo());
        System.out.printf("Salario: R$%.2f\n",e2.getSalario());
        System.out.printf("Bonus salarial: R$%.2f\n",e2.calcularBonus());
        
    }
}
