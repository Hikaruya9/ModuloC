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
public class whileEx5 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Scanner leia2 = new Scanner(System.in);

        String nome, sexo, resposta, nomeMaisVelha = "", nomeMaisJovemF = "";
        int idade, maiorIdade = 0, jovemF = 200, soma = 0, cont = 0, media, idadeH30 = 0, menosF18 = 0;

        do {
            System.out.println("Digite sua idade: ");
            idade = leia.nextInt();
            System.out.println("Digite seu nome: ");
            nome = leia2.nextLine();
            System.out.println("Digite seu sexo (M ou F): ");
            sexo = leia2.nextLine();

            if (idade > maiorIdade) {
                maiorIdade = idade;
                nomeMaisVelha = nome;
            }

            soma += idade;
            cont++;

            switch (sexo) {
                case "M":
                    if (idade > 30) {
                        idadeH30++;
                    }
                    break;
                case "F":
                    if (idade < 18) {
                        menosF18++;
                    }
                    if (idade < jovemF) {
                        jovemF = idade;
                        nomeMaisJovemF = nome;
                    }
                    break;
                default:
                    System.out.println("Sexo inválido, não conseguimos fazer a identificação caso digite errado. Digite novamente usando M ou F.");
            }
            System.out.println("Deseja continuar (S ou N):");
            resposta = leia2.nextLine();
        } while (resposta.equalsIgnoreCase("S"));
        media = soma / cont;

        System.out.println("O nome da pessoa mais velha do grupo é " + nomeMaisVelha);
        System.out.println("O nome da mulher mais jovem é " + nomeMaisJovemF);
        System.out.println("A média de idade do grupo é " + media);
        System.out.println(idadeH30 + " homens do grupo tem mais de 30 anos");
        System.out.println(menosF18 + " mulheres do grupo tem menos de 18 anos");
    }
}
