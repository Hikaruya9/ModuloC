/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package SistemaPedidosOnline;

/**
 *
 * @author Aluno
 */
public class mainSistemaPedidosOnline {

    public static void main(String[] args) {
        Roupa r1 = new Roupa("Lacoste", 109.90);
        Eletronico e1 = new Eletronico("Radio", 59.80);
        Alimento a1 = new Alimento("Banana(KG)", 9.90);
        
        r1.obterNome();
        System.out.println("--------------------------------");
        r1.obterPreco();
        System.out.println("--------------------------------");
        r1.adicionarAoCarrinho(r1);
        System.out.println("================================");
        e1.obterNome();
        System.out.println("--------------------------------");
        e1.obterPreco();
        System.out.println("--------------------------------");
        
        System.out.println("================================");
        a1.obterNome();
        System.out.println("--------------------------------");
        a1.obterPreco();
        
    }
}