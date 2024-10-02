/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author macig
 */
public class Soma implements OperacaoMatematica {

    @Override
    public void calcular(double a, double b) {
        double resultado = a+b;
        System.out.println("O resultado da soma e: "+resultado);
    }
    
}
