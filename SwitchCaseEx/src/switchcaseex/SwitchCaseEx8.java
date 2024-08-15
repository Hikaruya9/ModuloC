/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchcaseex;

import java.util.Scanner;
/**
 *
 * @author macig
 */
public class SwitchCaseEx8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int poligono;
        
        System.out.println("Digite o numero de lados que seu poligono tem:");
        poligono = teclado.nextInt();
        
        switch (poligono) {
            case 3:
                System.out.println("Seu poligono e um Triangulo!");
                break;
            case 4:
                System.out.println("Seu poligono e um Quadrado!");
                break;
            case 5:
                System.out.println("Seu poligono e um Pentagono!");
                break;
            case 6:
                System.out.println("Seu poligono e um Hexagono!");
                break;
            case 7:
                System.out.println("Seu poligono e um Heptagono!");
                break;
            case 8:
                System.out.println("Seu poligono e um Octagono!");
                break;
            default:
                System.out.println("Este poligono nao esta presente na lista. Tente outro!");
        }
    }
}
