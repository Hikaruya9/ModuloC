/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodsex;

import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class MethodsEx9 {

    public static int calculaPotencia(int base, int expoencia) { //Faz o cálculo da potência digitada
        int resultado = 1;
        for (int i = 0; i < expoencia; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int base,expoencia;
        
        System.out.println("Digite o numero base:");
        base = teclado.nextInt();
        System.out.println("Digite o numero expoente:");
        expoencia = teclado.nextInt();
        
        System.out.println(calculaPotencia(base,expoencia));
    }
}
