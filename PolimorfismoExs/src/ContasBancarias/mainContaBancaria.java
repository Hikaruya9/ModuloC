/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ContasBancarias;

/**
 *
 * @author Aluno
 */
public class mainContaBancaria {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(10000, "6758302-4");
        ContaPoupanca cp1 = new ContaPoupanca(20000, "9486527-5", 6);
        ContaPoupanca cp2 = new ContaPoupanca(20000, "5867365-9", 1);
        
        cc.depositar(4000);
        cp1.depositar(1000);
        cp2.depositar(1000);
        
        cc.sacar(2000);
        cp1.sacar(3000);
        cp2.sacar(1500);
    }
}