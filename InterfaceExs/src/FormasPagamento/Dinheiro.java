/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FormasPagamento;

/**
 *
 * @author macig
 */
public class Dinheiro implements FormaPagamento {
    private double valorCompra;

    public Dinheiro(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    @Override
    public void efetuarPagamento(double valor) {
        if (valor == this.valorCompra) {
            System.out.println("Transacao feita com sucesso!");
        } else if (valor > this.valorCompra) {
            System.out.printf("Transacao feita com sucesso!\nAqui esta seu troco R$%.2f\n", valor-(this.valorCompra));
        } else {
            System.out.println("Valor insuficiente!");
        }
    }
}