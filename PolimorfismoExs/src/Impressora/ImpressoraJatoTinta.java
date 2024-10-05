/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Impressora;

/**
 *
 * @author macig
 */
public class ImpressoraJatoTinta implements Impressora {
    private int cartuchoPorcentagem;

    public ImpressoraJatoTinta(int cartuchoPorcentagem) {
        this.cartuchoPorcentagem = cartuchoPorcentagem;
    }

    @Override
    public void imprimir(String documento) {
        if (cartuchoPorcentagem > 1) {
            System.out.println("||||||||||"); //Cada barra representa 1 segundo
            System.out.println(documento);
            this.cartuchoPorcentagem -= 2;
        } else {
            System.out.println("Infelizmente nao temos tinta suficiente para a impressao.\nPor favor, troque o cartucho e tente novamente.");
        }
    }
}
