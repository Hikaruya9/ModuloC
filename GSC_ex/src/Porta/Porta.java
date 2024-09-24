/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Porta;

/**
 *
 * @author macig
 */
public class Porta {
    private boolean aberta;
    private String cor;

    public Porta(boolean aberta, String cor) {
        this.aberta = aberta;
        this.cor = cor;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public void abrir() {
        if (this.aberta == false) {
            this.aberta = true;
            System.out.println("A porta abriu-se!");
        } else {
            System.out.println("A porta ja esta aberta");
        }
    }
    
    public void fechar() {
        if (this.aberta == true) {
            this.aberta = false;
            System.out.println("A porta fechou-se!");
        } else {
            System.out.println("A porta ja esta fechada");
        }
    }
    
}
