/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Veiculos;

/**
 *
 * @author Aluno
 */
public class mainVeiculo {

    public static void main(String[] args) {
        Carro carro = new Carro("Fiat", "Uno", 2024, 4);
        Moto moto = new Moto("Honda", "CG 160 Titan", 2016, 162);
        Caminhao truck = new Caminhao("Volvo", "VM 220 4X2", 2013, 20);
        
        carro.showInfo();
        System.out.println("-----------------------------------------");
        moto.showInfo();
        System.out.println("-----------------------------------------");
        truck.showInfo();
    }
}