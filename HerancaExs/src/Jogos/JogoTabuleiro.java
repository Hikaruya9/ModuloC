/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jogos;

/**
 *
 * @author Aluno
 */
public class JogoTabuleiro extends Jogo{
    private String temaTabuleiro;
    private boolean doisDados;

    public JogoTabuleiro(String temaTabuleiro, boolean doisDados) {
        this.temaTabuleiro = temaTabuleiro;
        this.doisDados = doisDados;
    }

    public String getTemaTabuleiro() {
        return temaTabuleiro;
    }

    public void setTemaTabuleiro(String temaTabuleiro) {
        this.temaTabuleiro = temaTabuleiro;
    }

    public boolean isDoisDados() {
        return doisDados;
    }

    public void setDoisDados(boolean doisDados) {
        this.doisDados = doisDados;
    }

    @Override
    public void jogar() {
        if (doisDados) {
            System.out.println("Iniciando o tabuleiro de tema "+getTemaTabuleiro()+"!");
        } else {
            System.out.println("Infelizmente esta faltando os dados para jogar o jogo.");
        }
    }
}