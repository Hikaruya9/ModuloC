/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FiguraGeometrica;

/**
 *
 * @author macig
 */
public class Retangulo implements FiguraGeometrica {
    private double altura;
    private double base;

    public Retangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calcularArea() {
        double area = this.altura*this.base;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = (this.base*2)+(this.altura*2);
        return perimetro;
    }
}