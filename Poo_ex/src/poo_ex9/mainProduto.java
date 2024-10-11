/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_ex9;

/**
 *
 * @author Aluno
 */
public class mainProduto {

    public static void main(String[] args) {
        Produto prod = new Produto("Vinil", 524.90, 10);
        
        prod.vender(9);
        System.out.println("---------------------------------");
        prod.vender(3);
        System.out.println("=================================");
        prod.reporEstoque(24);
        System.out.println("---------------------------------");
        prod.vender(3);
        
    }
}