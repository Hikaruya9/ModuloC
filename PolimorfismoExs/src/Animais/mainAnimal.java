/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Animais;

/**
 *
 * @author Aluno
 */
public class mainAnimal {

    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        Gato cat = new Gato();
        Vaca cow = new Vaca();
        
        dog.emitirSom();
        cat.emitirSom();
        cow.emitirSom();
    }
}