/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animal;

/**
 *
 * @author macig
 */
public class mainAnimal {
    public static void main(String[] args) {
        Animal a1 = new Animal("Coruja", "Ave");
        
        System.out.println("Animal: "+a1.getNome()+"\nEspecie: "+a1.getEspecie());
        
        a1.setNome("Cachorro");
        a1.setEspecie("Mamifero");
        
        System.out.println("\nAnimal: "+a1.getNome()+"\nEspecie: "+a1.getEspecie());
    }
}