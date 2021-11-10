/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17_funciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio17_Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        boolean primo;
        Scanner ent=new Scanner(System.in);
        do{
        System.out.println("Introduzca el numero");
        num1=ent.nextInt();
        if(num1!=0)
        {
        primo=PrimoNoPrimo(num1);
        if(primo==true)
        {
            System.out.println("Tu numero es primo");
        }
        else
        {
            System.out.println("Tu numero no es primo");
        }
        
        }
        }while(num1!=0);
    }

    /**
     *
     * @param num1
     * @return
     */
    public static boolean PrimoNoPrimo(int num1) {
        
        
        for (int i = 2; i <=num1-1; i++) {
            
            if(num1%i==0)
            {
                return false;
            }
        }
        return true;
    }
    
}
