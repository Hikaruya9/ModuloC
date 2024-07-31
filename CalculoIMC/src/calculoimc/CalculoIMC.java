/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculoimc;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class CalculoIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //IMC = peso / altura^2
        Scanner teclado = new Scanner(System.in);
        
        double peso,altura,imc;
        
        System.out.println("Digite seu peso em quilogramas(Kg): ");
        peso = teclado.nextDouble();
        System.out.println("Digite sua altura em metros(m): ");
        altura = teclado.nextDouble();
        
        imc = peso / Math.pow(altura, 2);
        
        System.out.printf("IMC: %.2f\n", imc);
        
        if (imc < 17) {
            System.out.println("Muito abaixo do peso");
        } else if (imc >= 17 && imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso ideal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidade");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Obesidade severa");
        } else {
            System.out.println("Obesidade morbida");
        }
        
    }
    
}
