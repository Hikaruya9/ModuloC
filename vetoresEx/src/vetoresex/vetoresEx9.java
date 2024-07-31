/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetoresex;

/**
 *
 * @author TI
 */
public class vetoresEx9 {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        int par = 0;
        int impar = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100) + 1;
            System.out.printf(numeros[i] + " ");
        }
        System.out.println("");

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.println(par + " desses numeros sao pares");
        System.out.println(impar + " desses numeros sao impares");
    }
}
