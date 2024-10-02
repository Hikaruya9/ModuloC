/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package DispositivoArmazenamento;

/**
 *
 * @author Aluno
 */
public class mainDispositivoArmazenamento {

    public static void main(String[] args) {
        DiscoRigido dr = new DiscoRigido("SabDisk");
        Nuvem n1 = new Nuvem("Amazon");
        PenDrive pd = new PenDrive("SanDisk");
        
        dr.armazenarDados("Era uma vez, em uma terra muito distante...");
        dr.recuperarDados();
        System.out.println("-------------------------------------------");
        n1.armazenarDados("Havia um peregrino viajante e muito sorridente...");
        n1.recuperarDados();
        System.out.println("-------------------------------------------");
        pd.armazenarDados("Mas que um dia ficou muito triste...");
        pd.recuperarDados();
    }
}