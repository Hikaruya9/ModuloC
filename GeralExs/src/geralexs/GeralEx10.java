/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geralexs;

/**
 *
 * @author Aluno
 */
public class GeralEx10 {

    public static void intArrayRandom(int[] numeros,int max) {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()*max) + 1;
        }
    }
    
    public static void intArrayShow(int[] numeros) {
        for (int numero : numeros) {
            System.out.printf("[ "+numero+" ]");
        }
        System.out.println("");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int maior = 0;
        
        intArrayRandom(numeros,50);
        intArrayShow(numeros);
        
        for (int numero : numeros) {
            if (maior < numero) {
                maior = numero;
            }
        }
        
        System.out.println("O maior numero e "+maior);
    }
}
