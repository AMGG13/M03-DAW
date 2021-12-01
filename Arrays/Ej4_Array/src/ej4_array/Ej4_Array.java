/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4_array;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej4_Array {

    /**Crea un programa que pida veinte números enteros por teclado, los almacene en un array y
     *  luego muestre por separado la suma de todos los valores positivos y negativos.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] num=new int[6];
        int suman=0,sumap=0;
        Scanner ent=new Scanner(System.in);
        
        for (int i = 0; i < num.length; i++) {
            System.out.println("introduce hasta 6 numero positivo o negativo, numero "+(i+1));
            num[i]=ent.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            if(num[i]<0)
            {
                suman=suman+num[i];
                System.out.println("negativo "+num[i]);
            }
            else if(num[i]>0){
                sumap=sumap+num[i];
                System.out.println("positivo "+num[i]);
            }
        }
        System.out.println("la suma de todos los negativos es "+suman);
        System.out.println("la suma de todos los positivos es "+sumap);
        
    }
    
}
