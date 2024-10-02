/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veiculos;

/**
 *
 * @author macig
 */
public class Bicicleta implements Veiculo {
    private String direcao;
    private boolean andando;

    public Bicicleta(String direcao, boolean andando) {
        this.direcao = direcao;
        this.andando = andando;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    public boolean isAndando() {
        return andando;
    }

    public void setAndando(boolean andando) {
        this.andando = andando;
    }

    @Override
    public void acelerar() {
        if (this.andando != true) {
            this.andando = true;
            System.out.println("Acelerando...");
        } else {
            System.out.println("Voce ja esta acelerando!");
        }
    }

    @Override
    public void frear() {
        if (this.andando != false) {
            this.andando = false;
            System.out.println("Freando...");
        } else {
            System.out.println("Voce ja esta parado!");
        }
    }

    @Override
    public void virar(String direcao) {
        if (direcao.equalsIgnoreCase("Direita")) {
            this.direcao = "Direita";
            System.out.println("Virando para a direita...");
        } else if (direcao.equalsIgnoreCase("Esquerda")) {
            this.direcao = "Esquerda";
            System.out.println("Virando para a esquerda...");
        } else if (direcao.equalsIgnoreCase("Retorno")) {
            this.direcao = "Retorno";
            System.out.println("Fazendo o retorno...");
        } else {
            System.out.println("Esta opcao nao e valida.\nTente 'Retorno', 'Direita', 'Esquerda'");
        }
    }
}