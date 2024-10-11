/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FigurasGeometricas3D;

/**
 *
 * @author Aluno
 */
public class Cubo extends FiguraGeometrica3D{

    private double aresta;

    public Cubo(double aresta) {
        this.aresta = aresta;
    }

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }

    @Override
    public void calcularVolume() {
        double volume = Math.pow(aresta, 3);
        System.out.printf("Volume do cubo: %.2f\n", volume);
    }
}
