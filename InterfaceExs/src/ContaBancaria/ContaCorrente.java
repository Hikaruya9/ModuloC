/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContaBancaria;

/**
 *
 * @author macig
 */
public class ContaCorrente implements Conta {
    
    private String titular;
    private String numeroConta;
    private double saldo;

    public ContaCorrente(String titular, String numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.printf("Agradecemos o seu deposito.\nSeu saldo agora e: R$%.2f\n", this.saldo);
    }

    @Override
    public void sacar(double valor) {
        if (saldo > valor) {
            saldo -= valor;
            System.out.printf("Saque realizado com sucesso.\nSeu saldo atual e: R$%.2f\n", this.saldo);
        } else {
            System.out.println("Saldo insuficiente para sacar essa quantia!");
        }
    }
}