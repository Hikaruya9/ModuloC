/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FigurasGeometricas3D;

/**
 *
 * @author Aluno
 */
public class Cilindro extends FiguraGeometrica3D{
    private double raio;
    private double altura;

    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void calcularVolume() {
        double volume = Math.PI*(Math.pow(getRaio(), 2)*getAltura());
        System.out.printf("Volume do Cilindro: %.2f\n", volume);
    }
}