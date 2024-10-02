/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FormasPagamento;

/**
 *
 * @author macig
 */
public class Boleto implements FormaPagamento {
    private double valorTransacao;
    private double taxaServico;

    public Boleto(double valorTransacao, double taxaServico) {
        this.valorTransacao = valorTransacao;
        this.taxaServico = taxaServico;
    }

    public double getValorTransacao() {
        return valorTransacao;
    }

    public void setValorTransacao(double valorTransacao) {
        this.valorTransacao = valorTransacao;
    }

    public double getTaxaServico() {
        return taxaServico;
    }

    public void setTaxaServico(double taxaServico) {
        this.taxaServico = taxaServico;
    }

    @Override
    public void efetuarPagamento(double valor) {
        if (valor == this.taxaServico+this.valorTransacao) {
            System.out.println("Transacao feita com sucesso!");
        } else if (valor > this.valorTransacao+this.taxaServico) {
            System.out.printf("Transacao feita com sucesso!\nAqui esta seu troco R$%.2f\n", valor-(this.taxaServico+this.valorTransacao));
        } else {
            System.out.println("Valor insuficiente!");
        }
    }
}