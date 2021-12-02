/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1y2_arrays;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio1y2_Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] num=new int[4];
        int suma=0;
        Scanner ent=new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduzca valor");
            num[i]=ent.nextInt();
        }
        for (int indice1 = 0; indice1 < num.length; indice1++) {
            System.out.println("Posicion "+indice1+" = "+num[indice1]);
        }
        for (int i = 0; i < num.length; i++) {
            suma=suma+num[i];
        }
        System.out.println("suma = "+suma);
    }
    
}
