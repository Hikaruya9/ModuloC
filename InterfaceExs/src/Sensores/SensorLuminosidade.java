/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sensores;

/**
 *
 * @author macig
 */
public class SensorLuminosidade implements Sensor {
    private double luminosidade;

    public SensorLuminosidade(double luminosidade) {
        this.luminosidade = luminosidade;
    }

    public double getLuminosidade() {
        return luminosidade;
    }

    public void setLuminosidade(double luminosidade) {
        this.luminosidade = luminosidade;
    }

    @Override
    public void lerValor() {
        System.out.printf("Luminosidade lida: %.1f\n",luminosidade);
    }
}