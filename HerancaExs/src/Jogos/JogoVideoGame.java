/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jogos;

/**
 *
 * @author Aluno
 */
public class JogoVideoGame extends Jogo{
    private boolean controleConectado;

    public JogoVideoGame(boolean controleConectado) {
        this.controleConectado = controleConectado;
    }

    public boolean isControleConectado() {
        return controleConectado;
    }

    public void setControleConectado(boolean controleConectado) {
        this.controleConectado = controleConectado;
    }
    
    @Override
    public void jogar() {
        if (controleConectado) {
            System.out.println("Press START to begin");
        } else {
            System.out.println("Nao ha nenhum controle conectado!");
        }
    }
}