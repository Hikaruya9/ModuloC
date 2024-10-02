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
        Dinheiro d1 = new Dinheiro(50);
        CartaoCredito cc1 = new CartaoCredito(100, 200);
        Boleto b1 = new Boleto(70, 1.50);
        
        d1.efetuarPagamento(55);
        cc1.efetuarPagamento(100);
        b1.efetuarPagamento(65);
    }
}