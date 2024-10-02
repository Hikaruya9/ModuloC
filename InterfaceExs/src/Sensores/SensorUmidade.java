/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sensores;

/**
 *
 * @author macig
 */
public class SensorUmidade implements Sensor {
    private int umidade;

    public SensorUmidade(int umidade) {
        this.umidade = umidade;
    }

    public int getUmidade() {
        return umidade;
    }

    public void setUmidade(int umidade) {
        this.umidade = umidade;
    }

    @Override
    public void lerValor() {
        System.out.println("Umidade lida: "+this.umidade+"%");
    }
}