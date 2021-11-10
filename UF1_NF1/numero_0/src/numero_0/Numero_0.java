/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numero_0;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Numero_0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int num,acumulando_suma=0;
//        Scanner entrada=new Scanner(System.in);
//        do
//        {
//            System.out.println("Introduzca el numero pon '-1'si quieres detener el programa");
//            num=entrada.nextInt();
//            if(num!=-1)
//            {
//            acumulando_suma=num+acumulando_suma;
//            System.out.println("total de: "+acumulando_suma);
//            }
//            else
//            {
//                System.out.println("total de: "+acumulando_suma);
//                System.out.println("Se ha acabado el programa");
//            }
//        }while(num!=-1);
        
        //System.out.println("Has escrito 0 se ha acabado el programa");
           int num,acumulando_suma=0;
           boolean finalBucle=false;
        Scanner entrada=new Scanner(System.in);
        do
        {
            
            System.out.println("Boolean Introduzca el numero pon '+100'si quieres detener el programa");
            num=entrada.nextInt();
            if(num>0)
            {
                System.out.println("Este programa no resta");
            }
            if(acumulando_suma<=100) //Si el valor pasa de 100 no sigue
            {
            acumulando_suma=num+acumulando_suma;
            System.out.println("total de: "+acumulando_suma);
            }
            else
            {
                finalBucle=true;
            }
        }while(!finalBucle);
    }
    
}
