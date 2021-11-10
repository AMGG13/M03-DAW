/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej13_bucle;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej13_bucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numadivina,minimo=1,maximo=100;
        System.out.println("Este programa adivina tu numero del 1 al 100");
       
       char respuesta='o';
       Scanner ent=new Scanner(System.in);
        
        
        numadivina=(minimo+maximo)/2;
       
        do
        {
            numadivina=(minimo+maximo)/2;
            System.out.println("Tu numero es mayor(m) igual(i) o inferior(f) a "+numadivina+"?");
            respuesta=ent.nextLine().charAt(0);
            
            if(respuesta=='m' || respuesta=='M')
            {
                System.out.println("Tu numero es mayor(m) igual(i) o inferior(f) a "+numadivina+"?");
              minimo=numadivina; 
                System.out.println("tu numero esta entre el "+minimo+" al "+maximo);
            }
            else if(respuesta=='f' || respuesta=='F')
            {
                System.out.println("Tu numero es mayor(m) igual(i) o inferior(f) a m"+numadivina+"?");
                maximo=numadivina;
                 System.out.println("tu numero esta entre el "+minimo+" al "+maximo);
           
            }
            
        }while(respuesta!='i');
        System.out.println("Tu numero es el "+numadivina);
        
    }
    
}
