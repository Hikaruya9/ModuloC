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
public class GeralEx26 {

    public static int converteCelsiusFarenheit(int celsius) { //Faz o calculo de Celsius para Farenheit
        int farenheit = (celsius*9/5)+32;
        return farenheit;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os graus Celsius:");
        int celsius = sc.nextInt(); //Guarda a temperatura em Celsius digitada
        int conversao = converteCelsiusFarenheit(celsius);
        
        System.out.println("A conversao para Farenheit e:\n"+conversao+"°F");
    }
}
