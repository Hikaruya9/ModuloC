/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pessoas;

/**
 *
 * @author Aluno
 */
public class Funcionario extends Pessoa{
    private String cargo;

    public Funcionario(String nome, int idade, String adress, String cargo) {
        super(nome, idade, adress);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public void showInfo() {
        System.out.println("Nome: " + getNome() + "\nIdade: "+getIdade()+"\nEndereco: "+getAdress()+"\nCargo: "+getCargo());
    }
}