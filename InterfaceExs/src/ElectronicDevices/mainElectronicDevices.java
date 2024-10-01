/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ElectronicDevices;

/**
 *
 * @author Aluno
 */
public class mainElectronicDevices {

    public static void main(String[] args) {
        Televisao t1 = new Televisao("LG","4500",true);
        Radio r1 = new Radio("Haeger","Vintage retro",false);
        Celular c1 = new Celular("Motorola", "G5 Plus",false);
        
        t1.desligar();
        t1.obterStatus();
        
        r1.desligar();
        r1.ligar();
        
        c1.ligar();
        c1.obterStatus();
    }
}