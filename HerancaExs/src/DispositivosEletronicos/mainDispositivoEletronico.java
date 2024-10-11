/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DispositivosEletronicos;

/**
 *
 * @author Aluno
 */
public class mainDispositivoEletronico {

    public static void main(String[] args) {
        Notebook note = new Notebook("Dell", "5800-a", "2 Tb");
        Tablet tablet = new Tablet("Lenovo", "LS40", 32);
        Smartphone phone = new Smartphone("iPhone", "S12", 16);
        
        note.showInfo();
        System.out.println("---------------------------------------------");
        tablet.showInfo();
        System.out.println("---------------------------------------------");
        phone.showInfo();
    }
}