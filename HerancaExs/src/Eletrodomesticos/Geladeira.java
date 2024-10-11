/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eletrodomesticos;

/**
 *
 * @author Aluno
 */
public class Geladeira extends Eletrodomestico{
    private double temperatura;

    public Geladeira(String marca, String modelo, boolean ligado, double temperatura) {
        super(marca, modelo, ligado);
        this.temperatura = temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    
    public void showInfo() {
        System.out.printf("Marca: "+getMarca()+"\nModelo: "+getModelo()+"\nEsta ligado? "+isLigado()+"\nTemperatura atual: %.1f\n",getTemperatura());
    }
}
