/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaNotificacoes;

/**
 *
 * @author macig
 */
public class Email implements Notificacao {
    private String origem;
    private String destinatario;
    private String assunto;

    public Email(String origem, String destinatario, String assunto) {
        this.origem = origem;
        this.destinatario = destinatario;
        this.assunto = assunto;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("De: "+this.origem);
        System.out.println("Para: "+this.destinatario+"\n");
        System.out.println("Assunto: "+this.assunto+"\n");
        System.out.println(mensagem);
    }
}
