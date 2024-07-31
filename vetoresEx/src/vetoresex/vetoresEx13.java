/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetoresex;

import java.util.Scanner;
/**
 *
 * @author TI
 */
public class vetoresEx13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int opcao;
        
        do {
            System.out.println("Menu principal: ");
            System.out.println("1. Calcular Soma");
            System.out.println("2. Exibir Media");
            System.out.println("3. Sair");
            System.out.println("Digite sua opcao: ");
            
            opcao = entrada.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Voce escolheu a opcao 1!");
                    break;
                case 2:
                    System.out.println("Voce escolheu a opcao 2!");
                    break;
                case 3:
                    System.out.println("Saindo do menu...");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente");
            }
        } while (opcao != 3);
    }
}
