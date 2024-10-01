/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Animal;

/**
 *
 * @author Aluno
 */
public class mainAnimal {

    public static void main(String[] args) {
        Cachorro c1 = new Cachorro("Au, au!");
        Gato g1 = new Gato("Miau!");
        Passaro p1 = new Passaro("Cri, cri!");
        
        c1.emitirSom();
        g1.emitirSom();
        p1.emitirSom();
    }
}