/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Midias;

/**
 *
 * @author Aluno
 */
public class Musica extends Midia{
    private String artista;
    private String album;

    public Musica(String titulo, String duracao, String artista, String album) {
        super(titulo, duracao);
        this.artista = artista;
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
    
    public void showInfo() {
        System.out.println("Musica: "+titulo+"\nDuracao: "+duracao+"\nArtista: "+artista+"\nAlbum: "+album);
    }
}
