/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6_funciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio6_funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double precioSinIVA,conIVA=0,cont;
       Scanner ent=new Scanner(System.in);
       
        for (cont = 1; cont <=5; cont++) {
            System.out.println("Introduzca el precio sin IVA");
            precioSinIVA=ent.nextDouble();
            
            conIVA=precioConIVA(precioSinIVA,conIVA);
            System.out.println("El precio con IVA aplicado es "+conIVA+" euros");
        }
       
    }

    public static double precioConIVA(double precioSinIVA, double conIVA) {
        conIVA=precioSinIVA*1.21;
        return conIVA;
    }
    
}
