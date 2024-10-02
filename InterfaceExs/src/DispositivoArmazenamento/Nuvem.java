/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DispositivoArmazenamento;

/**
 *
 * @author macig
 */
public class Nuvem implements DispositivoArmazenamento{
        private String marca;
    private String dados;

    public Nuvem(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDados() {
        return dados;
    }

    public void setDados(String dados) {
        this.dados = dados;
    }
    
    @Override
    public void armazenarDados(String dados) {
        this.dados = dados;
        System.out.println("Dados guardados");
    }

    @Override
    public void recuperarDados() {
        System.out.println("Dados guardados: "+this.dados);
    }
}
