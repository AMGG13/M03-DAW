/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputmismatchexception_ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class InputMismatchException_ejercicio1 {

    /**
     * @param args the command line arguments
     */
    static Scanner ent = new Scanner(System.in);
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            
            System.out.print("Introduzca un valor numerico:");
            try{
                int a = ent.nextInt();
            }
        
            catch(InputMismatchException ime){
                System.err.println("Valor introducido incorrecto");
                ime.printStackTrace();
            }
        }
            
        
    }
    
}
