/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geralexs;

import java.util.ArrayList;
/**
 *
 * @author Aluno
 */
public class GeralEx11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        
        nomes.add("Guts");
        nomes.add("Griffith");
        nomes.add("Musashi");
        nomes.add("Inoue");
        nomes.add("Sasaki");
        
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
    
}
