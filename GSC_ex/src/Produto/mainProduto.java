/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Produto;

/**
 *
 * @author Aluno
 */
public class mainProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto("Livros",29.90,50);
        
        System.out.println(p1.getNome());
        System.out.println(p1.getPreco());
        System.out.println(p1.getQuantidadeEstoque()+"\n");
        
        p1.setNome("Livro");
        p1.setPreco(35.90);
        p1.setQuantidadeEstoque(40);
        
        p1.comprar(10);
        
        System.out.println(p1.getNome());
        System.out.println(p1.getPreco());
    }
}
