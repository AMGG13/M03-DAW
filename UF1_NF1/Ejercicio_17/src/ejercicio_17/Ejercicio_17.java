/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_17;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int horas,minutos,segundos;
        System.out.println("Introduzca las horas");
        horas=sc.nextInt();
        System.out.println("Introduzca los minutos");
        minutos=sc.nextInt();
        System.out.println("Introduzca los segundos");
        segundos=sc.nextInt();
        
        
        segundos=segundos+1;
        
        if(segundos==60)
        {
            segundos=0;
            minutos=minutos+1;
            
            
            if (minutos==60)
            {
                minutos=0;
                horas=horas+1;
                
                        if(horas>=24)
                        {
                            horas=0;
                            System.out.println("son las "+horas+" horas "+minutos+" minutos "+segundos+" segundos ");
                        }
                        else
                        {
                            System.out.println("son las "+horas+" horas "+minutos+" minutos "+segundos+" segundos ");
                        }
            }
            else
            {
                System.out.println("son las "+horas+" horas "+minutos+" minutos "+segundos+" segundos ");
            }
        }
        else
        {
            System.out.println("son las "+horas+" horas "+minutos+" minutos "+segundos+" segundos ");
        }
        
        
        
    }
    
}
