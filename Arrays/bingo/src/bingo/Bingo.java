/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Bingo {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
       int[] carton = new int[10];
       int bola_sacada,aciertos=0;
       int[] historial_bolas = new int[89];
       int contador_bolas=0;
       
       
       
       llenarCarton(carton);
       mostrarCarton(carton);
       do{
       bola_sacada = sacar_bola(historial_bolas,contador_bolas);
        historial_bolas[contador_bolas] = bola_sacada;
        contador_bolas++;
        mostrarHistorial(historial_bolas,contador_bolas);
       
           System.out.println("Ha salido el " + bola_sacada);
       if (buscarBolaCarton(carton,bola_sacada))
       {
           aciertos++;
           System.out.println("Ha salido tu numero");
       }
       mostrarCarton(carton);
       }while(aciertos<5);
        System.out.println("Ganaste!");
    }

    
    
    public static void llenarCarton(int[] carton) {
        Random rd = new Random();
        int num;
        int pos=0;
        boolean repetido=true;
        do{
            do{
                num=rd.nextInt(89)+1;
                for (int i = 0; i <= carton.length; i++) {
                    if(carton[i]==num)
                    {
                        repetido=true;
                    }
                }
            }while(repetido==true);
         carton[pos]=num;
         pos++;
        }while(!(carton.length!=0));
            
    }

    private static int sacar_bola(int[] historial_bolas, int contador_bolas) {
        Random rd = new Random();
        int bola;
        boolean salido;
        do{
        bola= rd.nextInt(89)+1;
        salido =comprobarSihaSalido(historial_bolas,contador_bolas,bola) ;
        }while(salido==true);
        return bola;
    }

    /**
     * buscar si esta y si esta marco esa posicion a 0
     * devue
     * @param carton
     * @param bola_sacada
     * @return true si esta false si no eta la bola
     */
    private static boolean buscarBolaCarton(int[] carton, int bola_sacada) {
        
        for (int i = 0; i < carton.length; i++) {
            if(carton[i]==bola_sacada)
            {
                carton[i]=0;
                return true;
            }
        }
        return false;
    }

    private static void mostrarCarton(int[] carton) {
        for (int i = 0; i < carton.length; i++) {
            if (carton[i]==0) //numero ya marcado
            {
                System.out.print("X-");
            }
            else
            {
                System.out.print(carton[i] + "-");
            }
            
        }
        System.out.println("");/*salto linea final*/
    }

    private static void mostrarHistorial(int[] historial_bolas, int contador_bolas) {
        System.out.print("Bolas ya extraidas: ");
        for (int i = 0; i < contador_bolas; i++) {
            System.out.print(historial_bolas[i]+"*");
        }
        System.out.println("");
    }

    /** buscar la bola en el historial para saber si ha saldio
     * 
     * @param historial_bolas array de bolas
     * @param contador_bolas numero de bolas que han salido
     * @param bola que busco
     * @return true si estaba en el historial, false si es que no
     */
    private static boolean comprobarSihaSalido(int[] historial_bolas, int contador_bolas, int bola) {
        for (int i = 0; i <= contador_bolas; i++) {
            if(historial_bolas[i]==bola)
            {
                return true;
            }
            
        }
        return false;
    }
    
}
