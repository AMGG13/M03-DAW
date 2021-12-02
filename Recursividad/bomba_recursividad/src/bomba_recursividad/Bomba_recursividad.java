/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomba_recursividad;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Bomba_recursividad {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
       int contador;
       Scanner ent=new Scanner(System.in);
       
        System.out.println("Introduzca el tiempo deseado en segundos");
        contador=ent.nextInt();
        System.out.println("OPCION 1");
        mostrarContadorBomba1(contador);
        System.out.println("OPCION 2");
        mostrarContadorBomba2(contador);
    }
    /**
     * Mostrará como los segundos introducidos bajan hasta cero y mostrar BOOM
     * @param contador se recoge la variable parametro para restarla de manera recursiva hasta el caso base
     * @throws InterruptedException 
     */
    public static void mostrarContadorBomba1(int contador) throws InterruptedException {
        Thread.sleep(1000);
        if(contador==0){//caso base
            System.out.println("*****BOOOOOOM*****");
        }
        else{
            System.out.println(contador+"...");
            mostrarContadorBomba1(contador-1);
        }
        
    
        
    }
    /**
     * Mostrará como los segundos introducidos bajan hasta llegar al 3, si el tiempo introducido es mayor a 3
     * o hasta el 0, si el tiempo introducido es menor a 3
     * @param contador se recoge la variable contador para restarla de manera recursiva hasta los distintos casos base
     * @throws InterruptedException 
     */
    public static void mostrarContadorBomba2(int contador) throws InterruptedException {
        Thread.sleep(1000);
        
        if(contador<3){//caso base
            if(contador==0){//caso base
                System.out.println("*****BOOOOOOM*****");
            }
            else{
                System.out.println(contador+"...");
                mostrarContadorBomba2(contador-1);
            }
        }
        else if(contador==3){ //caso base
            System.out.println("3...");
            System.out.println("La bomba no ha explotado!");
            
        }
        else{
            System.out.println(contador+"...");
            mostrarContadorBomba2(contador-1);
        }
    }
    
}
