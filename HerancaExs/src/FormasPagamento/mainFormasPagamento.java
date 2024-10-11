/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FormasPagamento;

/**
 *
 * @author Aluno
 */
public class mainFormasPagamento {

    public static void main(String[] args) {
        Boleto bol = new Boleto(100);
        Pix pix = new Pix(224.95);
        CartaoCredito cc = new CartaoCredito(950.00);
        
        bol.processarPagamento(90);
        System.out.println("--------------------------------");
        pix.processarPagamento(120);
        System.out.println("--------------------------------");
        cc.processarPagamento(590.50);
        System.out.println("/////////////////////////////////////");
        bol.processarPagamento(120);
        System.out.println("--------------------------------");
        pix.processarPagamento(300);
        System.out.println("--------------------------------");
        cc.processarPagamento(1190.00);
        
    }
}