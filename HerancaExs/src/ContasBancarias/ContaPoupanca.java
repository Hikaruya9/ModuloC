/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContasBancarias;

/**
 *
 * @author Aluno
 */
public class ContaPoupanca extends ContaBancaria{
    private double taxaJuros;

    public ContaPoupanca(String numeroConta, double saldo, double taxaJuros) {
        super(numeroConta, saldo);
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void showInfo() {
        System.out.println("Numero da conta: "+getNumeroConta());
        System.out.printf("Saldo: R$%.2f\n", getSaldo());
        System.out.printf("Taxa de juros: %.2f\n", getTaxaJuros());
    }
}