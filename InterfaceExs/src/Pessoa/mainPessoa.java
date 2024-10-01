/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Pessoa;

/**
 *
 * @author Aluno
 */
public class mainPessoa {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Jorge", 52);
        Pessoa p2 = new Pessoa("Waldemir", 39);
        Pessoa p3 = new Pessoa("Cleiton", 40);
        Pessoa p4 = new Pessoa("Pablo", 40);
        Pessoa p5 = new Pessoa("Arthur", 35);
        
        p1.comparaIdade(p2);
        p3.comparaIdade(p4);
        p5.comparaIdade(p1);
    }
}