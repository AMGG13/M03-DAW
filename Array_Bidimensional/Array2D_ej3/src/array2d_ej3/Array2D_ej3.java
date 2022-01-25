/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array2d_ej3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Array2D_ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ent=new Scanner(System.in);
        int valor1,valor2;
        
        System.out.println("Introduzca primer valor");
        valor1=ent.nextInt();
        System.out.println("Introduzca segundo valor");
        valor2=ent.nextInt();
        
        int[][] numeros = new int [valor1][valor2];
        llenarArrayConRandom(numeros);
        mostrarMenorMayorIgual(numeros);
        mostrarArray2D(numeros);
    }

    private static void llenarArrayConRandom(int[][] numeros) {
        Random rand= new Random();
        int r;
        for (int fila = 0; fila < numeros.length; fila++) {
            for (int columna = 0; columna < numeros[0].length; columna++) {
                r=rand.nextInt(11)-5;
                numeros[fila][columna]=r;
            }
        }
    }

    private static void mostrarArray2D(int[][] numeros) {
        for (int fila = 0; fila < numeros.length; fila++) {
            for (int columna = 0; columna < numeros[0].length; columna++) {
                System.out.print(numeros[fila][columna]+" ");
            }
            System.out.println("");
        }
    }

    private static void mostrarMenorMayorIgual(int[][] numeros) {
        int acummenor=0,acummayor=0,acumigual=0;
         for (int fila = 0; fila < numeros.length; fila++) {
            for (int columna = 0; columna < numeros[0].length; columna++) {
                if(numeros[fila][columna]<0){
                    acummenor++;
                }
                else if(numeros[fila][columna]>0){
                    acummayor++;
                }
                else {
                    acumigual++;
                }
            }
        }
         System.out.println("Hay "+acummenor+" menor que cero");
         System.out.println("Hay "+acummayor+" mayor que cero");
         System.out.println("Hay "+acumigual+" igual que cero");
    }
    }