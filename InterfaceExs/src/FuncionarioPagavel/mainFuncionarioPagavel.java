/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package FuncionarioPagavel;

/**
 *
 * @author Aluno
 */
public class mainFuncionarioPagavel {

    public static void main(String[] args) {
        FuncionarioAssalariado fa1 = new FuncionarioAssalariado("Jorge","Redator", 1412.90, 40, 4);
        FuncionarioHorista fh1 = new FuncionarioHorista("Cleiton","Editor", 6.77, 80);
        
        fa1.calcularPagamento();
        fh1.calcularPagamento();
    }
}