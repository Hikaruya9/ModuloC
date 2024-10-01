/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ContaBancaria;

/**
 *
 * @author Aluno
 */
public class mainContaBancaria {

    public static void main(String[] args) {
        ContaCorrente cb1 = new ContaCorrente("Jorge","7384295-3",2524.90);
        
        cb1.depositar(900.50);
        cb1.sacar(2000);
        //cb1.sacar(4000); //Saldo insuficiente
    }
}