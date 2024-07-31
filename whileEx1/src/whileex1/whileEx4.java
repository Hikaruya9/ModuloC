/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whileex1;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class whileEx4 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Scanner leia2 = new Scanner(System.in);

        int idade,contM = 0,somaH = 0,mediaH,maiorIdade = 0,jovemF = 200;
        String resposta, sexo;
        
        do {
            System.out.println("Digite sua idade: ");
            idade = leia.nextInt();
            System.out.println("Digite seu sexo (M ou F): ");
            sexo = leia2.nextLine();
            
            if(idade > maiorIdade) {
                maiorIdade = idade;
            }
            
            switch (sexo) {
                case "M":
                    contM++;
                    somaH += idade;
                    break;
                case "F":
                    if(idade < jovemF) {
                        jovemF = idade;
                    }
                    break;
                default:
                    System.out.println("sexo invalido, digite novamente com M ou F.");
            }
            
            System.out.println("Deseja continuar (S ou N): ");
            resposta = leia2.nextLine();
        } while (resposta.equalsIgnoreCase("S"));
        mediaH = somaH/contM;
        
        System.out.println("A maior idade é de " + maiorIdade + " anos");
        System.out.println("Foram cadastrados " + contM + " homens na lista");
        System.out.println("A mulher mais jovem tem " + jovemF + " anos");
        System.out.println("A média de idade dos homens é de " + mediaH + " anos");
    }
}
