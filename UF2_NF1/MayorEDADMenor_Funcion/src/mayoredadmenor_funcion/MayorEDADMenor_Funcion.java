/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mayoredadmenor_funcion;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class MayorEDADMenor_Funcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad=0;
        boolean mayor=false;
        Scanner ent=new Scanner(System.in);
        mayor=MayorMenor(mayor,edad,ent);
        
    }

    public static boolean MayorMenor(boolean mayor, int edad,Scanner ent) {
        System.out.println("Introduce la edad");
        edad=ent.nextInt();
        
        if(edad<18)
        {
            System.out.println("Eres menor");
           return mayor=false; 
        }
            else if(edad>=18)
            {
                System.out.println("Eres mayor de edad");
            return mayor=true; 
            
            }
        
      
        return mayor;
    }
    
}
