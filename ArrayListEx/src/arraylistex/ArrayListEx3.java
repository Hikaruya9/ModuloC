/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistex;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class ArrayListEx3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Double> listaDecimais = new ArrayList<>();
        
        for(double i = 1.5; i < 6; i++) {
            listaDecimais.add(i);
        }
        
        System.out.println("Lista completa:");
        for(double numero : listaDecimais) {
            System.out.printf(numero + " ");
        }
        System.out.println("");
        
        System.out.println("O numero da terceira posicao e: " + listaDecimais.get(2));
    }
}
