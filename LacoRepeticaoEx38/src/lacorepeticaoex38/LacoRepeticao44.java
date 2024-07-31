/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lacorepeticaoex38;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class LacoRepeticao44 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
    
        int numeroInicial,numeroFinal,numeroIncremento;
    
        System.out.println("Digite um numero inteiro em que deseja comecar a contagem: ");
        numeroInicial = teclado.nextInt();
        System.out.println("Digite o numero em que deseja parar a contagem: ");
        numeroFinal = teclado.nextInt();
        
        if(numeroInicial < numeroFinal) {
            System.out.println("Digite o tanto que deseja incrementar na contagem: ");
            numeroIncremento = teclado.nextInt();

            for(int i = numeroInicial; i < numeroFinal; i += numeroIncremento) {

                System.out.println(i);

                if (i+numeroIncremento > numeroFinal) {

                    System.out.println("Finalizado!");

                }
            }
        } else {
            
            System.out.println("Digite um numero final menor na proxima vez");
            
        }
    }
}
