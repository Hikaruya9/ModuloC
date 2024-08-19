/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geralexs;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class GeralEx27 {

    public static double calculateRectangleArea(double length, double width) {
        double area = length * width;
        return area;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Rectangle length:");
        double length = sc.nextDouble();
        System.out.println("Rectangle width:");
        double width = sc.nextDouble();

        double area = calculateRectangleArea(length, width);
        System.out.println("Rectangle's area is:\n" + area + "m²");
    }
}
