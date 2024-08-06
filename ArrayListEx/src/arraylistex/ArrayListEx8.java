/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistex;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Aluno
 */
public class ArrayListEx8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        
        for(int i = 0; i < 10; i++) {
            int numero = (int) (Math.random() * 100 + 1);
            listaNumeros.add(numero);
        }
        
        System.out.println("Lista desorganizada: " + listaNumeros);
        
        listaNumeros.sort(Comparator.naturalOrder());
        
        System.out.println("Lista organizada: " + listaNumeros);
        
    }
    
}
