/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Midias;

/**
 *
 * @author Aluno
 */
public class mainMidias {

    public static void main(String[] args) {
        Musica music = new Musica("Black Sabbath", "6:20", "Black Sabbath", "Black Sabbath");
        Filme movie = new Filme("Blade Runner", "2h2m", "Ridley Scott", "Sci-Fi, Mystery & Thriller");
        Jogo game = new Jogo("Half-Life 2", "12h", "PC(steam), Xbox, Playstation 3", "PEGI 16, Adult(M)");
        
        music.showInfo();
        System.out.println("---------------------------------");
        movie.showInfo();
        System.out.println("---------------------------------");
        game.showInfo();
    }
}