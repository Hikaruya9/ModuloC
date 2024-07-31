/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lacorepeticaoex38;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class LacoRepeticao54 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int peso[] = new int[7];
        double altura[] = new double[7];
        double soma = 0;
        double media;
        int pesados = 0;
        int baixosMagros = 0;
        int altosPesados = 0;

        for (int i = 0; i < peso.length; i++) {

            System.out.println("Digite seu peso (Kg): ");
            peso[i] = teclado.nextInt();
            System.out.println("Digite sua altura (metros): ");
            altura[i] = teclado.nextDouble();

            soma += altura[i];

            if (peso[i] > 90) {

                pesados++;

                if (altura[i] > 1.90 && peso[i] > 100) {

                    altosPesados++;

                }

            } else if (peso[i] < 50 && altura[i] < 1.60) {

                baixosMagros++;

            }

        }

        media = soma / altura.length;
        System.out.printf("A media de altura do grupo e: %.2f\n", media);

        if (pesados == 1) {

            System.out.println(pesados + " pessoa pesa mais que 90Kg.");

        } else if (baixosMagros == 1) {

            System.out.println(baixosMagros + " pessoa pesa menos que 50Kg e tem menos de 1,60m.");

        } else if (altosPesados == 1) {

            System.out.println(altosPesados + " pessoa mede mais de 1,90m e pesa mais de 100Kg.");

        } else {

            System.out.println(pesados + " pessoas pesam mais que 90Kg.");
            System.out.println(baixosMagros + " pessoas pesam menos que 50Kg e tem menos de 1,60m.");
            System.out.println(altosPesados + " pessoas medem mais de 1,90m e pesam mais de 100Kg.");

        }

    }

}
