/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eventos;

/**
 *
 * @author Aluno
 */
public class Palestra extends Evento{
    private String palestrante;

    public Palestra(String nome, String data, String palestrante) {
        super(nome, data);
        this.palestrante = palestrante;
    }

    public String getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(String palestrante) {
        this.palestrante = palestrante;
    }
    
    public void showInfo() {
        System.out.println("Palestra: "+nome+"\nData: "+data+"\nPalestrante: "+palestrante);
    }
}