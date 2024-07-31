/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetoresex;

/**
 *
 * @author TI
 */
public class vetoresEx2 {
    
    public static void main(String[] args) {
        
        int[] numeros = new int[10]; //array para guardar os numeros aleatórios
        int soma = 0; //var para guardar o resultado da soma
        
        for (int i = 0; i < numeros.length; i++) { //Loop para guardar valores aleatorios no array
            numeros[i] = (int) (Math.random() * 100) + 1; //Gera numeros aleatorios no array
        }
        
        for (int numero : numeros) { // Loop para fazer a soma dos numeros do array
            soma += numero; //acrescenta o valor de numero na soma
        }
        
        System.out.println("A soma dos numeros sorteados e de: " + soma); //mostra o resultado da soma na tela
        
    }
    
}
