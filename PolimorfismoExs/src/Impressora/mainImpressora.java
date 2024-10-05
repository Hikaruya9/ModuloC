/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Impressora;

/**
 *
 * @author Aluno
 */
public class mainImpressora {

    public static void main(String[] args) {
        ImpressoraLaser il = new ImpressoraLaser(20);
        ImpressoraJatoTinta jt = new ImpressoraJatoTinta(30);
        
        il.imprimir("Faturamento do mes de Julho da empresa JORGINHO DA RAPADURA");
        System.out.println("---------------------------------------------------------------");
        jt.imprimir("Faturamento do mes de Outubro da empresa BAR DO CLEITIN");
    }
}