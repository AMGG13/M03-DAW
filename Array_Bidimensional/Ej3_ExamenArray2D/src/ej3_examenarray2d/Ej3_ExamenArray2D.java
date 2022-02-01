/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3_examenarray2d;

import java.util.Random;

/**
 *
 * @author alumne
 */
public class Ej3_ExamenArray2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] numeros = new int [10];
        llenarArray(numeros);
        mostrarArray(numeros);
        sustituirNumerosArray(numeros);
        mostrarArray(numeros);      
    }

    private static void llenarArray(int[] numeros) {
        Random r = new Random();
        int numr;
        for (int i = 0; i < numeros.length; i++) {
            numr=r.nextInt(20)+1;
            numeros[i]=numr;
        }
    }

    private static void mostrarArray(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
        }
        System.out.println("");
    }

    private static void sustituirNumerosArray(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]>10){
                numeros[i]=0;
            }
        }
    }
    
}
