/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3_arrays;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio3_Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] num=new int[4];
        int minimo,maximo;
        Scanner ent=new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduzca valor");
            num[i]=ent.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            minimo=num[i];
            maximo=num[i];
            if(maximo>num[i]){
             System.out.println("maximo : "+num[i]);
            }
            else if(minimo<num[i]){
                System.out.println("minimo : "+num[i]);
            }
                
        }
    }
    
}
