/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author macig
 */
public class mainData {

    public static void main(String[] args) {
        Data d1 = new Data(20, 01, 2012);
        
        System.out.println("Dia: "+d1.getDia()+"\nMes: "+d1.getMes()+"\nAno: "+d1.getAno());
        
        System.out.println("Data: "+d1.formatarData());
        
        d1.setDia(10);
        d1.setMes(06);
        d1.setAno(2015);
        
        System.out.println("Data alterada: "+d1.formatarData());
    }
}
