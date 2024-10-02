/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sensores;

/**
 *
 * @author macig
 */
public class SensorTemperatura implements Sensor {
    private int temperatura;

    public SensorTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public void lerValor() {
        System.out.println("Temperatura lida: "+this.temperatura+"°C");
    }
    
}
