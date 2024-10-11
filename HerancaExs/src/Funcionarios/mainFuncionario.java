/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Funcionarios;

/**
 *
 * @author Aluno
 */
public class mainFuncionario {

    public static void main(String[] args) {
        Gerente manager = new Gerente("Jorge", 9270.60, "Gerente", "Marketing");
        Desenvolvedor dev = new Desenvolvedor("Lucas", 4210.90, "Desenvolvedor", "Python");
        Vendedor ven = new Vendedor("Cleiton", 3560.00, "Vendedor", 15.00);
        
        manager.showInfo();
        System.out.println("----------------------------------");
        dev.showInfo();
        System.out.println("----------------------------------");
        ven.showInfo();
    }
    
}
