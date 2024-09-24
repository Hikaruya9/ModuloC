/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aviao;

/**
 *
 * @author macig
 */
public class mainAviao {
    public static void main(String[] args) {
        Aviao a1 = new Aviao("Boeing 737", 50, 200);
        
        System.out.println("Modelo: "+a1.getModelo()+"\nCapacidade: "+a1.getCapacidadePassageiros()+"\nVelocidade max: "+a1.getVelocidadeMaxima()+"\n");
        
        a1.setModelo("Gol 423");
        a1.setCapacidadePassageiros(60);
        a1.setVelocidadeMaxima(220);
        
        System.out.println("Modelo: "+a1.getModelo()+"\nCapacidade: "+a1.getCapacidadePassageiros()+"\nVelocidade max: "+a1.getVelocidadeMaxima());
    }
}