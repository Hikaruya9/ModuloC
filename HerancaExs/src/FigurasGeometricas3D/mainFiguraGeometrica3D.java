/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FigurasGeometricas3D;

/**
 *
 * @author Aluno
 */
public class mainFiguraGeometrica3D {

    public static void main(String[] args) {
        Cubo cube = new Cubo(12);
        Esfera sphere = new Esfera(12);
        Cilindro cylinder = new Cilindro(3.1, 10);
        
        cube.calcularVolume();
        System.out.println("-------------------------------------------");
        sphere.calcularVolume();
        System.out.println("-------------------------------------------");
        cylinder.calcularVolume();
    }
}