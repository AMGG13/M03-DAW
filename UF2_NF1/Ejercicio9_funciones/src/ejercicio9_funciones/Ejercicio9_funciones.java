/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9_funciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio9_funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor1,valor2,valor3,masgrande;
        Scanner ent=new Scanner(System.in);
        System.out.println("Introduce el primer valor");
        valor1=ent.nextInt();
        System.out.println("Introduce el segundo valor");
        valor2=ent.nextInt();
        System.out.println("Introduce el tercer valor");
        valor3=ent.nextInt();
        masgrande=NumGrande(valor1,valor2);
        masgrande=NumGrande(valor3,masgrande);
        System.out.println("El valor mas grande es "+masgrande);
        
        
    }

    public static int NumGrande(int valor1, int valor2) {
        if(valor1>=valor2)
        {
          return valor1;  
        }
        else
        {
          return valor2;   
        }
    }
    
}
