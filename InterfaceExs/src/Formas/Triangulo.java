/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Formas;

/**
 *
 * @author macig
 */
public class Triangulo implements Forma {

    private double base;
    private double altura;
    private double ladoE;
    private double ladoD;

    public Triangulo(double base, double altura, double ladoE, double ladoD) {
        this.base = base;
        this.altura = altura;
        this.ladoE = ladoE;
        this.ladoD = ladoD;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLadoE() {
        return ladoE;
    }

    public void setLadoE(double ladoE) {
        this.ladoE = ladoE;
    }

    public double getLadoD() {
        return ladoD;
    }

    public void setLadoD(double ladoD) {
        this.ladoD = ladoD;
    }

    @Override
    public double calcularArea() {
        double area = (base*altura)/2;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = base+ladoE+ladoD;
        return perimetro;
    }
}
