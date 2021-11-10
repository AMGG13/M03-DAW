/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13_funciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio13_Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {     
    int plantas;
    char letra;
    Scanner ent=new Scanner(System.in);      
    System.out.println("¿Cuántos pisos?");
       
    plantas = ent.nextInt();
    ent.nextLine();
        System.out.println("Que letra quieres poner?");
        letra = ent.nextLine().charAt(0);

    for ( int i=0; i <= plantas; i++) {

            for (int j = 1; j <= plantas - i; j++) {

                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {

                System.out.print(letra);
            }
        System.out.println("");
        Thread.sleep(500);
        }
    

    }
    
}
