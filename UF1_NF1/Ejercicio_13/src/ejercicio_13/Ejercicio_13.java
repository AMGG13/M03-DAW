/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_13;

import java.util.Scanner;

/**
 * 13.	Dibuja un ordinograma de un programa que lee dos números y los visualiza en orden ascendente.
 * @author alumne
 */
public class Ejercicio_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int num1,num2;
        
        System.out.println("Introduzca el primer numero");
        num1=entrada.nextInt();
        
        System.out.println("Introduzca el segundo numero");
        num2=entrada.nextInt();
        
        if (num1<num2)
        {
            System.out.println("El orden es: "+num1+" y "+num2);
        }
        else
                {
                    System.out.println("El orden es: "+num2+" y "+num1);
                }
    }
    
}
