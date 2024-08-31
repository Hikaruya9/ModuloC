/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geralexs;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Aluno
 */
public class GeralEx36 {
    
    public static void arrayListRandom(ArrayList<Integer> list,int max) {
        for (int i = 0; i < max; i++) {
            list.add((int)((Math.random() * 50)+1));
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int max = 10;
        
        arrayListRandom(lista, max);
        System.out.println("Lista original:");
        System.out.println(lista);
        
        System.out.println("Digite a posicao do valor que deseja remover:");
        int posicao = sc.nextInt();
        
        lista.remove(posicao-1);
        System.out.println("Lista sem o elemento removido:");
        System.out.println(lista);
    }
}
