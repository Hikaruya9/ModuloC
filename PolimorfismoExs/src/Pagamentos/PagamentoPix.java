/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pagamentos;

/**
 *
 * @author macig
 */
public class PagamentoPix extends Pagamento{
    private String instituicao;
    private double saldo;

    public PagamentoPix(String instituicao, double saldo) {
        this.instituicao = instituicao;
        this.saldo = saldo;
    }

    @Override
    public void processarPagamento(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.printf("Transacao realizada com sucesso!\nSaldo atualizado: R$%.2f\n",this.saldo);
        } else {
            System.out.printf("Nao foi possivel realizar o pagamento por conta de saldo insuficiente.\nSaldo: R$%.2f\n",this.saldo);
        }
    }
}