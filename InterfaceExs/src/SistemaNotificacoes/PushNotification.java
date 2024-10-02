/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaNotificacoes;

/**
 *
 * @author macig
 */
public class PushNotification implements Notificacao{
    private String aplicativo;
    private String origem;

    public PushNotification(String aplicativo, String origem) {
        this.aplicativo = aplicativo;
        this.origem = origem;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getAplicativo() {
        return aplicativo;
    }

    public void setAplicativo(String aplicativo) {
        this.aplicativo = aplicativo;
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("Aplicativo: "+this.aplicativo);
        System.out.println("Assunto: "+this.origem);
        System.out.println(mensagem);
    }
}