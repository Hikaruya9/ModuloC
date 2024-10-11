/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eventos;

/**
 *
 * @author Aluno
 */
public class Show extends Evento{
    private String artista;

    public Show(String nome, String data, String artista) {
        super(nome, data);
        this.artista = artista;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
    
    public void showInfo() {
        System.out.println("Show: "+nome+"\nData: "+data+"\nArtista: "+artista);
    }
}
