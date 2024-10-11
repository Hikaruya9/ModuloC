/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animais;

/**
 *
 * @author Aluno
 */
public class Ave extends Animal {

    private double envergaduraAsa;

    public Ave(String nome, int idade, double envergaduraAsa) {
        super(nome, idade);
        this.envergaduraAsa = envergaduraAsa;
    }

    public double getEnvergaduraAsa() {
        return envergaduraAsa;
    }

    public void setEnvergaduraAsa(double envergaduraAsa) {
        this.envergaduraAsa = envergaduraAsa;
    }

    public void showInfo() {
        System.out.println("Nome ave: " + getNome() + "\nIdade ave: " + getIdade() + "\nEnvergadura da asa: " + getEnvergaduraAsa());
    }
}
