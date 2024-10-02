/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package SistemaNotificacoes;

/**
 *
 * @author Aluno
 */
public class mainNotificacao {

    public static void main(String[] args) {
        PushNotification pn = new PushNotification("Whatsapp", "Jorginho");
        SMS sms = new SMS("40155");
        Email email = new Email("jorginho@gmail.com", "clebinho@gmail.com", "Seus dias estao contados...");

        pn.enviar("Cara, tu viu a nova musica do Linkin Park?\nTa muito foda, pprt");
        System.out.println("-------------------------------------------------------------------------------------");
        sms.enviar("Voce tem um novo recado! Digite yyyyy agora para recebe-los. E apenas 6,90 por mes!");
        System.out.println("-------------------------------------------------------------------------------------");
        email.enviar("Nao esquece o que a gente marcou naquele dia\nSe aquilo acontecer, com toda certeza sera um dia inesquecivel em nossas vidas!");
    }
}