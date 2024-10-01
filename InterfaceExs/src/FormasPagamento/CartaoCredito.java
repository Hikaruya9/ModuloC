/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FormasPagamento;

/**
 *
 * @author macig
 */
public class CartaoCredito implements FormaPagamento {
    private double valorCompra;
    private double limiteDisponivel;

    public CartaoCredito(double valorCompra, double limiteDisponivel) {
        this.valorCompra = valorCompra;
        this.limiteDisponivel = limiteDisponivel;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void setLimiteDisponivel(double limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }

    @Override
    public void efetuarPagamento(double valor) {
        if (this.limiteDisponivel > valor) {
            this.limiteDisponivel -= valor;
            System.out.printf("Transacao realizada com sucesso!\nSaldo atualizado no cartao: R$%.2f\n",this.limiteDisponivel);
        } else {
            System.out.println("Saldo do cartao insuficiente!");
        }
    }
}