/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_bingo;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Prueba_bingo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int[] carton = new int[10];
     llenarCarton(carton);
     mostrarCarton(carton);
    }

    
    public static void llenarCarton(int[] carton) {
         Random rd = new Random();
        int num;
        boolean repetido=false;
        for (int i = 0; i < carton.length; i++) {      
            do{
                num=rd.nextInt(89)+1; 
                for (int j = 0; j < carton.length; j++) {
                    if(carton[j]==num)
                    {
                        repetido=true;
                    }
                }
            }while(repetido==true);
         carton[i]=num;
            System.out.println("carton "+i+" es igual a "+carton[i]);
        }
         
        }
    

    public static void mostrarCarton(int[] carton) {
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
    
}
