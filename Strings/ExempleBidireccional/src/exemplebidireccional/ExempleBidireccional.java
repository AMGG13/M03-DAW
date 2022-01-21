/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplebidireccional;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ExempleBidireccional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int alumnos=3;
       int notas_modulo=4;
       double[][] notas_alumnos = new double [alumnos][notas_modulo];
       introducirNotaArray2D(notas_alumnos);
       introducirNotaAutomatico(notas_alumnos);
       mostrarArray2D(notas_alumnos);
       double suma = calcularSumaValores(notas_alumnos);
        System.out.println(" suma total de notas "+suma);
    }

    private static void introducirNotaArray2D(double[][] notas_alumnos) {
        Scanner ent = new Scanner (System.in);
        for (int alumno = 0; alumno < notas_alumnos.length; alumno++) {
            // alumno = fila
            System.out.println("alumno "+(alumno+1));
                for (int nota = 0; nota < notas_alumnos[0].length; nota++) {
                    //nota = columna
                    System.out.println("pon la nota "+(nota+1));
                    notas_alumnos[alumno][nota]=ent.nextDouble();
                }
        }
    }

    private static void mostrarArray2D(double[][] valores) {
        for (int fila = 0; fila < valores.length; fila++) {
            System.out.println("Alumno "+(fila));
            for (int columna = 0; columna < valores[0].length; columna++) {
                System.out.println("Notas del alumno "+(fila)+" nota "+(columna)+"="+valores[fila][columna]);
                
            }
        }
    }

    private static double calcularSumaValores(double[][] notas_alumnos) {
        double suma=0;
        for (int alumno = 0; alumno < notas_alumnos.length; alumno++) {
                for (int nota = 0; nota < notas_alumnos[0].length; nota++) {
                    suma=suma+notas_alumnos[alumno][nota];
                }
        }
        return suma;
    }

    private static void introducirNotaAutomatico(double[][] notas_alumnos) {
        int acum=1;
        for (int alumno = 0; alumno < notas_alumnos.length; alumno++) {
            System.out.println("alumno "+(alumno+1));
                for (int nota = 0; nota < notas_alumnos[0].length; nota++) {
                    //nota = columna
                    notas_alumnos[alumno][nota]=acum;
                    acum++;
                }
        }
    }
    
}
