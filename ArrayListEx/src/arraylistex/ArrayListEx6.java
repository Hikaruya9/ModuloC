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
public class ArrayListEx6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        
        frutas.add("Laranja");
        frutas.add("Bergamota");
        frutas.add("Banana");
        frutas.add("Uva");
        frutas.add("Pera");
        
        System.out.println("Lista original:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
        
        frutas.set(2, "Morango");
        
        System.out.printf("\nLista com a terceira posicao alterada:\n");
        for(String fruta : frutas) {
            System.out.println(fruta);
        }
    }
    
}
