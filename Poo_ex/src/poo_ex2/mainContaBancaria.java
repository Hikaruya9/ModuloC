/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ex2;

/**
 *
 * @author macig
 */
public class mainContaBancaria {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();
        c1.numeroConta = "83492834-9";
        c1.saldo = 973.54;
        c1.titular = "001.002.003-91";
        c1.depositar(524.30);
        c1.sacar(3590.20);
    }
}
