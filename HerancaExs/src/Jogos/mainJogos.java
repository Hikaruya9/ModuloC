/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Jogos;

/**
 *
 * @author Aluno
 */
public class mainJogos {

    public static void main(String[] args) {
        JogoCartas jc = new JogoCartas(4, 40);
        JogoTabuleiro jt = new JogoTabuleiro("Monopoly", true);
        JogoVideoGame jvg = new JogoVideoGame(false);
        
        jc.jogar();
        System.out.println("--------------------------------------");
        jt.jogar();
        System.out.println("--------------------------------------");
        jvg.jogar();
    }
}