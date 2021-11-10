/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication30;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class JavaApplication30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num,cont,negativo=0,positivo=0;
       boolean Existenegativo=false;
       Scanner ent=new Scanner(System.in);
       
       do
       {
           System.out.println("Introduce un numero o introduce numero 0 para salir");
        num=ent.nextInt();
           System.out.println("Numero "+num);
           if(num>0)
           {
               positivo++;
           }
           else if (num<0)
           {
               negativo++;
               Existenegativo=true;
           }
           
           
       }while(num!=0);
      
       
        System.out.println("Hay "+positivo+" de numeros positivos");
       System.out.println("Hay "+negativo+" de numeros negativo");
       
       if(negativo>0)
       {
           System.out.println("Existen numeros negativos");
       }
    }
    
}
