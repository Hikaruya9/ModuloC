/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Pagamentos;

/**
 *
 * @author Aluno
 */
public class mainPagamentos {

    public static void main(String[] args) {
        PagamentoPix pp = new PagamentoPix("Nubank Pagamento S.A.", 1000.57);
        PagamentoCartao pc = new PagamentoCartao(1930.74);
        PagamentoBoleto pb = new PagamentoBoleto(100, 1.50);
        
        pp.processarPagamento(524);
        System.out.println("-----------------------------------------");
        pc.processarPagamento(1119.99);
        System.out.println("-----------------------------------------");
        pb.processarPagamento(105);
    }
}