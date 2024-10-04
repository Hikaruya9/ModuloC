/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContasBancarias;

/**
 *
 * @author Aluno
 */
public class ContaPoupanca extends ContaBancaria {
    private int mesesPassadosUltimoDeposito;

    public ContaPoupanca(double saldo, String numeroConta, int mpud) {
        super(saldo, numeroConta);
        this.mesesPassadosUltimoDeposito = mpud;
    }

    @Override
    public void depositar(double valor) {
        for (int i = 0; i < this.mesesPassadosUltimoDeposito; i++) {
            saldo *= 1+(0.5/100);
        }

        if (valor > 1) {
            saldo += valor;
            System.out.printf("Obrigado pelo deposito!\nSaldo atualizado: R$%.2f\n", saldo);
        } else {
            System.out.println("Por favor, insira um valor de pelo menos R$1,00 para fazer o deposito.");
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.printf("Seu saque foi realizado com sucesso!\nSaldo atualizado: R$%.2f\n", saldo);
        } else if (valor > saldo) {
            System.out.println("Infelizmente nao foi possivel realizar o saque.\nSaldo insuficiente.");
        } else {
            System.out.println("Por favor, insira um valor de pelo menos R$1,00 para realizar o saque.");
        }
    }
}
