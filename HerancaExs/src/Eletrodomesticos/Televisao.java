/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eletrodomesticos;

/**
 *
 * @author Aluno
 */
public class Televisao extends Eletrodomestico{
    private String canal;
    private int volume;

    public Televisao(String marca, String modelo, boolean ligado, String canal, int volume) {
        super(marca, modelo, ligado);
        this.canal = canal;
        this.volume = volume;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public void showInfo() {
        System.out.println("Marca: "+getMarca()+"\nModelo: "+getModelo()+"\nEsta ligado? "+isLigado()+"\nCanal atual: "+getCanal()+"\nVolume atual: "+getVolume());
    }
}