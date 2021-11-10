/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora_con_funciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Calculadora_con_funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1,valor2;
        double resultado=0; //operacion 
        int opcion;
        valor1=IntroduceValorPositivo(sc);
        valor2=IntroduceValorPositivo(sc);
        MostrarMenu();
        opcion = validarOpcion();
        
        if(opcion==3)
        {
        resultado=Multiplicacion(valor1,valor2);
        }
        else if(opcion==4)
        {
        resultado=Division(valor1,valor2);
        
        }
        
        
        System.out.println("El resultado de la operación elegida es " + resultado);
    }

    public static int Multiplicacion(int valor1, int valor2) {
         return (int)valor1*valor2;
    }

    public static double Division(int valor1, int valor2) {
        return (double)valor1/valor2;
    }
    
    /**
     * Muestra el menu de la calculadora
     */
    public static void MostrarMenu() {
        System.out.println("1.- Calcular suma");
        System.out.println("2.- Calcular resta");
        System.out.println("3.- Calcular multiplicacion");
        System.out.println("4.- Calcular division");
        
    }
    
    /**
     * Bucle por si introcuce numero incorrecto
     * @return 
     */
    private static int validarOpcion() {
        int opcion;
        Scanner sc=new Scanner(System.in);
        do{
         opcion=sc.nextInt();
         
         if (opcion<1 || opcion>4)
         {
             System.out.println("Opcion incorrecta");
             System.out.println("*****************");
             MostrarMenu();
         }
        System.out.println("Pon opcion");
        }while(opcion<1 || opcion>4);
        //opcion >=1 && opcion<=4
        return opcion;
    }
    
    /**
     *  Para que el numero introducido soo sea positivo
     * @param sc
     * @return 
     */
    private static int IntroduceValorPositivo(Scanner sc) {
       int valor=0;
      
        
        do{
              System.out.println("Introduce un valor positivo.");
           valor=sc.nextInt();
           if(valor<0)
           {
               System.out.println("El numero es negativo.");
           }
           
        }
        while(valor<=0);

        
        return valor;
    }
    
    

    
}
