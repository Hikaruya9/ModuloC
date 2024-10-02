/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package SistemaReservasHotel;

/**
 *
 * @author Aluno
 */
public class mainSistemReservaHotel {

    public static void main(String[] args) {
        QuartoLuxo ql = new QuartoLuxo("Soleiro", 4285.90, true);
        QuartoStandard qs = new QuartoStandard("Casal", 2290.30, false);
        Suite s = new Suite("Casal", 7540.75, true);
        
        System.out.printf("Preco diario da estadia: R$%.2f\n", ql.obterPrecoDiaria());
        System.out.println("Tipo de quarto: "+ql.obterTipo());
        ql.reservar();
        System.out.println("-------------------------------------------------------");
        System.out.printf("Preco diario da estadia: R$%.2f\n", qs.obterPrecoDiaria());
        System.out.println("Tipo de quarto: "+qs.obterTipo());
        qs.reservar();
        System.out.println("-------------------------------------------------------");
        System.out.printf("Preco diario da estadia: R$%.2f\n", ql.obterPrecoDiaria());
        System.out.println("Tipo de quarto: "+qs.obterTipo());
        s.reservar();
    }
}