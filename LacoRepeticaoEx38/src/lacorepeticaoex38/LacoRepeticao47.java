/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lacorepeticaoex38;

/**
 *
 * @author TI
 */
public class LacoRepeticao47 {
    
    public static void main(String[] args) {
        
        int soma = 0;
        
        for(int i = 500; i >= 0; i -= 50) {
            
            soma += i;
            
            if(i == 0) {
                
                System.out.println("Resultado da soma: " + soma);
                
            }
            
        }
        
    }
    
}
