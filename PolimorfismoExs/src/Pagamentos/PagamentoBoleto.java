/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pagamentos;

/**
 *
 * @author macig
 */
public class PagamentoBoleto extends Pagamento{
    private double valorTransacao;
    private double taxaServico;

    public PagamentoBoleto(double valorTransacao, double taxaServico) {
        this.valorTransacao = valorTransacao;
        this.taxaServico = taxaServico;
    }
    
    @Override
    public void processarPagamento(double valor) {
        if (valor == this.valorTransacao+this.taxaServico) {
            System.out.println("Transacao realizada com sucesso!");
        } else if (valor > this.valorTransacao+this.taxaServico) {
            System.out.printf("Transacao realizada com sucesso!\nAqui esta seu troco: R$%.2f\n", (valor-(this.valorTransacao+this.taxaServico)));
        } else {
            System.out.printf("Valor insuficiente para finalizar a transacao\nLembre-se que voce precisa contar com o valor da taxa de servico: R$%.2f\n",this.taxaServico);
        }
    }
}