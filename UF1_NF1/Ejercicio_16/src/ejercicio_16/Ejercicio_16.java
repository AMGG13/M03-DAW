/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_16;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       double nota;
       
        System.out.println("Introduzca la nota");
        nota= sc.nextDouble();
        
        if(nota<3 && nota>=0)
        {
            System.out.println("Deficiente");
        }
        else if(nota>=3 && nota<5)
        {
            System.out.println("Insuficiente");
        }
        else if(nota>=5 && nota<6)
        {
            System.out.println("Bien");
        }
        else if(nota>=6 && nota<9)
        {
            System.out.println("Notable");
        }
        else if(nota>=9 && nota<=10)
        {
            System.out.println("Excelente");
        }
        else
        {
            System.out.println("No has introducio un numero del 1-10");
        }
    }
    
}
