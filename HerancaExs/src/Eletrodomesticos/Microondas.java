/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eletrodomesticos;

/**
 *
 * @author Aluno
 */
public class Microondas extends Eletrodomestico{
    private int potencia;

    public Microondas(String marca, String modelo, boolean ligado, int potencia) {
        super(marca, modelo, ligado);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void showInfo() {
        System.out.println("Marca: "+getMarca()+"\nModelo: "+getModelo()+"\nEsta ligado? "+isLigado()+"\nPotencia: "+getPotencia());
    }
}