/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle_4;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Bucle_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numerofin,contador;
       Scanner entrada=new Scanner(System.in);
        System.out.println("Introduzca el numero limite del contador");
        numerofin=entrada.nextInt();
        for (contador = 1;  contador<=numerofin; contador++) {
            System.out.println("Numero "+contador);
            
        }
        System.out.println("FIN");
        
    }
    
}
