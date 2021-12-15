/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej12_array;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej12_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] num=new int[10];
        char opcion;
        Scanner ent=new Scanner(System.in);
        do{
            mostrarMenu();
            opcion=ent.nextLine().charAt(0);
        
                if(opcion=='a'){
                    mostrarValores(num); 
                }
                else if(opcion=='b'){
                    introducirValores(num);
                }
                else if(opcion=='c'){
                    System.out.println("Salir...");
                }
        }while(!(opcion=='c'));
        
    }

    public static void mostrarValores(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.println("posicion "+i+" = "+num[i]);
        }
    }

    public static void mostrarMenu() {
        System.out.println("MENU");
        System.out.println("a-Mostrar menú");
        System.out.println("b-Añadir valor en una posicion");
        System.out.println("c-Salir");
        System.out.println("Elije a,b,c");
    }

    public static void introducirValores(int[] num) {
        int valor,posicion;
        Scanner ent=new Scanner(System.in);
        do{
        System.out.println("Introduzca la posicion");
        posicion=ent.nextInt();
        }while(!(posicion<=10 && posicion>=1));
        System.out.println("introduxca el valor");
        valor = ent.nextInt();
        num[(posicion-1)] = valor;
    }
    
}
