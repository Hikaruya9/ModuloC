/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Midias;

/**
 *
 * @author Aluno
 */
public class Jogo extends Midia{
    private String plataforma;
    private String classificacao;

    public Jogo(String titulo, String duracao, String plataforma, String classificacao) {
        super(titulo, duracao);
        this.plataforma = plataforma;
        this.classificacao = classificacao;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public void showInfo() {
        System.out.println("Jogo: "+titulo+"\nDuracao: "+duracao+"\nPlataforma: "+plataforma+"\nClassificacao: "+classificacao);
    }
}
