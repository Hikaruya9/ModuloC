/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenacao;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author macig
 */
public class OrdenacaoCrescente implements Ordenacao {

    private List<Integer> sequencia = new ArrayList<>();

    public OrdenacaoCrescente(List<Integer> sequencia) {
        this.sequencia = sequencia;
    }

    public List<Integer> getSequencia() {
        return sequencia;
    }

    public void setSequencia(List<Integer> sequencia) {
        this.sequencia = sequencia;
    }

    @Override
    public void ordernar(List lista) {
        Collections.sort(sequencia);
        for (int i = 0; i < lista.size(); i++) {
            System.out.printf("[" + lista.get(i) + "]");
        }
        System.out.println("");
    }
}
