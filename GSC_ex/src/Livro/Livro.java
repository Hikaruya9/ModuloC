/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Livro;

/**
 *
 * @author Aluno
 */
public class Livro {

    private String title;
    private String author;
    private int releaseYear;
    private boolean available;
    
    public Livro(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Livro(String title, String author, int releaseYear, boolean available) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public int getReleaseYear() {
        return releaseYear;
    }
    
    public void setReleaseYear(int year) {
        this.releaseYear = year;
    }
    
    public boolean isAvailable() {
        return available;
    }
    
    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    public void emprestar() {
        if (this.available == true) {
            available = false;
            System.out.println("Aqui esta o livro "+getTitle());
        } else {
            System.out.println("Parece que nao temos este livro disponivel no momento, volte aqui em outra hora.");
        }
    }
    
    public void devolver() {
        if (this.available == false) {
            available = true;
            System.out.println("Agradecemos sua devolucao do livro "+getTitle()+"!");
        } else {
            System.out.println("Parece que ja temos esse livro em nossa estante, verifique o livro novamente, por favor");
        }
    }
}
