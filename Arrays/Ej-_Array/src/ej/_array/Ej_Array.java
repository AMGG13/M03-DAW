/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej._array;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int premio,dinero=0,posicion,dinero_acum=0;
        boolean seguir=false;
        Scanner ent=new Scanner(System.in);
        Random r=new Random();
        
        do{
            int [] cartas = new  int[4];
            llenarArrayConMonedas(cartas,dinero);
            posicion=pedirCartaUsuario();
            premio=obtenerPremio(cartas,posicion);
            System.out.println("CARTAS");
            mostrarArray(cartas);
            if(premio==-1){
                System.out.println("Tarjeta roja...");
            }
            else{
                System.out.println("Has ganado "+premio+"!!!!");
                seguir=seguirJugando();
            }
            
            dinero_acum=dinero_acum+premio;
        }while(!(premio==-1 || !seguir));
        if(dinero_acum<0){
            dinero_acum=0;
        }
        System.out.println("Has acumulado "+dinero_acum+" de oro");
    }

    public static void llenarArrayConMonedas(int[] cartas, int dinero) {
        int negativo;
        Random r=new Random();
        negativo=r.nextInt(3);
        for (int i = 0; i < cartas.length; i++) {
            
            if(i==negativo){
                cartas[i]=-1;
            }
            else{
                dinero=r.nextInt(20)+1;
                cartas[i]=dinero;   
            }
        }
        
    }

    public static int pedirCartaUsuario() {
        int num;
        Scanner ent=new Scanner(System.in);
        do{
        System.out.println("Elija carta del 1-4");
        num=ent.nextInt();
        }while(!(num<=4 && num>0));
        return num;
        
    }

    public static int obtenerPremio(int[] cartas,int posicion) {
        int premio=0;
        posicion=posicion-1;
        for (int i = 0; i < cartas.length; i++) {
            if(posicion==i){
                premio=cartas[i];
            }
        }
        return premio;
    }

    public static boolean seguirJugando() {
        char opcion;
        Scanner ent=new Scanner(System.in);
        do{
        System.out.println("Quieres seguir jugando? S/N");
        opcion=ent.nextLine().charAt(0);
        }while(!(opcion=='S' || opcion=='s' || opcion=='N' || opcion=='n'));
        if(opcion=='S' || opcion=='s'){
            return true;
        }
        else if(opcion=='N' || opcion=='n'){
            return false;
        }
        else{
            return false;
        }
    }

    public static void mostrarArray(int[] cartas) {
        for (int i = 0; i < cartas.length; i++) {
            System.out.println("carta "+(i+1)+" = "+cartas[i]);
        }
    }
    
}
