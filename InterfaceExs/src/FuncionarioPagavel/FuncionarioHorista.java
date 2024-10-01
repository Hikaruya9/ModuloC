/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FuncionarioPagavel;

/**
 *
 * @author macig
 */
public class FuncionarioHorista implements Pagavel {
    private String nome;
    private String cargo;
    private double salarioHora;
    private int horasTrabalhadas;

    public FuncionarioHorista(String nome, String cargo, double salarioHora, int horasTrabalhadas) {
        this.nome = nome;
        this.cargo = cargo;
        this.salarioHora = salarioHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public void calcularPagamento() {
        double pagamento = this.horasTrabalhadas*salarioHora;
        System.out.printf("O salario a ser pago ao funcionario horista e de R$%.2f\n", pagamento);
    }
}