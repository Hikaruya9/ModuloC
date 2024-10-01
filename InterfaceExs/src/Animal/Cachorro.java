/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animal;

/**
 *
 * @author macig
 */
public class Cachorro implements Animal {
    private String somEmitido;

    public Cachorro(String somEmitido) {
        this.somEmitido = somEmitido;
    }

    public String getSomEmitido() {
        return somEmitido;
    }

    public void setSomEmitido(String somEmitido) {
        this.somEmitido = somEmitido;
    }
    
    @Override
    public void emitirSom() {
        System.out.println(somEmitido);
    }
}