/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jogos;

/**
 *
 * @author Aluno
 */
public class JogoCartas extends Jogo{
    private int numeroJogadores;
    private int cartasBaralho;

    public JogoCartas(int numeroJogadores, int cartasBaralho) {
        this.numeroJogadores = numeroJogadores;
        this.cartasBaralho = cartasBaralho;
    }
    
    public void setNumeroJogadores(int numeroJogadores) {
        this.numeroJogadores = numeroJogadores;
    }

    public void setCartasBaralho(int cartasBaralho) {
        this.cartasBaralho = cartasBaralho;
    }

    @Override
    public void jogar() {
        if (cartasBaralho/numeroJogadores > 7 && cartasBaralho%numeroJogadores > 0) {
            System.out.println("Foram distribuidas as cartas entre os "+numeroJogadores);
        } else if (cartasBaralho/numeroJogadores == 7 && cartasBaralho%numeroJogadores == 0) {
            System.out.println("O jogo pode ser iniciado, mas nao temos cartas restantes no baralho para continuar.");
        } else {
            System.out.println("Infelizmente nao temos cartas suficientes no baralho para jogar com "+numeroJogadores+" jogadores.");
        }
    }
}