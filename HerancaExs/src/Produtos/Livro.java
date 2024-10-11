/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Produtos;

/**
 *
 * @author Aluno
 */
public class Livro extends Produto{
    private String autor;
    private String isbn;

    public Livro(String nome, double preco, String autor, String isbn) {
        super(nome, preco);
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public void showInfo() {
        System.out.println("Livro: "+getNome());
        System.out.printf("Preco: R$%.2f\n",getPreco());
        System.out.println("Autor: "+getAutor()+"\nISBN: "+getIsbn());
    }
}