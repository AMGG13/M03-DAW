/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejlibre_array;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjLibre_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pares;
         int [] valores = new  int[10];
         Random rd = new Random();
         llenarArrayRandomMitad(valores);
         System.out.println("*Valores random ya se han introducido*");
         llenarArrayPorUsuarioMitad(valores);
         mostrarArray(valores);
         
         
    }

    public static void llenarArrayRandomMitad(int[] valores) {
        int r;
        Random rd = new Random();
        for (int i = 0; i < valores.length/2; i++) {
                r=rd.nextInt(1000)+1;
                valores[i]=r;
            }
        }

    public static void llenarArrayPorUsuarioMitad(int[] valores) {
        int valor;
        Scanner ent=new Scanner(System.in);
        for (int i = valores.length/2; i < valores.length; i++) {
                System.out.println("Introduzca valor para la posicion "+(i+1));
                valor=ent.nextInt();
                valores[i]=valor;
            }
        }

    public static void mostrarArray(int[] valores) {
        for (int i = 0; i < valores.length; i++) {
            System.out.println("posicion "+(i+1)+" = "+valores[i]);
        }
    }
    }
    


    

