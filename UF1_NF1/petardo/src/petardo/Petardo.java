/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package petardo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Petardo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                int p1,p2,p3,opcion=0;
        
        Scanner ent=new Scanner(System.in);
        Random r=new Random();
        p1=r.nextInt(20);
        p2=r.nextInt(20);
        p3=r.nextInt(20);
        System.out.println("Por favor introduzca el numero de petardo del 1 al 3");
        opcion=ent.nextInt();
        System.out.println("Petardo 1 es "+p1);
        System.out.println("Petardo 2 es "+p2);
        System.out.println("Petardo 3 es "+p3);
        System.out.println("");
        
         if(opcion==1)
        {
            if(p1>=p2 && p1>=p3)
            {

                System.out.println("Ganaste!!!");
            }
            if(p2>=p1 && p2>=p3)
            {

                System.out.println("Perdiste...");
            }
            if(p3>=p2 && p3>=p1)
            {
              
                System.out.println("Perdiste...");
            }
            
        }
        if(opcion==2)
        {
            if(p1>=p2 && p1>=p3)
            {
              
                System.out.println("Perdiste...");
            }
            if(p2>=p1 && p2>=p3)
            {
               
                System.out.println("Ganaste!!!");
            }
            if(p3>=p2 && p3>=p1)
            {
              
                System.out.println("Perdiste...");
            }
            
        }
        if(opcion==3)
        {
            if(p1>=p2 && p1>=p3)
            {
     
                System.out.println("Perdiste...");
            }
            if(p2>=p1 && p2>=p3)
            {
       
                System.out.println("Perdiste...");
            }
            if(p3>=p2 && p3>=p1)
            {
       
                System.out.println("Ganaste!!!");
            }
            
        }
        
        System.out.println("");
        System.out.println("P1   P2    P3");
        while(p1!=0 || p2!=0 || p3!=0)
        {     
            p1--;
            p2--;
            p3--;
            if(p1>=0)
                {
                System.out.print("*");
                }
            else if(p1<0)
            {
                p1=0;
            }
            if(p2>=0)
                {
                System.out.print("     *");
                }
            else if(p2<0)
            {
                p2=0;
            }
            if(p3>=0)
                {
                System.out.print("     *");
                }
            else if(p3<0)
            {
                p3=0;
            }
            System.out.println("");
            
            Thread.sleep(500);
        }
            System.out.println("FIN");
    }
    
}
