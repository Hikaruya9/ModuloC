/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaGerenciamentoEstoque;

/**
 *
 * @author macig
 */
public class Eletronico implements Produto {

    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Eletronico(String nome, double preco, int quantidadeEstoque) {
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

    public double getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public String obterNome() {
        return nome;
    }

    @Override
    public double obterPreco() {
        return preco;
    }

    @Override
    public int obterQuantidadeEstoque() {
        return quantidadeEstoque;
    }
}
