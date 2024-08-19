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
public class GeralEx7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int soma = 0;

        System.out.println("Digite um numero acima de 10:");
        int numero = teclado.nextInt();

        while (numero > 0) {
            int digito = numero % 10; //Separa o último digito do número
            soma += digito; //Soma o último digito 
            numero /= 10; //Divide o número por 10, removendo o último digito
        }
        System.out.println("A soma dos digitos do numero e " + (soma));
    }
}
