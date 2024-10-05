/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desenhos;

/**
 *
 * @author macig
 */
public class Quadrado implements Desenho {

    @Override
    public void desenhar() {
        System.out.println("------------");
        System.out.println("|          |");
        System.out.println("|          |");
        System.out.println("| Quadrado |");
        System.out.println("|          |");
        System.out.println("|          |");
        System.out.println("------------");
    }
}