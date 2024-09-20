/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pessoa;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Fedelho",17,1.65);
        
        System.out.println("Nome: "+p1.getNome());
        System.out.println("Idade: "+p1.getIdade());
        System.out.println("Altura: "+p1.getAltura());
        
        p1.setNome("Jorge");
        p1.setIdade(54);
        p1.setAltura(1.74);
        
        System.out.println("Nome: "+p1.getNome());
        System.out.println("Idade: "+p1.getIdade());
        System.out.println("Altura: "+p1.getAltura());
    }
}
