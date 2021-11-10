/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej11_bucle;

/**
 *
 * @author alumne
 */
public class Ej11_bucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int par=0,inpar=0,cont=100;
        
        for (cont=100;cont<=200; cont++)
        {
            //System.out.println("Contador es "+cont);
           if(cont%2==0)
           {
               par=par+cont;
           }
           else
           {
               inpar=inpar+cont;
           }
           
        }
        System.out.println("Suma de inpar es "+inpar);
           System.out.println("Suma de par es "+par);
        
    }
    
}
