/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geralexs;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class GeralEx21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int nAleatorio = (int) (Math.random() * 50) + 1;
            lista.add(nAleatorio);
        }

        System.out.printf("Lista limpa:\n" + lista + "\n");

        for (int i = 0; i < lista.size() - 1; i++) {
            int nMenor = lista.get(i);
            int posicao = i;
            for (int j = i; j < lista.size(); j++) {
                if (lista.get(j) < nMenor) {
                    nMenor = lista.get(j);
                    posicao = j;
                }
            }
            lista.set(posicao, lista.get(i));
            lista.set(i, nMenor);
        }

        System.out.printf("Lista reordenada com selecao:\n" + lista + "\n");
    }
}
