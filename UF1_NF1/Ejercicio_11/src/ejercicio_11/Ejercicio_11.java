/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_11;

import java.util.Scanner;

/**
 *11.	Dibuja el ordinograma de un programa que lee 2 números y muestra el mayor.
 * @author alumne
 */
public class Ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int num1,num2;
        System.out.println("Introduce el primer numero");
        num1=entrada.nextInt();
        
        System.out.println("Introduce el segundo numero");
        num2=entrada.nextInt();
        
        if(num1>num2)
        {
            System.out.println("El numero grande es el: "+num1);
        }
        else if (num1==num2)
        {
            System.out.println("Los numeros son iguales...");
        }
        else
        {
            System.out.println("El numero grande es el: "+num2);
        }
    }
    
}
