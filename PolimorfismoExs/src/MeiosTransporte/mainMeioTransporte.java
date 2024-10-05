/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package MeiosTransporte;

/**
 *
 * @author Aluno
 */
public class mainMeioTransporte {

    public static void main(String[] args) {
        Carro c1 = new Carro();
        Aviao a1 = new Aviao();
        Navio n1 = new Navio();
        
        c1.mover();
        System.out.println("------------------------------------");
        a1.mover();
        System.out.println("------------------------------------");
        n1.mover();
    }
}