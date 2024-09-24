/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carro;

/**
 *
 * @author Aluno
 */
public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado;

    public Carro(String marca, String modelo, int ano, boolean ligado) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar() {
        if (this.ligado == true) {
            System.out.println("O carro ja esta ligado!");
        } else {
            this.ligado = true;
            System.out.println("O carro foi ligado!");
        }
    }

    public void desligar() {
        if (this.ligado == false) {
            System.out.println("O carro ja esta desligado!");
        } else {
            this.ligado = false;
            System.out.println("O carro foi desligado!");
        }
    }
    
    public void acelerar() {
        if (this.ligado == true) {
            System.out.println("O carro esta acelerando!\nLembre-se de colocar cinto para sua segurança!");
        } else {
            System.out.println("Ligue o carro antes de comecar a acelerar!");
        }
    }
}