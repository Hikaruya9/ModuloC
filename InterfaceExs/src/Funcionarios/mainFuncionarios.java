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
        Gerente g1 = new Gerente("Jorge", 8500.30, 59000.54);
        Vendedor v1 = new Vendedor("Cleber", 1952.40, 59, 20.00);
        Tecnico t1 = new Tecnico("Gerson", 1520.90, 5, 15.00);
        
        g1.calcularSalario();
        v1.calcularSalario();
        t1.calcularSalario();
    }
}