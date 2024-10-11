/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FigurasGeometricas3D;

/**
 *
 * @author Aluno
 */
public class Esfera extends FiguraGeometrica3D{

    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularVolume() {
        double volume = (4 * Math.PI * Math.pow(raio, 3)) / 3;
        System.out.printf("Volume da esfera: %.2f\n", volume);
    }
}
