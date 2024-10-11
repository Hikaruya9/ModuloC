/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Carro;

/**
 *
 * @author Aluno
 */
public class mainCarro {

    public static void main(String[] args) {
        Carro c1 = new Carro("Toyota","H530",2001,true);
        
        System.out.println("Modelo: "+c1.getModelo());
        System.out.println("Marca: "+c1.getMarca());
        System.out.println("Ano: "+c1.getAno());
        System.out.println("Esta ligado: "+c1.isLigado()+"\n");
        
        c1.desligar();
        System.out.println("Ligado: "+c1.isLigado()+"\n");
        
        c1.setMarca("Fiat");
        c1.setModelo("Uno");
        c1.setAno(2015);
        c1.setLigado(false);
        
        System.out.println("Modelo: "+c1.getModelo());
        System.out.println("Marca: "+c1.getMarca());
        System.out.println("Ano: "+c1.getAno());
        System.out.println("Esta ligado: "+c1.isLigado()+"\n");
        
        c1.ligar();
        System.out.println("Ligado: "+c1.isLigado());
        System.out.println("=================================================");
        c1.acelerar();
        System.out.println("-------------------------------------------------");
        c1.desligar();
        c1.acelerar();
    }
}
