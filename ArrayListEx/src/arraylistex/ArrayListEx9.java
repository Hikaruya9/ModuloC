/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;

/**
 *
 * @author Aluno
 */
public class ArrayListEx9 { 

    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        HashSet<Integer> limpaNumeros = new HashSet<>(listaNumeros);

        boolean hashDupes = limpaNumeros.size() != listaNumeros.size();
        System.out.println("Tem numeros duplicados? " + hashDupes);
        
        // boolean hashDupes = listaNumeros.size() != new HashSet<>(listaNumeros);
    }
}
