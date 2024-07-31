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
public class LacoRepeticaoEx52 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int idades[] = new int[10];
        int soma = 0;
        int media;
        int maiorIdade = 0;
        int menorIdade = 0;
        int idadeAlta = 0;
        
        for(int i = 0; i < idades.length; i++) {
            
            System.out.println("Digite a idade: ");
            idades[i] = teclado.nextInt();
            soma += idades[i];
            
            if(idades[i] < 5) {
                
                menorIdade++;
                
            } else if(idades[i] > 18) {
                
                maiorIdade++;
                
            }
            
            if(idades[i] > idadeAlta) {
                
                idadeAlta = idades[i];
                
            }
            
        }
        
        media = soma / idades.length;
        System.out.println("A media das idades e: " + media);
        System.out.println(maiorIdade + " dessas pessoas tem mais de 18 anos.");
        System.out.println(menorIdade + " dessas pessoas tem menos de 5 anos.");
        System.out.println(idadeAlta + " e a maior idade colocada na lista.");
        
    }
    
}
