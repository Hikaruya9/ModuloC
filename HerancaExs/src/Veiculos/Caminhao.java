/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veiculos;

/**
 *
 * @author Aluno
 */
public class Caminhao extends Veiculo{
    private int carga;

    public Caminhao(String marca, String modelo, int ano, int carga) {
        super(marca, modelo, ano);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public void showInfo() {
        System.out.println("Marca caminhao: "+getMarca());
        System.out.println("Modelo caminhao: "+getModelo());
        System.out.println("Ano caminhao: "+getAno());
        System.out.println("Carga caminhao: "+getCarga());
    }
}