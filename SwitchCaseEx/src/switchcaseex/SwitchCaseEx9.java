/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchcaseex;

import java.util.Scanner;
/**
 *
 * @author macig
 */
public class SwitchCaseEx9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario = 0;
        int aliquota = 0;
        
        System.out.println("Digite seu salario:");
        salario = teclado.nextDouble();
        
        if (salario <= 2259.20) {
            aliquota = 0;
        } else if (salario > 2259.20 && salario <= 2826.65) {
            aliquota = 1;
        } else if (salario > 2826.65 && salario <= 3751.05) {
            aliquota = 2;
        } else if (salario > 3751.05 && salario <= 4664.68) {
            aliquota = 3;
        } else if (salario > 4664.68) {
            aliquota = 4;
        }

        switch (aliquota) {
            case 0:
                System.out.println("Voce esta isento do IR.");
                break;
            case 1:
                System.out.println("Sera deduzido do seu salario o valor de R$158,40 para o IR.");
                break;
            case 2:
                System.out.println("Sera deduzido do seu salario o valor de R$381,44 para o IR.");
                break;
            case 3:
                System.out.println("Sera deduzido do seu salario o valor de R$662,77 para o IR.");
                break;
            case 4:
                System.out.println("Sera deduzido do seu salario o valor de R$896,00 para o IR.");
                break;
        }
    }
}