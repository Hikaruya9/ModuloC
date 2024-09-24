/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Televisao;

/**
 *
 * @author macig
 */
public class mainTelevisao {
    public static void main(String[] args) {
        Televisao t1 = new Televisao(30, 304);
        
        System.out.println("Volume atual: "+t1.getVolume()+"\nCanal atual: "+t1.getCanal()+"\n");
        
        t1.setVolume(40);
        t1.setCanal(115);
        
        t1.aumentarVolume(5);
        t1.trocarCanal(224);
        System.out.println("Volume atual: "+t1.getVolume()+"\nCanal atual: "+t1.getCanal()+"\n");
        
        t1.diminuirVolume(20);
        System.out.println("Volume atual: "+t1.getVolume());
    }
}
