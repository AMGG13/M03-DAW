/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej11_array;

import java.util.Random;

/**
 *
 * @author alumne
 */
public class Ej11_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] num1=new int[5];
        int [] num2=new int[5];
        Random r=new Random();
        llenarArray1(num1);
        mostrarArray(num1);
        System.out.println("------------------------");
        llenarArrayInvertido(num1,num2);
        mostrarArray(num2);
    }

    public static void llenarArray1(int[] num1) {
        int rd;
        Random r=new Random();
        for (int i = 0; i < num1.length; i++) {
            rd=r.nextInt(10)+1;
            num1[i]=rd;
        }
 
    }

    public static void llenarArrayInvertido(int[] num1, int[] num2) {
        for (int i = 0; i < num2.length; i++) {
            num2[num2.length-1-i]=num1[i];
        }
    }

    public static void mostrarArray(int[] num1) {
        for (int i = 0; i < num1.length; i++) {
            System.out.println("posicion "+i+" = "+num1[i]);
        }
    }
    
}
