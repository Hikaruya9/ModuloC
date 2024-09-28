/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkginterface;

/**
 *
 * @author Aluno
 */
public class Interface {
    public static void main(String[] args) {
        
        RemoteController rc = new RemoteController();

        //rc.desligar();
        rc.ligar();
        rc.ligarMudo();
        rc.desligarMudo();
        rc.abrirMenu();
        rc.play();
        rc.maisVolume();
        rc.maisVolume();
        //rc.menosVolume();
    }
}