/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContasBancarias;

/**
 *
 * @author Aluno
 */
public abstract class ContaBancaria {
    protected double saldo;
    protected String numeroConta;

    public ContaBancaria(double saldo, String numeroConta) {
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }
    
    public abstract void depositar(double valor);
    public abstract void sacar(double valor);
}
