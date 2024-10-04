/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FormasGeometricas;

/**
 *
 * @author Aluno
 */
public class mainFormasGeometricas {

    public static void main(String[] args) {
        Circulo c1 = new Circulo(3);
        Retangulo r1 = new Retangulo(2.70, 3);
        Triangulo t1 = new Triangulo(5, 4);
        
        System.out.printf("Area circulo: %.2f\n",c1.calcularArea());
        System.out.printf("Area retangulo: %.2f\n",r1.calcularArea());
        System.out.printf("Area triangulo: %.2f\n",t1.calcularArea());
    }
}