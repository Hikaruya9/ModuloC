/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Porta;

/**
 *
 * @author macig
 */
public class mainPorta {
    public static void main(String[] args) {
        Porta p1 = new Porta(false, "Marrom");
        
        System.out.println("Esta aberta? "+p1.isAberta()+"\nCor: "+p1.getCor()+"\n");

        p1.setAberta(true);
        p1.setCor("Branco");
        
        p1.abrir();
        p1.fechar();
        
        System.out.println("\nEsta aberta? "+p1.isAberta()+"\nCor: "+p1.getCor());
    }
}