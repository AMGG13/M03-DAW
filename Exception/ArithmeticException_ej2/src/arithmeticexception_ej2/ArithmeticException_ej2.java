/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmeticexception_ej2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ArithmeticException_ej2 {

    /**
     * @param args the command line arguments
     */
    static Scanner ent = new Scanner(System.in);
    public static void main(String[] args) {
        try{
            System.out.print("Introduzca primer valor numerico:");
            int a = ent.nextInt();
            System.out.print("Introduzca segundo valor numerico:");
            int b = ent.nextInt();
            int c = a/b;
            System.out.print("Resultado:"+c);
        }
        catch(ArithmeticException ae){
            System.err.println("Valor no se pude dividir entre 0");
            ae.printStackTrace();
        }
        catch(InputMismatchException ime){
            System.err.println("Valor introducido incorrecto");
            ime.printStackTrace();
        }
    }
    
}
