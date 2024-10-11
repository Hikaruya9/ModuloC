/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eventos;

/**
 *
 * @author Aluno
 */
public class Workshop extends Evento{
    private String instrutor;

    public Workshop(String nome, String data, String instrutor) {
        super(nome, data);
        this.instrutor = instrutor;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(String instrutor) {
        this.instrutor = instrutor;
    }

    public void showInfo() {
        System.out.println("Workshop: "+nome+"\nData: "+data+"\nInstrutor(a): "+instrutor);
    }
}