/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaNotificacoes;

/**
 *
 * @author macig
 */
public class SMS implements Notificacao {
    private String origem;

    public SMS(String origem) {
        this.origem = origem;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }
    
    @Override
    public void enviar(String mensagem) {
        System.out.println("origem: "+this.origem);
        System.out.println(mensagem);
    }
}