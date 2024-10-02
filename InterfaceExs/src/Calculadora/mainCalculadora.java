/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Calculadora;

/**
 *
 * @author Aluno
 */
public class mainCalculadora {

    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();
        
        int n1 = 24;
        int n2 = 6;
        
        soma.calcular(n1, n2);
        subtracao.calcular(n1, n2);
        multiplicacao.calcular(n1, n2);
        divisao.calcular(n1, n2);
    }
}