/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaBiblioteca;

/**
 *
 * @author macig
 */
public class Livro implements Midia {

    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public void obterTitulo() {
        System.out.println("Titulo do livro: " + this.titulo);
    }

    @Override
    public void obterAutor() {
        System.out.println("Autor do livro: " + this.autor);
    }

    @Override
    public void emprestar() {
        if (!disponivel) {
            System.out.println("Desculpe, mas nao temos mais desse livro disponivel.");
        } else {
            this.disponivel = false;
            System.out.println("Aproveite o livro!");
        }
    }
}
