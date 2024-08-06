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
public class ArrayListEx4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<String>();
        
        cores.add("Vermelho");
        cores.add("Verde");
        cores.add("Azul");
        
        System.out.printf("A lista contem Amarelo? \n" + cores.contains("Amarelo") + "\n");
    }
}
