/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package SistemaBiblioteca;

/**
 *
 * @author Aluno
 */
public class mainSistemaBiblioteca {

    public static void main(String[] args) {
        DVD dvd1 = new DVD("Black Sabbath", "Black Sabbath", true);
        Revista r1 = new Revista("Imperio de Diddy: O que esconde o famoso produtor musical?" ,"Rolling Stones", true);
        Livro l1 = new Livro("1984", "George Orwell", false);
        
        dvd1.obterTitulo();
        dvd1.obterAutor();
        dvd1.emprestar();
        System.out.println("--------------------------------------------------------------------");
        r1.obterTitulo();
        r1.obterAutor();
        r1.emprestar();
        System.out.println("--------------------------------------------------------------------");
        l1.obterTitulo();
        l1.obterAutor();
        l1.emprestar();
    }
}