/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package FiguraGeometrica;

/**
 *
 * @author Aluno
 */
public class mainFiguraGeometrica {

    public static void main(String[] args) {
        Circulo c1 = new Circulo(3);
        Retangulo r1 = new Retangulo(2.70,3);
        
        System.out.printf("Area do retangulo: %.2f\n",r1.calcularArea());
        System.out.printf("Perimetro do retangulo: %.2f\n",r1.calcularPerimetro());
        System.out.printf("Area do circulo: %.2f\n",c1.calcularArea());
        System.out.printf("Perimetro do circulo: %.2f\n",c1.calcularPerimetro());
    }
}