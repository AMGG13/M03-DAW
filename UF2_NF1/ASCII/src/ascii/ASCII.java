/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ascii;

/**
 *
 * @author alumne
 */
public class ASCII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char letra='a';
        
      
        
        for (letra = 'a'; letra <='z'; letra++) {
            int codigoasci=(int) letra;
            System.out.println(letra+" - "+codigoasci);
        }
    }
    
}
