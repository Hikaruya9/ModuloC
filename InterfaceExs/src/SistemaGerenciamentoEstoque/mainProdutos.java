/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package SistemaGerenciamentoEstoque;

/**
 *
 * @author Aluno
 */
public class mainProdutos {

    public static void main(String[] args) {
        Alimento a1 = new Alimento("Banana", 5.99, 55);
        Roupa r1 = new Roupa("Gucci", 295.99, 10);
        Eletronico e1 = new Eletronico("iPhone Pro Max 12", 10595.99, 20);
        
        System.out.println("Nome alimento: "+a1.obterNome());
        System.out.println("Preco alimento: R$"+a1.obterPreco());
        System.out.println("Quantidade em estoque do alimento: "+a1.obterQuantidadeEstoque());
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Nome roupa: "+r1.obterNome());
        System.out.println("Preco roupa: R$"+r1.obterPreco());
        System.out.println("Quantidade em estoque da roupa: "+r1.obterQuantidadeEstoque());
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Nome eletronico: "+e1.obterNome());
        System.out.println("Preco eletronico: R$"+e1.obterPreco());
        System.out.println("Quantidade em estoque do eletronico: "+e1.obterQuantidadeEstoque());
    }
}
