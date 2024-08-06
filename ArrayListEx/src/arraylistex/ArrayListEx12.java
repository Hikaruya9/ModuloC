/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistex;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Aluno
 */
public class ArrayListEx12 {

    public static void main(String[] args) {
        ArrayList<String> nomes1 = new ArrayList<>(Arrays.asList("Skull Knight", "Nosferatu Zodd", "Guts", "Puck", "Griffith"));
        ArrayList<String> nomes2 = new ArrayList<>(Arrays.asList("Ganishka", "Griffith", "Nosferatu Zodd", "Falconia", "Wyald"));

        System.out.println("Esses sao os nomes iguais presentes nas duas listas:");
        for (String nome : nomes1) {
            for (String nomeC : nomes2) {
                if (nomeC.equals(nome)) {
                    System.out.println(nomeC);
                }
            }
        }
    }
}