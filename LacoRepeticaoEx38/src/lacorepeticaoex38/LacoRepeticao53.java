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
public class LacoRepeticao53 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        
        int idades[] = new int[5];
        String sexos[] = new String[5];
        int masculino = 0;
        int feminino = 0;
        int idadeAltaF = 0;
        int soma = 0;
        int somaM = 0;
        int media,mediaM;
        
        for (int i = 0; i < idades.length; i++) {
            
            System.out.println("Digite a idade: ");
            idades[i] = teclado.nextInt();
            System.out.println("Digite seu sexo M (masculino) e F (feminino)");
            sexos[i] = teclado2.nextLine();
            
            soma += idades[i];
            
            if (sexos[i].equals("M")) {
                
                masculino++;
                somaM += idades[i];
                
            } else if (sexos[i].equals("F")) {
                
                feminino++;
                
                if(idades[i] > 20) {
                    
                    idadeAltaF++;
                    
                }
                
            }
            
        }
        
        media = soma/idades.length;
        mediaM = somaM/masculino;
        
        System.out.println(masculino + " homens foram cadastrados.");
        System.out.println(feminino + " mulheres foram cadastradas.");
        System.out.println("A media de idade do grupo e: " + media);
        System.out.println("A media de idade dos homens e: " + mediaM);
        System.out.println(idadeAltaF + " mulheres cadastradas tem mais de 20 anos.");
        
    }
    
}
