/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array2d_ej2;

/**
 *
 * @author alumne
 */
public class Array2D_ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] tablas = new int [10][10];
        
        rellenarTablas(tablas);
        mostrarTablas(tablas);
    }

    private static void rellenarTablas(int[][] tablas) {
        int num=1,num2=1;
        
        for (int columna = 0; columna < tablas[0].length; columna++) {
            num2=1;
            for (int fila = 0; fila < tablas.length; fila++) {
                tablas[fila][columna]=num*num2;
              num2++;
            }
            num++;
        }
    }

    private static void mostrarTablas(int[][] tablas) {
        for (int fila = 0; fila < tablas.length; fila++) {
            for (int columna = 0; columna < tablas[0].length; columna++) {
                System.out.print(tablas[fila][columna]+" ");
            }
            System.out.println("");
        }
    }
    
}
