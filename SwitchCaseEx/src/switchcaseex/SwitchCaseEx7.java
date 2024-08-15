/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchcaseex;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author macig
 */
public class SwitchCaseEx7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*ArrayList<String> frutas = new ArrayList<>(Arrays.asList("Framboesa","Figo","Banana","Acerola","Amora"));
        ArrayList<String> verduras = new ArrayList<>(Arrays.asList("Alface","Couve","Espinafre","Espinafre","Couve-flor"));
        ArrayList<String> legumes = new ArrayList<>(Arrays.asList("Arroz","Milho","Beterraba","Mandioca","Tomate"));*/
        
        System.out.println("Digite o alimento que deseja verificar o tipo:");
        String alimento = teclado.nextLine();
        
        switch (alimento) {
            case "Framboesa","Figo","Banana","Acerola","Amora":
                System.out.println("O alimento que voce digitou e uma fruta!");
                break;
            case "Alface","Couve","Espinafre","Couve-flor":
                System.out.println("O alimento que voce digitou e uma verdura!");
                break;
            case "Arroz","Milho","Beterraba","Mandioca","Tomate":
                System.out.println("O alimento que voce digitou e um legume!");
                break;
            default:
                System.out.println("Lamento, ainda nao adicionamos esse alimento a lista. Tente outro!");
        }
    }
}
