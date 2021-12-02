/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4_recursividad;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej4_recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1,num2;
        Scanner ent=new Scanner(System.in);
        System.out.println("num1");
        num1=ent.nextInt();
        System.out.println("num2");
        num2=ent.nextInt();
        System.out.println(+suma2Num(num1,num2));
        
        
    }
    public static int suma2Num(int num1, int num2){
        
        int calculo;  
        if(num1==num2){
            return num1; 
        }
        else{
           if(num1>num2){
                calculo=num1+suma2Num(num1-1,num2);
                return calculo;  
           } 
           else{
                calculo=num2+suma2Num(num2-1,num1);
                return calculo;  
           }

        }  
    }
    
}
