/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veiculos;

/**
 *
 * @author macig
 */
public class Moto implements Veiculo {
    private String direcao;
    private boolean acelerando;
    
    public Moto(String direcao, boolean acelerando) {
        this.direcao = direcao;
        this.acelerando = acelerando;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    public boolean isAcelerando() {
        return acelerando;
    }

    public void setAcelerando(boolean acelerando) {
        this.acelerando = acelerando;
    }

    @Override
    public void acelerar() {
        if (this.acelerando != true) {
            this.acelerando = true;
            System.out.println("Acelerando...");
        } else {
            System.out.println("Voce ja esta acelerando!");
        }
    }

    @Override
    public void frear() {
        if (this.acelerando != false) {
            this.acelerando = false;
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
