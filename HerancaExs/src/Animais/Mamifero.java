/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animais;

/**
 *
 * @author Aluno
 */
public class Mamifero extends Animal {
    private String tipoPelo;

    public Mamifero(String nome, int idade, String tipoPelo) {
        super(nome, idade);
        this.tipoPelo = tipoPelo;
    }

    public String getTipoPelo() {
        return tipoPelo;
    }

    public void setTipoPelo(String tipoPelo) {
        this.tipoPelo = tipoPelo;
    }

    public void showInfo() {
        System.out.println("Nome mamifero: "+getNome()+"\nIdade mamifero: "+getIdade()+"\nPelo: "+getTipoPelo());
    }
}