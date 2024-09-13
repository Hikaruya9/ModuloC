/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ex2;

/**
 *
 * @author macig
 */
public class ContaBancaria {

    String numeroConta;
    double saldo;
    String titular;

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("O valor de seu saldo apos o deposito e: " + saldo);
    }

    public void sacar(double valor) {
        if (saldo > valor) {
            saldo -= valor;
            System.out.println("O valor de seu saldo apos o saque e: " + saldo);
        } else {
            System.out.println("Saldo insuficiente pra sacar essa quantia!");
        }
    }
}
