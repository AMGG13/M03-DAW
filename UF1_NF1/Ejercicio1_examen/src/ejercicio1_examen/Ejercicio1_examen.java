/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1_examen;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio1_examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeros_introducidos=0,valor_entre10y20=0,numero,suma=0;
        Scanner ent=new Scanner(System.in);
        
       while(valor_entre10y20!=3)
       {
           System.out.println("Introduzca el numero");
           numero=ent.nextInt();
           numeros_introducidos++;
           if(numero>=10 && numero<=20)
           {
               valor_entre10y20++;
               suma=suma+numero;
               
           }
           
       }
       System.out.println("Has introducido un total de "+numeros_introducidos+" numeros");
       System.out.println("La suma de los 3 numeros entre el 10 y 20 es "+suma);
    }
    
}
