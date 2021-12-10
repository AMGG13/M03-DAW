/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej8_array;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej8_Array {

    /**
     * @param args the command line arguments
     * Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
utilizando Math.random(), y luego le pida al usuario un valor real R. Por último, mostrará
cuántos valores del array son igual o superiores a R.
     */
    public static void main(String[] args) {
        int R,contador=0;
        int [] num=new int[100];
        inicializarArray(num);
        R=pedirR();
        buscarNumerosSuperiores(num,R,contador);
        mostrarArray(num);
    }
    public static void mostrarArray(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.println("posicion "+i+" = "+num[i]);
        }
    }

    public static void inicializarArray(int[] num) {
    Random rd=new Random();
        int r;
        for (int i = 0; i < num.length; i++) {
            r=rd.nextInt(1000)+1;
            num[i]=r;
    }
    }

    public static void buscarNumerosSuperiores(int[] num, int R, int contador) {
    for (int i = 0; i < num.length; i++) {
            if(num[i]>=R){
                System.out.println(num[i]);
                contador++;
            }
        }
        System.out.println("hay "+contador+" mas grande que "+R);
    }

    private static int pedirR() {
        int R;
        Scanner ent=new Scanner(System.in);
        System.out.println("valor R");
        R=ent.nextInt();
        return R;
    }
    
    
}
