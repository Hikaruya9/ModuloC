/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pagamentos;

/**
 *
 * @author macig
 */
public class PagamentoCartao extends Pagamento{
    private double limiteDisponivel;

    public PagamentoCartao(double limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }
    
    @Override
    public void processarPagamento(double valor) {
        if (this.limiteDisponivel >= valor) {
            this.limiteDisponivel -= valor;
            System.out.printf("Transacao feita com sucesso!\nLimite atualizado do cartao: R$%.2f\n",this.limiteDisponivel);
        } else {
            System.out.printf("Infelizmente nao ha limite disponivel no cartao para a realizacao do pagamento.\nLimite disponivel: R$%.2f\n",this.limiteDisponivel);
        }
    }
}