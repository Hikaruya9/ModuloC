/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package SistemaPedidosOnline;

/**
 *
 * @author macig
 */
public interface Produto {
    public abstract String obterNome();
    public abstract double obterPreco();
    public abstract void adicionarAoCarrinho(CarrinhoCompras carrinho);
}