/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UsuariosSistema;

/**
 *
 * @author Aluno
 */
public class Leitor extends Usuario {

    private String historicoLeitura;

    public Leitor(String nome, String login, String historicoLeitura) {
        super(nome, login);
        this.historicoLeitura = historicoLeitura;
    }

    public String getHistoricoLeitura() {
        return historicoLeitura;
    }

    public void setHistoricoLeitura(String historicoLeitura) {
        this.historicoLeitura = historicoLeitura;
    }

    public void showInfo() {
        System.out.println("Nome do usuario: " + nome + "\nLogin: " + login + "\nHistorico de Leitura: " + historicoLeitura);
    }
}
