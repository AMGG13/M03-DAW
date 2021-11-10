/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_6;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double chollo,precio_real,diferencia,descuento;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduzca el precio real");
        precio_real=entrada.nextDouble();
        System.out.println("Ahora introduzca el precio descontado");
        chollo=entrada.nextDouble();
        
        diferencia=precio_real-chollo;
        System.out.println("Esta es la diferencia de precio entre ellos: "+diferencia);
        
        descuento=(diferencia*100)/precio_real;
        System.out.println("Este es el descuento aplicado: "+descuento);
        
        System.out.println("Gracias por su compra en esta tienda c:");
        
        
    }
    
}
