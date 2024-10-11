/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Animais;

/**
 *
 * @author Aluno
 */
public class mainAnimais {

    public static void main(String[] args) {
        Ave ave = new Ave("Aguia", 4, 2.1);
        Reptil rep = new Reptil("Lagarto", 3, "Seca");
        Mamifero mam = new Mamifero("Mamute", 8, "Castanho-escuro");
        
        ave.showInfo();
        System.out.println("--------------------------------------");
        rep.showInfo();
        System.out.println("--------------------------------------");
        mam.showInfo();
    }
}
