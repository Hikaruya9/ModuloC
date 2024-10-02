/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ContasUsuarios;

/**
 *
 * @author Aluno
 */
public class mainContaUsuario {

    public static void main(String[] args) {
        UsuarioComum uc1 = new UsuarioComum("Jorge", false);
        Administrador a1 = new Administrador("Gustavo", true);
        
        uc1.acessarSistema();
        a1.acessarSistema();
        uc1.realizarOperacao();
        a1.realizarOperacao();
    }
}