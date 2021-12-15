/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_recursividad;

import static ejercicio3_recursividad.Ejercicio3_recursividad.factorial;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio3_recursividad {

   /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        int valor,factor;
        valor=pedirValor();
        factor=factorial(valor);
                System.out.println("la suma en total es: "+factor);
    }
    
    public static int pedirValor(){
        int valor;
        Scanner ent=new Scanner(System.in);
        System.out.println("introduzca un valor que no sea impar");
        valor=ent.nextInt();
        if(valor%2==1)
        {
            valor=-1;
            return valor;
        }
        else{
            return valor;
        }
    }
    public static int factorial(int valor) throws InterruptedException
    {
       int calculo;
        if (valor==0) //caso base
        {

            return 0;
        }
        else if (valor==1) //caso base
        {

            return 0;
        }
        else if (valor<0) // caso incorrecto
        {
            return -1;
        }
        else //caso recursivo valor >1
        {//solo tengo las variables que me llegan de entrada a la función o sea valor

         calculo=valor+factorial(valor-2) ;
            System.out.println("valor es: "+valor+", calculo es: "+calculo);
          return  calculo; 
          

        }
        
    }
    
    
}

