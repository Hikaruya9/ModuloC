/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistex;

import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Aluno
 */
public class ArrayListEx7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> paises = new ArrayList<>();
        
        Collections.addAll(paises, "Brazil", "United States", "Russia", "England", "Peru");
        
        for(String pais : paises) {
            System.out.println(pais);
        }
    }
    
}
