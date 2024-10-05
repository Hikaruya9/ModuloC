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
        JogoVideoGame jvg = new JogoVideoGame("PC", "Half-life 2");
        JogoTabuleiro jt = new JogoTabuleiro(2, 6, 30, 3);
        JogoCartas jc = new JogoCartas(2, 52, 4);
        
        jvg.iniciarJogo();
        jvg.jogar();
        jvg.finalizarJogo();
        System.out.println("------------------------------------------------------");
        jt.iniciarJogo();
        jt.jogar();
        jt.finalizarJogo();
        System.out.println("-------------------------------------------------------");
        jc.iniciarJogo();
        jc.jogar();
        jc.finalizarJogo();
    }
}