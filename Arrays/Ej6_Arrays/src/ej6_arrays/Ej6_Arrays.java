/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6_arrays;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej6_Arrays {

    /**
     * Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño N,
     *escriba M en todas sus posiciones y lo muestre por pantalla.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int posiciones,numeros;
        Scanner ent=new Scanner(System.in);
        
        System.out.println("introduzca cuantas posiciones quieres en tu array?");
        posiciones=ent.nextInt();
        int [] num = new int[posiciones];
        
        
        System.out.println("introduce el numero con que quieres rellenar las posiciones");
            numeros=ent.nextInt();
        
        for (int i = 0; i < num.length; i++) {
            num[i]=numeros;
        }
        mostrarArray(num);
        
    }

    public static void mostrarArray(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.println("posicion "+i+" = "+num[i]);
        }
    }
    
}
