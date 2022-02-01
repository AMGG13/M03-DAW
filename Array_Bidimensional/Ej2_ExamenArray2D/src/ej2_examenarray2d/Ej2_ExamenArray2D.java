/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2_examenarray2d;

import java.util.Random;

/**
 *
 * @author alumne
 */
public class Ej2_ExamenArray2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] tabla= new int [5][6];
        rellenarArray(tabla);
        mostrarArray(tabla);
        sumaArray(tabla);
        mostrarArray(tabla);
    }

    private static void rellenarArray(int[][] tabla) {
        Random r=new Random();
        int numr;
        for (int fila = 0; fila < tabla.length; fila++) {
            for (int columna = 0; columna < tabla[0].length; columna++) {
                numr=r.nextInt(100)+1;
                tabla[fila][columna]=numr;
                if(tabla[fila][5]!=0){
                    tabla[fila][columna]=0;
                }
            }
        }
    }

    private static void mostrarArray(int[][] tabla) {
        for (int fila = 0; fila < tabla.length; fila++) {
            for (int columna = 0; columna < tabla[0].length; columna++) {
                System.out.print(tabla[fila][columna]+" ");
            }
            System.out.println("");
        }    }

    private static void sumaArray(int[][] tabla) {
        int suma;
        for (int fila = 0; fila < tabla.length; fila++) {
            suma=0;
            for (int columna = 0; columna < tabla[0].length; columna++) {
               suma+=tabla[fila][columna];
            }
            tabla[fila][5]=suma;
        }        
    }
    
}
