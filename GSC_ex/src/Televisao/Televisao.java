/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Televisao;

/**
 *
 * @author macig
 */
public class Televisao {
    private int volume;
    private int canal;

    public Televisao(int volume, int canal) {
        this.volume = volume;
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }
    
    public void aumentarVolume(int q) {
        if (this.volume+q < 100) {
            this.volume += q;
        } else {
            this.volume = 100;
            System.out.println("O volume esta no maximo, nao e possivel aumentar mais!");
        }
    }
    
    public void diminuirVolume(int q) {
        if (this.volume-q > 0) {
            this.volume -= q;
        } else {
            this.volume = 0;
            System.out.println("O volume esta no minimo, nao e possivel diminuir mais!");
        }
    }
    
    public void trocarCanal(int novoCanal) {
        if (novoCanal > 0 && novoCanal < 1000) {
            this.canal = novoCanal;
        } else {
            System.out.println("Este canal nao existe em nossa programacao, tente outro.");
        }
    }
}