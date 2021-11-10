/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_12;

import java.util.Scanner;

/**
 *
 * 12.	Dibuja el ordinograma de un programa que lee un número y me dice si es positivo o negativo
 * , consideraremos el cero como positivo.
 * @author alumne
 */
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int num;
        
        System.out.println("Introduzca el numero");
        num=entrada.nextInt();
        
        if(num>=0)
        {
            System.out.println("Tu numero es positivo");
        }
        else
        {
            System.out.println("tu numero es negativo");
        }
    }
    
}
