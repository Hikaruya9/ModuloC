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
public class ArrayListEx10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> animais1 = new ArrayList<>();
        ArrayList<String> animais2 = new ArrayList<>(animais1);
        
        Collections.addAll(animais1, "Leao", "Guepardo", "Tigre", "Escorpiao");
        
        animais2.addAll(animais1);
        
        System.out.println("Essa e a primeira lista: " + animais1);
        System.out.println("Essa e a segunda lista: " + animais2);
    }
    
}
