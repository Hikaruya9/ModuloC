/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Produtos;

/**
 *
 * @author Aluno
 */
public class mainProdutos {

    public static void main(String[] args) {
        Roupa rp = new Roupa("Camiseta", 59.90, "M");
        Livro lv = new Livro("1984", 49.60, "George Orwell", "9788535914849");
        Eletronico ec = new Eletronico("Radio", 159.90, 110);
        
        rp.showInfo();
        System.out.println("-----------------------------------");
        lv.showInfo();
        System.out.println("-----------------------------------");
        ec.showInfo();
    }
}