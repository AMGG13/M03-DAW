/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_9;

import java.util.Scanner;

/**
 * 9.	Dibuja un ordinograma de un programa que pide la edad por teclado y nos muestra 
 * el mensaje de “eres mayor de edad” o el mensaje de “eres menor de edad”.
 * @author alumne
 */
public class Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int edad;
        System.out.println("Por favor introduzca su edad");
        edad=entrada.nextInt();
        
        if (edad>=18)
        {
            System.out.println("Eres mayor de edad");
        }
        else
        {
            System.out.println("No eres mayor de edad");
        }
        
        
        
        
    }
    
}
