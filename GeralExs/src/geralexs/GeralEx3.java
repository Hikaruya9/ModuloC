/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geralexs;

/**
 *
 * @author Aluno
 */
public class GeralEx3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Tabuada do "+i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i+" x "+j+" = "+(i*j));
            }
            System.out.println("---------------------------");
        }
    }
}