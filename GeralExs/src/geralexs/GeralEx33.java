/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geralexs;

import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class GeralEx33 {

    public static String invertString(String palavra) {
        String revString = "";
        int j = palavra.length()-1;
        for (int i = 0; i < palavra.length(); i++) {
            revString += palavra.charAt(j);
            j--;
        }
        return revString;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Type in a word:");
        String word = sc.nextLine();
        word = word.toLowerCase();
        
        String revWord = invertString(word);
        System.out.println("Reverted word:\n"+revWord);
    }
}
