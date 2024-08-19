/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package geralexs;

/**
 *
 * @author Aluno
 */
public class GeralEx29 {

    public static String convertStringUpperCase(String name) {
        String nameUpperCase = name.toUpperCase();
        return nameUpperCase;
    }
    
    public static void main(String[] args) {
        String nome = "Guts";
        
        nome = convertStringUpperCase(nome);
        System.out.println(nome);
    }
}
