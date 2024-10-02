/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Ordenacao;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Aluno
 */
public class mainOrdenacao {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(9);
        numeros.add(6);
        numeros.add(4);
        
        OrdenacaoCrescente oc1 = new OrdenacaoCrescente(numeros);
        OrdenacaoDecrescente od1 = new OrdenacaoDecrescente(numeros);
        
        oc1.ordernar(numeros);
        od1.ordernar(numeros);
    }
}