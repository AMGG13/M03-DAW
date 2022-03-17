/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception_ej5;

import java.util.Scanner;

/**
 *
 *◦ void imprimePositivo(int p): Imprime el valor p. Lanza una ‘Exception’ si p menor 0
 * 
 *◦ void imprimeNegativo(int n): Imprime el valor n. Lanza una ‘Exception’ si p mayor= 0
 * 
 *◦ La función main para realizar pruebas. Puedes llamar a ambas funciones varias veces con
 distintos valores, hacer un bucle para pedir valores por teclado y pasarlos a las
 funciones, etc. Maneja las posibles excepciones
 */
public class Exception_ej5 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    static Scanner ent = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int p = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduza un numero:");
            p=ent.nextInt();
            imprimePositivo(p);
            imprimeNegativo(p);
        }
        
        
    }

    private static void imprimePositivo(int p) throws Exception {
        if(p<0){
            throw new Exception("Numero negativo no permitido");
        }
        else{
            System.out.println(p);
        }
    }

    private static void imprimeNegativo(int p) throws Exception{
        if(p>=0){
            throw new Exception("Numero positivo no permitido");
        }
        else{
            System.out.println(p);
        }
    }
    
}
