/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author Aluno
 */
public class ArrayListEx13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> numeros1 = new ArrayList<>(Arrays.asList(5,9,42,60,25));
        ArrayList<Integer> numeros2 = new ArrayList<>(Arrays.asList(5,17,42,9,2));
        HashSet<Integer> numerosSemDuplicatas = new HashSet<>();
        
        numerosSemDuplicatas.addAll(numeros1);
        numerosSemDuplicatas.addAll(numeros2);
        
        System.out.printf("Lista sem duplicatas:\n" + numerosSemDuplicatas);
        System.out.println("");
    }
    
}
