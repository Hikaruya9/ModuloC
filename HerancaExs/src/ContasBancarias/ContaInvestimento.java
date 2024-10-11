/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContasBancarias;

/**
 *
 * @author Aluno
 */
public class ContaInvestimento extends ContaBancaria {

    private String tipoInvestimento;

    public ContaInvestimento(String numeroConta, double saldo, String tipoInvestimento) {
        super(numeroConta, saldo);
        this.tipoInvestimento = tipoInvestimento;
    }

    public String getTipoInvestimento() {
        return tipoInvestimento;
    }

    public void setTipoInvestimento(String tipoInvestimento) {
        this.tipoInvestimento = tipoInvestimento;
    }

    public void showInfo() {
        System.out.println("Numero da conta: "+getNumeroConta());
        System.out.printf("Saldo: R$%.2f\n", getSaldo());
        System.out.println("Tipo de investimento: "+ getTipoInvestimento());
    }
}
