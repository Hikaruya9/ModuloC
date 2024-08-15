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
 * @author Aluno
 */
public class SwitchCaseEx3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> estacoesAno = new ArrayList<>(Arrays.asList("Verao","Outono","Inverno","Primavera"));
        
        System.out.println("Digite o mes:");
        int mes = teclado.nextInt();
        
        switch (mes) {
            case 12,1,2:
                System.out.println("Estamos no " + estacoesAno.get(0));
                break;
            case 3,4,5:
                System.out.println("Estamos no " + estacoesAno.get(1));
                break;
            case 6,7,8:
                System.out.println("Estamos no " + estacoesAno.get(2));
                break;
            case 9,10,11:
                System.out.println("Estamos na " + estacoesAno.get(3));
                break;
            default:
                System.out.println("Este nao e um mes valido!");
        }
    }
    
}
