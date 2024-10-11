/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Produtos;

/**
 *
 * @author Aluno
 */
public class Eletronico extends Produto{
    private int voltagem;

    public Eletronico(String nome, double preco, int voltagem) {
        super(nome, preco);
        this.voltagem = voltagem;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
    
    public void showInfo() {
        System.out.println("Eletronico: "+getNome());
        System.out.printf("Preco: R$%.2f\n",getPreco());
        System.out.println("Voltagem: "+getVoltagem());
    }
}
