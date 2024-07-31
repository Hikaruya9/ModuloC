/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetoresex;

/**
 *
 * @author TI
 */
public class vetoresEx15 {
    public static void main(String[] args) {
        double[] numeros = new double[10];
        double soma = 0;
        double media;
        double variancia = 0;
        double desvio;
        
        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = (double) (Math.random() * 100) + 1;
        }
        
        for (double numero : numeros) {
            soma += numero; 
        }
        media = (soma/numeros.length);
        for(double numero : numeros) {
            variancia += Math.pow((numero-media), 2)/numeros.length;
        }
        desvio = Math.sqrt(variancia);
        
        System.out.printf("A soma dos numeros e: %.2f\n", soma);
        System.out.printf("A media dos numeros e: %.2f\n", media);
        System.out.printf("A variancia dos numeros e: %.2f\n", variancia);
        System.out.printf("O desvio dos numeros e: %.2f\n", desvio);
    }
}
