/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jogos;

/**
 *
 * @author macig
 */
public class JogoCartas implements Jogo{
    private int numeroBaralhos;
    private int numeroCartasBaralho;
    private int numeroJogadores;

    public JogoCartas(int numeroBaralhos, int numeroCartasBaralho, int numeroJogadores) {
        this.numeroBaralhos = numeroBaralhos;
        this.numeroCartasBaralho = numeroCartasBaralho;
        this.numeroJogadores = numeroJogadores;
    }

    @Override
    public void iniciarJogo() {
        System.out.println("Distribuindo 9 cartas por jogador...");
        System.out.println("Ficou um total de "+((this.numeroCartasBaralho*this.numeroBaralhos)-(this.numeroJogadores*9))+" cartas restantes no baralho.");
    }

    @Override
    public void jogar() {
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < this.numeroJogadores; i++) {
            System.out.println("Jogador "+(i+1)+" trocou uma carta...");
        }
        System.out.println("-----------------------------------------------------");
    }

    @Override
    public void finalizarJogo() {
        System.out.println("Recolhendo todas as cartas distribuidas e jogadas...");
        System.out.println("Foram recuperadas todas as "+(this.numeroBaralhos*this.numeroCartasBaralho)+" cartas do(s) baralho(s).");
    }
}