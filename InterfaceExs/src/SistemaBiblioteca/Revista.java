/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaBiblioteca;

/**
 *
 * @author macig
 */
public class Revista implements Midia {

    private String titulo;
    private String autor;
    private boolean disponivel;

    public Revista(String titulo, String autor, boolean disponivel) {
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
        System.out.println("Titulo da revista: " + this.titulo);
    }

    @Override
    public void obterAutor() {
        System.out.println("Autor da revista: " + this.autor);
    }

    @Override
    public void emprestar() {
        if (!disponivel) {
            System.out.println("Desculpe, mas nao temos mais dessa revista disponivel.");
        } else {
            this.disponivel = false;
            System.out.println("Aproveite a revista!");
        }
    }
}
