/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej9_array;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej9_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int R;
        int [] num=new int[100];
        inicializarArray(num);
        R=pedirR();
        identificadorR(num,R);
        System.out.println("");
        System.out.println("Array completa");
        mostrarArray(num);
    }

    public static void inicializarArray(int[] num) {
        int r;
        Random rd=new Random();
        for (int i = 0; i < num.length; i++) {
            r=rd.nextInt(10)+1;
            num[i]=r;
        }
    }

    public static void mostrarArray(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.println("posicion "+i+" = "+num[i]);
        }
    }

    public static int pedirR() {
       int r;
       Scanner ent=new Scanner(System.in);
        System.out.println("introduzca un numero del 1 al 10 que quieras identificar");
        r=ent.nextInt();
        return r;
    }

    public static void identificadorR(int[] num, int R) {
        for (int i = 0; i < num.length; i++) {
            if(num[i]==R){
                System.out.println("posicion "+i+" = "+num[i]);
            }
        }
    }
    
}
