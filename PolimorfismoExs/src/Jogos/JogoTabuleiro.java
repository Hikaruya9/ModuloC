/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jogos;

/**
 *
 * @author macig
 */
public class JogoTabuleiro implements Jogo {

    private int numeroDados;
    private int quantosLadosDado;
    private int quantasCasasTabuleiro;
    private int numeroJogadores;

    public JogoTabuleiro(int numeroDados, int quantosLadosDado, int quantasCasasTabuleiro, int numeroJogadores) {
        this.numeroDados = numeroDados;
        this.quantosLadosDado = quantosLadosDado;
        this.quantasCasasTabuleiro = quantasCasasTabuleiro;
        this.numeroJogadores = numeroJogadores;
    }

    @Override
    public void iniciarJogo() {
        System.out.println("Realocando "+this.numeroJogadores+" persongens para cada jogador na casa de inicio...");
    }

    @Override
    public void jogar() {
        System.out.println("----------------------------------------------------------------");
        for (int i = 0; i < this.numeroJogadores; i++) {
            System.out.println("Jogador " + (i + 1) + " jogou seu(s) dado(s)...");
        }
        System.out.println("----------------------------------------------------------------");
    }

    @Override
    public void finalizarJogo() {
        System.out.println("Recolhendo todos os personagens do tabuleiro e os dados...");
        System.out.println("Foram recuperados "+this.numeroDados+" dados e "+this.numeroJogadores+" personagens.");
    }
}
