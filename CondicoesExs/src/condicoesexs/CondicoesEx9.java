/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicoesexs;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class CondicoesEx9 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double segmentos[] = new double[3];

        for (int i = 0; i < segmentos.length; i++) {

            System.out.println("Digite o segmento: ");
            segmentos[i] = teclado.nextDouble();

        }

        for (int i = 0; i < segmentos.length; i++) {

            if (segmentos[i] > segmentos[0] + segmentos[1] || segmentos[i] > segmentos[1] + segmentos[2] || segmentos[i] > segmentos[2] + segmentos[0]) {

                System.out.printf("Nao e possivel fazer um triangulo com esses segmentos!%nNenhum dos segmentos pode ter um valor maior que a soma dos outros dois lados!%n");
                i = segmentos.length;
                
            } else if (i == segmentos.length-1) {
                
                System.out.println("E possivel fazer um triangulo com os segmentos: " + segmentos[0] + ", " + segmentos[1] + ", " + segmentos[2]);
                
            }

        }

    }

}
