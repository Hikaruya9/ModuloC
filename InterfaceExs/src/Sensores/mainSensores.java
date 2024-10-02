/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Sensores;

/**
 *
 * @author Aluno
 */
public class mainSensores {

    public static void main(String[] args) {
        SensorUmidade su = new SensorUmidade(70);
        SensorTemperatura st = new SensorTemperatura(20);
        SensorLuminosidade sl = new SensorLuminosidade(140);
        
        su.lerValor();
        st.lerValor();
        sl.lerValor();
    }
}