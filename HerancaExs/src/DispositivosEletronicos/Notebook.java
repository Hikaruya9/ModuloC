/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DispositivosEletronicos;

/**
 *
 * @author Aluno
 */
public class Notebook extends DispositivoEletronico{
    private String capacidadeArmazenamento;

    public Notebook(String marca, String modelo, String capacidadeArmazenamento) {
        super(marca, modelo);
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public String getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(String capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public void showInfo() {
        System.out.println("Marca: "+getMarca()+"\nModelo: "+getModelo()+"\nCapacidade de armazenamento: "+getCapacidadeArmazenamento());
    }
}