/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchcaseex;

import java.util.Scanner;
/**
 *
 * @author macig
 */
public class SwitchCaseEx10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String letra;
        
        System.out.println("Digite a letra que deseja verificar");
        letra = teclado.nextLine();
        
        switch (letra) {
            case "a","e","i","o","u":
                System.out.println("A letra digitada e uma vogal!");
                break;
            case "b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","y","z":
                System.out.println("A letra digitada e uma consoante!");
                break;
            default:
                System.out.println("Esta nao e uma letra valida, tente novamente!");
        }
    }
}