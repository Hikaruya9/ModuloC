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
    
    public static void mostCommonElement(ArrayList<Integer> list) {
        
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        int maxL = 10,maxV = 10;
        
        arrayListRandom(lista,maxL,maxV);
        System.out.println("Original list:");
        arrayListShow(lista);
        
        
    }
}
