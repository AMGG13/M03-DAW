/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication74;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class JavaApplication74 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] notas =new int[30];
//        notas[0]=6;
//        notas[1]=8;
//        notas[2]=9;
//        notas[3]=4;
//        notas[4]=6;
//        notas[5]=6;
//        notas[6]=7;5
//INICIALIZACION

//        for (int i = 0; i < notas.length; i++) {
//            System.out.println("posicion "+i+" = "+notas[i]);
//        }

//        Scanner ent=new Scanner(System.in);
//        for (int indice2 = 0; indice2 < notas.length; indice2++) {
//            System.out.println("Pon la nota para le alumno "+(indice2+1));
//            notas[indice2]=ent.nextInt();
//        }
        //notas.length devuelve el numero de ceros que puede guardar
        //desde el cero hasta length -1
//        for (int i = 0; i < notas.length; i++) {
//            System.out.println("posicion "+i+" = "+notas[i]);
//        }
        
        Random r=new Random();
        for (int indice = 0; indice < notas.length; indice++) {
            
            notas[indice]=r.nextInt(10)+1;
            
        }
        for (int i = 0; i < notas.length; i++) {
            System.out.println("posicion "+i+" = "+notas[i]);
        }Scanner ent=new Scanner(System.in);
//        for (int indice2 = 0; indice2 < notas.length; indice2++) {
//            System.out.println("Pon la nota para le alumno "+(indice2+1));
//            notas[indice2]=ent.nextInt();
//        }
        
    }
    
}
