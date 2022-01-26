/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array2d_ej5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Array2D_ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
        Random r = new Random();
        int genero=-1,sueldo=0,trabajadores;
        System.out.println("Cuantos trabajador hay en la empresa");
        trabajadores=ent.nextInt();
        int[][] salarios= new int [trabajadores][2];
        introducirDatos(salarios,r,genero,sueldo);
        mostrarArray2D(salarios);
        double diferencia=sueldoMedio(salarios);
        System.out.println("diferencia es  "+diferencia);
        
    }

    private static void introducirDatos(int[][] salarios, Random r, int genero, int sueldo) {
        for (int columna = 0; columna < salarios[0].length; columna++) {
            for (int filas = 0; filas < salarios.length; filas++) {
                if(columna==0){
                genero=r.nextInt(2);
                salarios[filas][columna]=genero;
                }
                else if(columna==1){
                sueldo=r.nextInt(5000)+5000;
                salarios[filas][columna]=sueldo;                    
                }
            }
        }
    }

    private static void mostrarArray2D(int[][] salarios) {
        for (int fila = 0; fila < salarios.length; fila++) {
            for (int columna = 0; columna < salarios[0].length; columna++) {
                System.out.print("|"+salarios[fila][columna]+"|");
            }
            System.out.println("");
        }        
    }

    private static double sueldoMedio(int[][] salarios) {
        int cont_hombre=0,cont_mujer=0,suma_hombre=0,suma_mujer=0,media_hombre=0,media_mujer=0;
        
         for (int columna = 0; columna < salarios[0].length; columna++) {
            for (int filas = 0; filas < salarios.length; filas++) {
                if(salarios[filas][0]==0){
                    cont_hombre++;
                    suma_hombre+=salarios[filas][1];
                }
                else if(salarios[filas][0]==1){
                    cont_mujer++;
                    suma_mujer+=salarios[filas][1];
                }
            }
        }
         media_hombre=suma_hombre/cont_hombre;
         media_mujer=suma_mujer/cont_mujer;
         System.out.println("la media del hombre es "+media_hombre);
         System.out.println("la media de la mujer es "+media_mujer);
         return media_mujer-media_hombre;
         
    }
    
}
