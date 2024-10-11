/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Midias;

/**
 *
 * @author Aluno
 */
public class Filme extends Midia{
    private String diretor;
    private String genero;

    public Filme(String titulo, String duracao, String diretor, String genero) {
        super(titulo, duracao);
        this.diretor = diretor;
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public void showInfo() {
        System.out.println("Filme: "+titulo+"\nDuracao: "+duracao+"\nDiretor: "+diretor+"\nGenero: "+genero);
    }
}