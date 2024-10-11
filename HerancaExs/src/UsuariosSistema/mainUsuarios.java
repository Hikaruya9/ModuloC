/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UsuariosSistema;

/**
 *
 * @author Aluno
 */
public class mainUsuarios {

    public static void main(String[] args) {
        Administrador adm = new Administrador("Jorge", "Jorg@01982", "CT");
        Editor editor = new Editor("Cleber", "19Cl3binh095", "Apenas sob revisao de um adm");
        Leitor reader = new Leitor("Joao", "E0sGuri", "Faturamento-junho 24-08-2024, Planilha-negocios fechado de Setembro 02-10-2023");
        
        adm.showInfo();
        System.out.println("----------------------------------------------------");
        editor.showInfo();
        System.out.println("----------------------------------------------------");
        reader.showInfo();
    }
}