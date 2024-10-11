/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Eventos;

/**
 *
 * @author Aluno
 */
public class mainEventos {

    public static void main(String[] args) {
        Show show = new Show("Rock in Rio", "24/10/2024", "Slipknot");
        Palestra pal = new Palestra("Dominando a Inteligencia Artificial", "06/07/2024", "Gustavo Silva");
        Workshop ws = new Workshop("Planejamento estrategico de carreira", "10/08/2024", "Laura Brahm");
        
        show.showInfo();
        System.out.println("-----------------------------------------------");
        pal.showInfo();
        System.out.println("-----------------------------------------------");
        ws.showInfo();
    }
}