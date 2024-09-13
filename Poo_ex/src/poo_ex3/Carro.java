/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ex3;

/**
 *
 * @author macig
 */
public class Carro {
    String marca;
    String modelo;
    int ano;
    boolean ligado;
    
    public void ligar() {
        ligado = true;
        System.out.println("O "+marca+" de modelo "+modelo+" do ano "+ano+" esta ligado?\n"+ligado);
    }
    
    public void desligar() {
        ligado = false;
        System.out.println("O "+marca+" de modelo "+modelo+" do ano "+ano+" esta ligado?\n"+ligado);
    }
}
