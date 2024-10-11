/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FormasPagamento;

/**
 *
 * @author Aluno
 */
public class Boleto extends FormaPagamento {
    private double dinheiro;

    public Boleto(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }
    
    @Override
    public void processarPagamento(double valor) {
        if (dinheiro >= valor) {
            System.out.println("Pagamento realizado com sucesso!");
            if (dinheiro > valor) {
                System.out.printf("Aqui esta seu troco: R$%.2f\n", (dinheiro-valor));
            }
        } else {
            System.out.printf("Infelizmente seu dinheiro nao foi suficiente para realizar o pagamento.\nEsta faltando R$%.2f", (valor-dinheiro));
            System.out.println(" para realizar o pagamento.");
        }
    }
}
