/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] notas=new int[4];
        int[] copy_notas=new int [4];
        Scanner ent = new Scanner (System.in);
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println("NOTA");
            notas[i]=ent.nextInt();
        }
        
        //Copiar array
        
        for (int i = 0; i < copy_notas.length; i++) {
            copy_notas[i]=notas[i];
        }
        
        mostrarArray(copy_notas);
        
        
    }

    public static void mostrarArray(int[] copy_notas) {
        for (int i = 0; i < copy_notas.length; i++) {
            System.out.println("posicion "+i+" nota "+copy_notas[i]);
        }
    }
    
}
