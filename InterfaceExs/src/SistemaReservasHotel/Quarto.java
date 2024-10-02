/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package SistemaReservasHotel;

/**
 *
 * @author macig
 */
public interface Quarto {
    public abstract String obterTipo();
    public abstract double obterPrecoDiaria();
    public abstract void reservar();
}
