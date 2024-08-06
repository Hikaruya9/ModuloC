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
public class ArrayListEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> listaCidades = new ArrayList<>();
        
        listaCidades.add("Tramandai");
        listaCidades.add("Porto Alegre");
        listaCidades.add("Sapucaia do Sul");
        listaCidades.add("Fortaleza");
        listaCidades.add("Marica");
        
        for (String cidade : listaCidades){
            System.out.println(cidade);
        }
        
    }
    
}
