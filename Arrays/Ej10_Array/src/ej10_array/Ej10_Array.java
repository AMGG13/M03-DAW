/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej10_array;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej10_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int conts,alumnos;
        double media,mayor,menor,altura;
        Scanner sc=new Scanner(System.in);
        System.out.println("Cuantos alumnos tienes?");
        alumnos=sc.nextInt();
        double [] num=new double[alumnos];
        
        for (int i = 0; i < num.length; i++) {
            System.out.println("Alumno "+(i+1));
            altura=sc.nextDouble();
            num[i]=altura;
        }
        
        media=recorrerArrayEncontrarMedia(num);
        System.out.println("LA MEDIA ES: "+media);
        
        mayor=recorrerArrayEncontrarMayor(num);
        System.out.println("EL MAYOR ES "+mayor);
        
        menor=recorrerArrayEncontrarMenor(num);
        System.out.println("EL MENOR ES "+menor);
        
        conts=recorrerArrayEncontrarSuperiorMedia(num,media);
        System.out.println("HAY "+conts+" ALTURAS SUPERIORES A LA MEDIA");
        mostrarSuperiorMedia(num,media);
        
        System.out.println("ARRAY COMPLETA");
        mostrarArray(num);
        
    }

    public static double recorrerArrayEncontrarMedia(double[] num) {
        double media,suma=0;
        for (int i = 0; i < num.length; i++) {
            suma=suma+num[i];
        }
        media=(double)suma/num.length;
        return media;
    }

    public static double recorrerArrayEncontrarMayor(double[] num) {
        double mayor=num[0];
        for (int i = 0; i < num.length; i++) {
            if(num[i]>mayor){
                mayor=num[i];
            }
        }
        return mayor;
    }

    public static double recorrerArrayEncontrarMenor(double[] num) {
        double menor=num[0];
        for (int i = 0; i < num.length; i++) {
            if(num[i]<menor){
                menor=num[i];
            }
        }
        return menor;
        
    }

    public static int recorrerArrayEncontrarSuperiorMedia(double[] num, double media) {
        int cont=0;
        for (int i = 0; i < num.length; i++) {
            if(num[i]>=media){
                cont++;
            }
        }
        return cont;
        }

    public static void mostrarArray(double[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.println("posicion "+i+" = "+num[i]);
        }
    }

    public static void mostrarSuperiorMedia(double[] num, double media) {
        for (int i = 0; i < num.length; i++) {
            if(num[i]>=media){
                System.out.println("posicion "+i+" es "+num[i]);
            }
        }
    }
    
}
