/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaPedidosOnline;

/**
 *
 * @author macig
 */
public class Eletronico implements Produto {
    private String nome;
    private double preco;

    public Eletronico(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
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

    @Override
    public String obterNome() {
        return this.nome;
    }

    @Override
    public double obterPreco() {
        return this.preco;
    }

    @Override
    public void adicionarAoCarrinho(CarrinhoCompras carrinho) {
        
    }
}