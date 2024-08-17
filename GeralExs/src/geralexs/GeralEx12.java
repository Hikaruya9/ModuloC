/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geralexs;

import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author Aluno
 */
public class GeralEx12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        for (int i = numeros.size()-1; i > 0; i--) {
            if (numeros.get(i)%2 == 0) {
                numeros.remove(i);
            }
        }
        
        System.out.println("Lista sem pares:");
        System.out.println(numeros);
    }
}
