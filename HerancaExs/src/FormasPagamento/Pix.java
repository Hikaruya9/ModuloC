/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FormasPagamento;

/**
 *
 * @author Aluno
 */
public class Pix extends FormaPagamento{

    private double saldo;

    public Pix(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void processarPagamento(double valor) {
        if (saldo >= valor) {
            System.out.printf("Pagamento realizado com sucesso!\nSaldo atualizado: R$%.2f\n", getSaldo());
        } else {
            System.out.printf("Infelizmente voce nao tem saldo suficiente para realizar este pagamento.\nSaldo atual: R$%.2f\n", getSaldo());
        }
    }
}
