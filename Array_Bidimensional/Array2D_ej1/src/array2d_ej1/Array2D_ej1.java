/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array2d_ej1;

/**
 *
 * @author alumne
 */
public class Array2D_ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] matriz1 = new int [5][5];
        int [][] matriz2 = new int [5][5];
        
        del1Al25Fila(matriz1);
        del1Al25Columna(matriz2);
        System.out.println("");
        mostrarArray2D(matriz1);
        System.out.println("");
        mostrarArray2D(matriz2);
        
        
    }

    private static void del1Al25Fila(int[][] matriz1) {
        int acum=1;
        for (int fila = 0; fila < matriz1.length; fila++) {
                for (int columna = 0; columna < matriz1[fila].length; columna++) {
                    //nota = columna
                    matriz1[fila][columna]=acum;
                    acum++;
                }
        }
    }

    private static void del1Al25Columna(int[][] matriz2) {
                int acum=1;
        for (int columna = 0; columna < matriz2[0].length; columna++) {
                for (int fila = 0; fila < matriz2.length; fila++) {
                    matriz2[fila][columna]=acum;
                    acum++;
                }
        }
    }

    private static void mostrarArray2D(int[][] matriz2) {
        for (int fila = 0; fila < matriz2.length; fila++) {
                for (int columna = 0; columna < matriz2[0].length; columna++) {
                    System.out.print(matriz2[fila][columna]+" ");
            }
                System.out.println("");
        }
    }
    
}
