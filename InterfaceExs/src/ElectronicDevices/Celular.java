/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ElectronicDevices;

/**
 *
 * @author macig
 */
public class Celular implements DispositivoEletronico {
    private String marca;
    private String modelo;
    private boolean ligado;

    public Celular(String marca, String modelo, boolean ligado) {
        this.marca = marca;
        this.modelo = modelo;
        this.ligado = ligado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    @Override
    public void ligar() {
        if (this.ligado != true) {
            this.ligado = true;
            System.out.println("Ligando o celular.....");
        } else {
            System.out.println("O celular ja esta ligado!");
        }
    }

    @Override
    public void desligar() {
        if (this.ligado != false) {
            this.ligado = false;
            System.out.println("Desligando o celular.....");
        } else {
            System.out.println("O celular ja esta desligado!");
        }
    }

    @Override
    public void obterStatus() {
        System.out.println("O celular esta ligado? \n"+this.ligado);
    }
}