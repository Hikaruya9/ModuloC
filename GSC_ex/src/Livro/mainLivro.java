/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Livro;

/**
 *
 * @author Aluno
 */
public class mainLivro {
    public static void main(String[] args) {
        Livro l1 = new Livro("1984","George Orwell",1952,true);
        
        System.out.println(l1.getTitle());
        System.out.println(l1.getAuthor());
        System.out.println(l1.getReleaseYear());
        System.out.println(l1.isAvailable()+"\n");
        
        l1.emprestar();
        l1.devolver();
        System.out.println("\n");
        
        l1.setTitle("Aprendendo a Aprender");
        l1.setAuthor("Barbara Oakley");
        l1.setReleaseYear(2015);
        l1.setAvailable(false);
        
        System.out.println(l1.getTitle());
        System.out.println(l1.getAuthor());
        System.out.println(l1.getReleaseYear());
        System.out.println(l1.isAvailable()+"\n");
        
        l1.emprestar();
    }
}
