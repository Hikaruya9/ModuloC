/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FormasGeometricas;

/**
 *
 * @author Aluno
 */
public class mainFormaGeometrica {

    public static void main(String[] args) {
        Triangulo tri = new Triangulo(3.1, 2.9);
        Retangulo ret = new Retangulo(4, 5);
        Circulo cir = new Circulo(3);
        
        tri.calcularArea();
        ret.calcularArea();
        cir.calcularArea();
    }
}