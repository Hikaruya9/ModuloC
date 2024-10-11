/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ex10;

/**
 *
 * @author Aluno
 */
public class Ponto {
    public int x;
    public int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void calcularDistancia(Ponto outroPonto) {
        double distancia = Math.sqrt(Math.pow((outroPonto.x-x), 2)+Math.pow((outroPonto.y-y), 2));
        System.out.printf("A distancia entre os pontos A("+x+" e "+y+") e B("+outroPonto.x+" e "+outroPonto.y+") e de: %.2f\n",distancia);
    }
}
