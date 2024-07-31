/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicoesexs;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class CondicoesExs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double velocidadeCarro,multa;
        
        System.out.println("Digite a velocidade do em quilometros(Km): ");
        velocidadeCarro = teclado.nextDouble();
        
        if (velocidadeCarro > 80) {
            multa = (velocidadeCarro-80)*5;
            System.out.println("Voce esta acima da velocidade");
            System.out.printf("Sua multa e de: R$%.2f\n", multa);
        } else {
            System.out.println("Voce esta dirigindo em uma velocidade segura");
        }
        
    }
    
}
