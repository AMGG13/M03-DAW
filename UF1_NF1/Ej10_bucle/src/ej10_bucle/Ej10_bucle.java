/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej10_bucle;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej10_bucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean hubo10=false;
        double notatotal=0,nota,media;
        int contanotas=0;
        Scanner ent=new Scanner(System.in);
        do
        {
            System.out.println("Introduzca la nota o un -1 para finalizar el programa");
          nota=ent.nextDouble();  
          if (nota==10)
          {
              hubo10=true;
          }
          if(nota!=-1)
          {
              contanotas++;  
              notatotal=notatotal+nota;
            System.out.println(notatotal);
          }
        }while(nota!=-1);
        
        media=notatotal/contanotas;
        System.out.println("Tu media es: "+media);
        System.out.println("Has introducido "+contanotas+" notas");
        
        if(hubo10==true)
        {
            System.out.println("Hubo un 10");
        }
    }
    
}
