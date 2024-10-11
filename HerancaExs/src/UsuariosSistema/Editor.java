/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UsuariosSistema;

/**
 *
 * @author Aluno
 */
public class Editor extends Usuario {

    private String permissaoEdicao;

    public Editor(String nome, String login, String permissaoEdicao) {
        super(nome, login);
        this.permissaoEdicao = permissaoEdicao;
    }

    public String getPermissaoEdicao() {
        return permissaoEdicao;
    }

    public void setPermissaoEdicao(String permissaoEdicao) {
        this.permissaoEdicao = permissaoEdicao;
    }

    public void showInfo() {
        System.out.println("Nome do usuario: " + nome + "\nLogin: " + login + "\nPermissao de edicao: " + permissaoEdicao);
    }
}
