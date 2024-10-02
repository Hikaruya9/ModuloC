/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Formas;

/**
 *
 * @author macig
 */
public class Quadrado implements Forma {

    private double base;

    public Quadrado(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calcularArea() {
        double area = Math.pow(base, 2);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = base*4;
        return perimetro;
    }

}
