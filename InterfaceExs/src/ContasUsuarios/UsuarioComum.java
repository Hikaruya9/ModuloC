/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContasUsuarios;

/**
 *
 * @author macig
 */
public class UsuarioComum implements ContaUsuario {

    private String nome;
    private boolean permissaoOperacao;

    public UsuarioComum(String nome, boolean permissaoOperacao) {
        this.nome = nome;
        this.permissaoOperacao = permissaoOperacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isPermissaoOperacao() {
        return permissaoOperacao;
    }

    public void setPermissaoOperacao(boolean permissaoOperacao) {
        this.permissaoOperacao = permissaoOperacao;
    }

    @Override
    public void acessarSistema() {
        System.out.println("Seja bem vindo, usuario " + this.nome + "!");
    }

    @Override
    public void realizarOperacao() {
        if (permissaoOperacao != false) {
            System.out.println("Voce esta permitido a realizar a operacao");
        } else {
            System.out.println("Desculpe, mas parece que voce nao tem a permissao necessaria para realizar esta acao.");
        }
    }
}
