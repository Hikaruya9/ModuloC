/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veiculos;

/**
 *
 * @author Aluno
 */
public class Carro extends Veiculo{
    private int numPortas;
    
    public Carro(String marca, String modelo, int ano, int numPortas) {
        super(marca, modelo, ano);
        this.numPortas = numPortas;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    @Override
    public void showInfo() {
        System.out.println("Marca carro: "+getMarca());
        System.out.println("Modelo carro: "+getModelo());
        System.out.println("Ano carro: "+getAno());
        System.out.println("Numero de portas carro: "+getNumPortas());
    }
}