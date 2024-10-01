/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FuncionarioPagavel;

/**
 *
 * @author macig
 */
public class FuncionarioAssalariado implements Pagavel {
    private String nome;
    private String cargo;
    private double salarioBase;
    private int horasMensais;
    private int horasExtras;

    public FuncionarioAssalariado(String nome, String cargo, double salarioBase, int horasMensais, int horasExtras) {
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.horasMensais = horasMensais;
        this.horasExtras = horasExtras;
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

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasMensais() {
        return horasMensais;
    }

    public void setHorasMensais(int horasMensais) {
        this.horasMensais = horasMensais;
    }
    
    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    @Override
    public void calcularPagamento() {
        double pagamento = this.salarioBase;
        if (this.horasExtras > 0) {
            double salarioHora = this.salarioBase/this.horasMensais;
            pagamento = this.salarioBase+this.horasExtras*(salarioHora+(salarioHora/2));
        }
        System.out.printf("O salario a ser pago ao funcionario assalariado e de R$%.2f\n", pagamento);
    }
}