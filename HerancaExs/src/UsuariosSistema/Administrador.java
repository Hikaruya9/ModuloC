/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UsuariosSistema;

/**
 *
 * @author Aluno
 */
public class Administrador extends Usuario{
    private String nivelAcesso;

    public Administrador(String nome, String login, String nivelAcesso) {
        super(nome, login);
        this.nivelAcesso = nivelAcesso;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
    
    public void showInfo() {
        System.out.println("Nome do usuario: "+nome+"\nLogin: "+login+"\nNivel de acesso: "+nivelAcesso);
    }
}