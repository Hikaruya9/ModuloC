/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaPedidosOnline;

/**
 *
 * @author macig
 */
public class Roupa implements Produto {
    private String marca;
    private double preco;

    public Roupa(String marca, double preco) {
        this.marca = marca;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String obterNome() {
        return this.marca;
    }

    @Override
    public double obterPreco() {
        return this.preco;
    }

    @Override
    public void adicionarAoCarrinho(CarrinhoCompras carrinho) {
        
    }
}