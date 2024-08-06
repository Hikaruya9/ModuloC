/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashsetexample;

import java.util.Collections;
import java.util.HashSet;
/**
 *
 * @author Aluno
 */
public class HashSetExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet<String> frutas = new HashSet<>();
        
        Collections.addAll(frutas, "Banana", "Uva", "Morango", "Abacaxi", "Pera");
        
        System.out.println(frutas);
        
        if(frutas.contains("Uva")) {
            System.out.println("Contem uva na lista");
        }
    }
    
}
