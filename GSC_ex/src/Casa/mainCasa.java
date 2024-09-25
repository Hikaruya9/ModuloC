/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casa;

/**
 *
 * @author macig
 */
public class mainCasa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Cleiton");
        Casa c1 = new Casa(1512, "Bege", p1);
        
        System.out.println("Numero: "+c1.getNumero()+"\nCor: "+c1.getCor()+"\nProprietario: "+c1.getProprietario()+"\n");
        
        c1.setCor("Branca");
        c1.setProprietario("Jorge");
        
        System.out.println("Numero: "+c1.getNumero()+"\nCor: "+c1.getCor()+"\nProprietario: "+c1.getProprietario());
    }
}