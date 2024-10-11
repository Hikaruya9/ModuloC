/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ex9;

/**
 *
 * @author Aluno
 */
public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    public void vender(int quantidade) {
        if (quantidade <= quantidadeEstoque) {
            quantidadeEstoque -= quantidade;
            System.out.println("Voce vendeu "+quantidade+" unidades do produto "+nome+" por R$"+preco+"\nEstoque atualizado: "+quantidadeEstoque);
        } else {
            System.out.println("Infelizmente nao ha unidades suficientes do produto "+nome+" para serem vendidas.\nQuantidade em estoque: "+quantidadeEstoque);
        }
    }
    
    public void reporEstoque(int quantidade) {
        quantidadeEstoque += quantidade;
        System.out.println("Voce esta repondo "+quantidade+" unidades no estoque do produto "+nome+" de preco R$"+preco+"\nNovo estoque atualizado: "+quantidadeEstoque);
    }
}