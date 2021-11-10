/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba_2;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Prueba_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduzca el numero");
        num=entrada.nextInt();
        
        if(num%2==0)
        {
            if(num%3==0)
            {
                System.out.println("Tu numero es par y tambien es divisible entre 3!");
            }
            else
            {
                System.out.println("Tu numero es par, pero no es divisible entre 3.");
            }
        }
        else
        {
            System.out.println("Tu numero es impar");
        }
        System.out.println("Fin del programa");
        
    }
    
}
