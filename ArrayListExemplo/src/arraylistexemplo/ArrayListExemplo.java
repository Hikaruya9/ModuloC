/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistexemplo;

import java.util.ArrayList;
/**
 *
 * @author Aluno
 */
public class ArrayListExemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Criação do ArrayList de string pra guardar os nomes
        ArrayList<String> listaDeNomes = new ArrayList<>();

        //Adição de nomes
        listaDeNomes.add("Marcos");
        listaDeNomes.add("Rubens");
        listaDeNomes.add("Marcelo");
        listaDeNomes.add("Biloga");
        listaDeNomes.add("Chora");
        
        listaDeNomes.remove(3); //Remove um dos nomes da lista
        
        System.out.println("Tamanho da lista: " + listaDeNomes.size()); //Verifica o tamanho da lista
        
        System.out.println("Existe Marcelo na lista? " + listaDeNomes.contains("Julio")); //Verifica se determinado nome está guardado na lista
        
        System.out.println("Terceiro nome na lista: " + listaDeNomes.get(2)); //Pega um nome em uma posição específica da lista
        
        //Limpando a lista
        listaDeNomes.clear();
        System.out.println("A lista esta vazia!");
        
        System.out.println("A lista esta limpa? " + listaDeNomes.isEmpty()); //verificando se a lista está vazia
        
        for (String nome : listaDeNomes) { //Lista todos os nomes dentro da lista
            System.out.println(nome);
        }
    }
    
}
