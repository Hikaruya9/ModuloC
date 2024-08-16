/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodsex;

/**
 *
 * @author Aluno
 */
public class MethodsEx10 {

    public static void intArrayRandom(int[] numeros,int max) { //Cria valores aleatórios pro array
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * max) + 1;
        }
    }
    
    public static int maiorValorArray(int[] numeros) { //Verifica qual o maior valor do array
        int maiorNumero = 0;
        for(int numero : numeros) {
            if(numero > maiorNumero) {
                maiorNumero = numero;
            }
        }
        return maiorNumero;
    }
    
    public static void intArrayShow(int[] numeros) { //Mostra os valores do array
        for (int numero : numeros) {
            System.out.printf("[ "+numero+" ]");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] numeros = new int[10];
        
        intArrayRandom(numeros,100); //gera os numeros pro array
        System.out.println("Valores do array:");
        intArrayShow(numeros); //Mostra o array completo
        System.out.println(maiorValorArray(numeros)); //Imprime o maior numero do array
    }
}
