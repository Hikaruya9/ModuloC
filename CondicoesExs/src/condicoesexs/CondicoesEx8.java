/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicoesexs;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class CondicoesEx8 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double distancia,precoKM,precoFinal;
        
        System.out.println("Digite a distancia que deseja percorrer: ");
        distancia = teclado.nextDouble();
        
        if(distancia <= 200) {
            precoKM = 0.50;
            precoFinal = precoKM * distancia;
            System.out.printf("O preco da passagem sera de: R$%.2f\n", precoFinal);
        } else {
            precoKM = 0.45;
            precoFinal = precoKM * distancia;
            System.out.printf("O preco da passagem sera de: R$%.2f\n", precoFinal);
        }
        
    }
    
}
