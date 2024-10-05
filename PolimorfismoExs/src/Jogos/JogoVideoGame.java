/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jogos;

/**
 *
 * @author macig
 */
public class JogoVideoGame implements Jogo {

    private String VideoGame;
    private String jogo;

    public JogoVideoGame(String VideoGame, String jogo) {
        this.VideoGame = VideoGame;
        this.jogo = jogo;
    }
    
    @Override
    public void iniciarJogo() {
        System.out.println("Abrindo o jogo...\n");
        if (this.VideoGame.equalsIgnoreCase("PC")) {
            System.out.println(this.jogo.toUpperCase() + "\nPress ENTER to continue");
        } else {
            System.out.println(this.jogo.toUpperCase() + "\nPress START to continue");
        }
    }

    @Override
    public void jogar() {
        System.out.println("------------------------------");
        System.out.println("New Game");
        System.out.println("Continue");
        System.out.println("Options");
        System.out.println("Exit game");
        System.out.println("------------------------------");
    }

    @Override
    public void finalizarJogo() {
        System.out.println("Tem certeza que deseja sair?");
        System.out.println("Fechando o jogo....");
    }
}
