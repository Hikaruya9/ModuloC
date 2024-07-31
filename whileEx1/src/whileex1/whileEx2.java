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
public class whileEx2 {
    public static void main(String[] args) {
        Scanner leia1 = new Scanner(System.in);
        Scanner leia2 = new Scanner(System.in);
        double salario,salarioM = 0,salarioF = 0;
        String sexo,resposta;
        
        do {
            System.out.println("Digite seu salario: ");
            salario = leia1.nextDouble();
            System.out.println("Digite seu sexo (M para masculino ou F para feminino): ");
            sexo = leia2.nextLine();
            
            System.out.println("Deseja continuar? (S ou N)");
            resposta = leia2.nextLine();
            switch (sexo) {
                case "M":
                    salarioM += salario;
                    break;
                case "F":
                    salarioF += salario;
                    break;
                default:
                    System.out.println("sexo invalido. Digite novamente usando M ou F");
            }
        } while (resposta.equalsIgnoreCase("S"));
        System.out.printf("O somatorio dos salarios dos homens e: R$%.2f\n", salarioM);
        System.out.printf("O somatorio dos salarios ddas mulheres e: R$%.2f\n", salarioF);
    }
}
