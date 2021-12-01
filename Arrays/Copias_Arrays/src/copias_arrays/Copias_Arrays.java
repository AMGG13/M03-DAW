/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package copias_arrays;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Copias_Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] notas=new int[4];
        int[] notas_finales=new int[4];
        int[] notas_finales_system=new int[4];
        Random r=new Random();
        Scanner ent=new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            notas[i]=r.nextInt(11);
        }
        for (int i = 0; i < notas.length; i++) {
            System.out.println("posicion "+i+" = "+notas[i]);
        }
        System.out.println("---------------");
        for (int i = 0; i < notas.length; i++) {
            notas_finales[i]=notas[i]+2;
        }
        for (int i = 0; i < notas_finales.length; i++) {
            System.out.println("posicion "+i+" = "+notas_finales[i]);
        }
        System.arraycopy(notas, 0, notas_finales_system, 0, 4);
    }
    
}
