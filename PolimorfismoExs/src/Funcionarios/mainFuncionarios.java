/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Funcionarios;

/**
 *
 * @author Aluno
 */
public class mainFuncionarios {

    public static void main(String[] args) {
        Vendedor v1 = new Vendedor("Jorge", 2529.90,10.00, 30);
        Gerente g1 = new Gerente("Pedro", 9390.00, 59530.54, 15);
        Desenvolvedor d1 = new Desenvolvedor("Joao", 4167.90, 15, 30.50);
        
        v1.calcularBonus();
        g1.calcularBonus();
        d1.calcularBonus();
    }
}