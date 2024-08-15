/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchcaseex;

import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class SwitchCaseEx6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade;
        String voto;
        
        System.out.println("Digite sua idade");
        idade = teclado.nextInt();
        
        
        if(idade < 16) {
            voto = "nao vota";
        } else if (idade >= 16 && idade < 18){
            voto = "opcional";
        } else {
            voto = "obrigatorio";
        }
        
        switch (voto) {
            case "nao vota":
                System.out.println("Voce ainda nao pode votar!");
                break;
            case "opcional":
                System.out.println("Voce tem a opcao de poder votar!");
                break;
            case "obrigatorio":
                System.out.println("Voce PRECISA votar!");
                break;
            default:
                System.out.println("Esta nao e uma opcao valida!");
        }
    }
    
}
