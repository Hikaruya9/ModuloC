/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Produtos;

/**
 *
 * @author Aluno
 */
public class Roupa extends Produto{
    private String tamanho;

    public Roupa(String nome, double preco, String tamanho) {
        super(nome, preco);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    public void showInfo() {
        System.out.println("Roupa: "+getNome());
        System.out.printf("Preco: R$%.2f\n",getPreco());
        System.out.println("Tamanho: "+getTamanho());
    }
}