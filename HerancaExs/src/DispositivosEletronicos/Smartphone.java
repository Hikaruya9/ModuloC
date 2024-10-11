/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DispositivosEletronicos;

/**
 *
 * @author Aluno
 */
public class Smartphone extends DispositivoEletronico {

    private int screenSize;

    public Smartphone(String marca, String modelo,int screenSize) {
        super(marca, modelo);
        this.screenSize = screenSize;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public void showInfo() {
        System.out.println("Marca: " + getMarca() + "\nModelo: " + getModelo() + "\nTamanho da tela: " + getScreenSize());
    }
}
