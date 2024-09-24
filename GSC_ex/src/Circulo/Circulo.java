/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Circulo;

/**
 *
 * @author macig
 */
public class Circulo {
    private double raio;
    
    public Circulo(double raio) {
        this.raio = raio;
    }
    
    public double getRaio() {
        return this.raio;
    }
    
    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public double calcularArea() {
        double area = Math.PI*Math.pow(raio, 2);
        return area;
    }
    
    public double calcularCircunferencia() {
        double circunferencia = Math.PI*(raio*2);
        return circunferencia;
    }
    
}