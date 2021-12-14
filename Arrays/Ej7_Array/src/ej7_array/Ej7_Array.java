/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * 
 */
package ej7_array;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej7_Array {

    /**
     * @param args the command line arguments
     * Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga
todos los valores desde P hasta Q, y lo muestre por pantalla.

     */
    public static void main(String[] args) {
        int P,Q,mayor,menor,posiciones=0,valores;
        Scanner ent=new Scanner (System.in);
        System.out.println("Valor P");
        P=ent.nextInt();
        System.out.println("Valor Q");
        Q=ent.nextInt();
        
        if(P>Q){
            mayor=P;
            menor=Q;
        }
        else{
            mayor=Q;
            menor=P;
        }
            valores=menor;
            posiciones=mayor-menor;
        
        int [] num = new int[posiciones];
        
        for (int i = 0; i < num.length; i++) {
           num[i]=valores;
           valores++;   
        }
         for (int i = 0; i < num.length; i++) {
            System.out.println("posicion "+i+" = "+num[i]);
        }
    }
    
}
