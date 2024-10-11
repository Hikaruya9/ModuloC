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
        ContaPoupanca cp = new ContaPoupanca("587396-3", 500, 8.1);
        ContaCorrente cc = new ContaCorrente("342155-9", 1000, 2000);
        ContaInvestimento ci = new ContaInvestimento("523534-7", 2000, "CDI (liquidez diaria)");
        
        cp.showInfo();
        System.out.println("-------------------------------");
        cc.showInfo();
        System.out.println("-------------------------------");
        ci.showInfo();
    }
}