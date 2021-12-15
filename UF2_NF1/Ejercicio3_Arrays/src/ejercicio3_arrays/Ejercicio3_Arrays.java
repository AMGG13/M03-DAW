/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_arrays;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio3_Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int []num=new int[4];
     int mayor,menor;
     Scanner ent=new Scanner (System.in);
     
        for (int i = 0; i < num.length; i++) {
            System.out.print("ingrese numero "+(i+1)+": ");
            num[i]=ent.nextInt();
        }
     
        mayor=menor=num[0];
        
        for (int i = 0; i < num.length; i++) {
            if(num[i]>mayor){
                mayor=num[i];
            }
            else if(num[i]<menor){
                menor=num[i];
            }
        }
        System.out.println("El numero mas grande registrado en el array es el "+mayor);
        System.out.println("El numero mas pequeño registrado en el array es el "+menor);
    }
    
}
