/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pessoa;

/**
 *
 * @author macig
 */
public class Pessoa implements Comparable {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public void comparaIdade(Pessoa p1) {
        if (p1.idade > idade) {
            System.out.println("O "+p1.nome+" e "+(p1.idade-idade)+" anos mais velho que o "+nome);
        } else if (p1.idade == idade) {
            System.out.println("Tanto "+p1.nome+", quanto "+nome+" possuem a mesma idade de "+p1.idade+" anos");
        } else {
            System.out.println("O "+p1.nome+" e "+(idade-p1.idade)+" anos mais novo que o "+nome);
        }
    }
}