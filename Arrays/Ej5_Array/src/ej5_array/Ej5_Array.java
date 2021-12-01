/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5_array;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej5_Array {

    /**
     * Crea un programa que pida veinte números reales por teclado, los almacene en un array y
     * luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] num=new int[4];
        int suma=0,media;
        Scanner ent=new Scanner(System.in);
        
        for (int i = 0; i < num.length; i++) {
            System.out.println("introduce las 4 notas de los examenes, nota "+(i+1));
            num[i]=ent.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            suma=suma+num[i];
        }
        media=suma/num.length;
        System.out.println("La media es "+media);
    }
    
}
