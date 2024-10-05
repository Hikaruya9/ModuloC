/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package InstrumentosMusicais;

/**
 *
 * @author Aluno
 */
public class mainInstrumentosMusicais {

    public static void main(String[] args) {
        Bateria drums = new Bateria();
        Piano piano = new Piano();
        Guitarra guitar = new Guitarra();
        
        guitar.tocar();
        System.out.println("------------------------------");
        drums.tocar();
        System.out.println("------------------------------");
        piano.tocar();
    }
}