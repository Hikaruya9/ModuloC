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
public class GeralEx31 {

    public static int fatoraNumero(int numero) {
        int resultado = 1;
        for (int i = numero; i > 0; i--) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int n = sc.nextInt();

        int resultado = fatoraNumero(n);
        System.out.println("O fatorial de " + n + " e:\n" + resultado);
    }
}
