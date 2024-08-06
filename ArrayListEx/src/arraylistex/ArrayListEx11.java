/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistex;

import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;

/**
 *
 * @author Aluno
 */
public class ArrayListEx11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        Set<Integer> limpaLista = new LinkedHashSet<>();
        
        for (int i = 0; i < 10; i++) {
            int numero = (int) (Math.random() * 10 + 1);
            listaNumeros.add(numero);
        }
        
        limpaLista.addAll(listaNumeros);
        listaNumeros.clear();
        listaNumeros.addAll(limpaLista);
        
        System.out.printf("A lista contem duplicatas?\n" + listaNumeros + "\n");
    }
    
}
