/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FormasPagamento;

/**
 *
 * @author Aluno
 */
public class CartaoCredito extends FormaPagamento{
    private double limiteDisponivel;

    public CartaoCredito(double limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }

    public double getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void setLimiteDisponivel(double limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }

    @Override
    public void processarPagamento(double valor) {
        if (limiteDisponivel >= valor) {
            System.out.printf("Pagamento realizado com sucesso!\nLimite disponivel atualizado: R$%.2f\n", getLimiteDisponivel());
        } else {
            System.out.printf("Infelizmente voce nao tem limite disponivel suficiente para realizar este pagamento.\nLimite atual: R$%.2f\n", getLimiteDisponivel());
        }
    }
}
