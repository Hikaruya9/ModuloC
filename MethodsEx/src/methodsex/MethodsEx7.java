/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodsex;

/**
 *
 * @author Aluno
 */
public class MethodsEx7 {

    public static void intArrayRandom(int[] numeros, int max) { //Cria os valores aleatoriamente dentro do array
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * max) + 1;
        }
    }
    
    public static void arraySort(int[] numeros) { //Reordena os valores do array
        int temp;
        
        for (int i = 0; i < numeros.length; i++) { //Bubble sort
            for (int j = i+1; j < numeros.length; j++) {
                if (numeros[i] > numeros[j]) {
                    temp = numeros[j];
                    numeros[j] = numeros[i];
                    numeros[i] = temp;
                }
            }
        }
    }
    
    public static void intArrayShow(int[] numeros) { //Mostra os valores do array
        for (int numero : numeros) {
            System.out.printf("[ "+numero+" ]");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        int[] numeros = new int[10];
        
        intArrayRandom(numeros,50); //Traz os valores aleatoriamente pra dentro do array
        System.out.println("Array limpo:");
        intArrayShow(numeros); //Mostra o array original
        
        arraySort(numeros); //Ordena os valores do array
        System.out.println("Array ordenado:");
        intArrayShow(numeros); //Mostra o array ordenado
    }
}
