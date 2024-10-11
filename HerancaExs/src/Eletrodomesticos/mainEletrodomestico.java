/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Eletrodomesticos;

/**
 *
 * @author Aluno
 */
public class mainEletrodomestico {

    public static void main(String[] args) {
        Geladeira gel = new Geladeira("Electrolux", "TF59", true, 3.1);
        Microondas micro = new Microondas("Philco", "Pmo23bb", true, 920);
        Televisao tel = new Televisao("Samsung", "43DU7700", false, "324 ch", 23);
        
        gel.showInfo();
        System.out.println("----------------------------------------");
        micro.showInfo();
        System.out.println("----------------------------------------");
        tel.showInfo();
    }
}