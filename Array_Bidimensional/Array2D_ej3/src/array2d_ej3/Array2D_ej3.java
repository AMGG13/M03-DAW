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
        int valor1,valor2,sumafila;
        
        System.out.println("Introduzca primer valor");
        valor1=ent.nextInt();
        System.out.println("Introduzca segundo valor");
        valor2=ent.nextInt();
        
        int[][] numeros = new int [valor1][valor2];
        llenarArrayConRandom(numeros);
        mostrarMenorMayorIgual(numeros);
        System.out.println("Sime la fila y te sumo solo esa");
        int fila=ent.nextInt()-1;
        sumafila=sumaFilaEspecifica(numeros,fila);
        System.out.println("la fila "+(fila+1)+" suma un total: "+sumafila);
        mostrarArray2D(numeros);
        //sumarTodosValoresPorFila(numeros);
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
                System.out.print("|"+numeros[fila][columna]+"|");
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

    private static void sumarTodosValoresPorFila(int[][] numeros) {
        int suma=0;
        for (int fila = 0; fila < numeros.length; fila++) {
            suma=0;
            for (int columna = 0; columna < numeros[0].length; columna++) {
                suma=suma+numeros[fila][columna];
            }
            System.out.println("suma total fila "+fila+" es "+suma);
        }
    }        

    private static int sumaFilaEspecifica(int[][] numeros, int fila) {
        // como la fila no cambiara solo haremos un for, lo mismo pasaria si piediese solo la columna
        // filas = array.length
        // columnas = array[0].length
        int suma=0;
        for (int columna = 0; columna < numeros[0].length; columna++) {
               suma=suma+numeros[fila][columna]; 
        }
        return suma;
    }

}
    