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
public class GeralEx37 {

    public static void arrayListRandom(ArrayList<Integer> list, int maxL, int maxV) {
        for (int i = 0; i < maxL; i++) {
            list.add((int)(Math.random()*maxV)+1);
        }
    }
    
    public static void arrayListShow(ArrayList<Integer> list) {
        for (int num : list) {
            System.out.printf("["+num+"] ");
        }
        System.out.println("");
    }
    
    public static int verifyMostCommonElement(ArrayList<Integer> list) {
        int countV = 0, mostCommonElement = 0;
        for (int i = 0; i <= list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                int countT = 0;
                if (list.get(i) == list.get(j)) {
                    countT++;
                    if (countT > countV) {
                        mostCommonElement = list.get(i);
                        countV = countT;
                    }
                }
            }
        }
        System.out.println(countV);
        return mostCommonElement;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        int maxL = 10,maxV = 5;
        
        arrayListRandom(lista,maxL,maxV);
        System.out.println("Original list:");
        arrayListShow(lista);
        System.out.println("------------------------");
        
        System.out.println("Elemento mais comum da lista:\n"+verifyMostCommonElement(lista));
        System.out.println();
    }
}
