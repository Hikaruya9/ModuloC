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
public class ArrayListEx2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();

        //Traz os valores pra dentro do ArrayList
        for (int i = 1; i <= 10; i++) {
            listaNumeros.add(i);
        }

        //mostra todos os numeros guardados no ArrayList
        System.out.println("Lista completa:");
        for (int numero : listaNumeros) {
            System.out.printf(numero + " ");
        }
        System.out.println("");

        //Remove os números pares da lista
        for (int i = listaNumeros.size()-1; i >= 1; i -= 2) {
            listaNumeros.remove(i);
        }

        //Lista todos os números restantes (impares) do array
        System.out.println("Lista sem os numeros pares:");
        for (int numero : listaNumeros) {
            System.out.printf(numero + " ");
        }
        System.out.println("");
    }
}
