/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Para introducir un dato por teclado
        Scanner entrada = new Scanner(System.in); 
        
        System.out.println("Cuanto mide el lado de tu cuadrado?"); //Guiamos al cliente a lo que hay que hacer
        
        double lado=entrada.nextDouble(); // Next int es la variable que permitiras poner al cliente
                
        double area= lado*lado; //multiplicara el lado que pondrá el cliente
        
        System.out.println("El lado que ha introducido ha sdo el: "+lado); //Mostramos
        System.out.println("El area de tu cuadrado es: "+area); //Mostramos
               
                
    }
    
}
