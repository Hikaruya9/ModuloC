/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaReservasHotel;

/**
 *
 * @author macig
 */
public class QuartoLuxo implements Quarto {
    private String tipo;
    private double precoDiaria;
    private boolean disponivel;

    public QuartoLuxo(String tipo, double precoDiaria, boolean disponivel) {
        this.tipo = tipo;
        this.precoDiaria = precoDiaria;
        this.disponivel = disponivel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String obterTipo() {
        return this.tipo;
    }

    @Override
    public double obterPrecoDiaria() {
        return this.precoDiaria;
    }

    @Override
    public void reservar() {
        if (disponivel) {
            System.out.println("Sua reserva foi realizada com sucesso!\nAproveite sua estadia.");
            this.disponivel = false;
        } else {
            System.out.println("Infelizmente nao estamos com este quarto disponivel no momento.");
        }
    }
}