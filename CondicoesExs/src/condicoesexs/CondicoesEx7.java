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
public class CondicoesEx7 {
    
    static public void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double valorInicial,descontoF,descontoM,valorFinal;
        String nome,sexo;
        
        System.out.println("Digite o nome: ");
        nome = teclado.nextLine();
        System.out.println("Digite o sexo M(Masculino) ou F(Feminino): ");
        sexo = teclado.nextLine();
        System.out.println("Digite o valor do produto: ");
        valorInicial = teclado.nextDouble();
           
        if (sexo.equals("F")) {
            descontoF = ((valorInicial / 100)*13);
            valorFinal = valorInicial - descontoF;
            System.out.printf("O valor final do produto de " + nome + " com o desconto aplicado e de: R$%.2f\n", valorFinal);
        } else if (sexo.equals("M")) {
            descontoM = ((valorInicial / 100)*5);
            valorFinal = valorInicial - descontoM;
            System.out.printf("O valor final do produto de " + nome + " com o desconto aplicado e de: R$%.2f\n", valorFinal);
        }
    }
}
