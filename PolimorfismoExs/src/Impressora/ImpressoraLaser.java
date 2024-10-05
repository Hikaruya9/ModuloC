/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Impressora;

/**
 *
 * @author macig
 */
public class ImpressoraLaser implements Impressora{

    private int tonerPorcentagem;

    public ImpressoraLaser(int tonerPorcentagem) {
        this.tonerPorcentagem = tonerPorcentagem;
    }

    @Override
    public void imprimir(String documento) {
        if (this.tonerPorcentagem > 0) {
            System.out.println("|||||"); //Cada barra representa 1 segundo
            System.out.println(documento);
            this.tonerPorcentagem -= 1;
        } else {
            System.out.println("Infelizmente nao temos tinta suficiente para a impressao.\nPor favor, troque o cartucho e tente novamente.");
        }
    }
}
