/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContaBancaria;

/**
 *
 * @author Aluno
 */
public class mainContaBancaria {
    public static void main(String[] args) {
        ContaBancaria cb1 = new ContaBancaria("67382433-9",529.50,"Jorge");
        
        System.out.println("Numero da conta: "+cb1.getNumeroConta());
        System.out.println("Saldo: "+cb1.getSaldo());
        System.out.println("Titular: "+cb1.getTitular()+"\n");
        
        cb1.depositar(590.60);
        System.out.println("");
        
        cb1.setNumeroConta("65288433-8");
        cb1.setSaldo(630.90);
        cb1.setTitular("Cleber");
        
        System.out.println("Numero da conta: "+cb1.getNumeroConta());
        System.out.println("Saldo: "+cb1.getSaldo());
        System.out.println("Titular: "+cb1.getTitular());
    }
}
