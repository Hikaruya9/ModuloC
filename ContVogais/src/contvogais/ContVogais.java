/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contvogais;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ContVogais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = teclado.nextLine();

        int contVogais = 0;

        for (char letra : frase.toCharArray()) {
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contVogais++;
            }

        }
        System.out.println("A frase tem " + contVogais + " vogais");
        teclado.close();
    }
}
