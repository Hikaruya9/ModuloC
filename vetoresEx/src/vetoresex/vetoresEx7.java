/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetoresex;

/**
 *
 * @author TI
 */
public class vetoresEx7 {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        //int[] numeros = {10, 10, 20, 20, 30, 30};

        System.out.println("Lista de numeros: ");
        for (int i = 0; i < numeros.length; i++) { //loop para gerar os números aleatórios e mostrar na tela
            numeros[i] = (int) (Math.random() * 100) + 1;
            System.out.printf(numeros[i] + " ");
        }

        System.out.printf("\nLista sem duplicatas: \n");
        for (int i = 0; i < numeros.length; i++) { //loop para verificar duplicatas
            int tmp = 0; //var temporária pra ser somada caso haja valores duplicados
            for (int j = i; j < numeros.length - 1; j++) { //loop para percorrer todos os valores armazenados do array
                if (numeros[i] == numeros[j + 1]) { //testa se um número é igual a cada um dos outros valores conseguintes
                    tmp++;
                    break;
                }
            }
            if (tmp == 0) { //teste para mostrar na tela os que não são duplicatas
                System.out.printf(numeros[i] + " ");
            }
        }
        System.out.println("");
    }
}
