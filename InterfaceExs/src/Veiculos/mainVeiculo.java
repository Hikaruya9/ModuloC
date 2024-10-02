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
        Moto m1 = new Moto("Retorno", false);
        Carro c1 = new Carro("Esquerda", true);
        Bicicleta b1 = new Bicicleta("Direita", true);
        
        m1.acelerar();
        c1.frear();
        b1.virar("Retorno");
    }
}