/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veiculos;

/**
 *
 * @author Aluno
 */
public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void showInfo() {
        System.out.println("Marca moto: "+getMarca());
        System.out.println("Modelo moto: "+getModelo());
        System.out.println("Ano moto: "+getAno());
        System.out.println("Cilindradas moto: "+getCilindradas());
    }
}