/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_sueldo;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio_sueldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
       double sueldo,incremento;
       
        System.out.println("Cual es tu sueldo actual?");
        sueldo=entrada.nextDouble();
        
        if(sueldo<=18000)
        {
            incremento= (sueldo*12)/100;
            sueldo=(double)sueldo+incremento;
            System.out.println("Tu sueldo se incrementara a: "+sueldo);
        }
        else if (sueldo>18000 && sueldo<=30000)
        {
            incremento=(sueldo*10)/100;
            sueldo=(double)sueldo+incremento;
            System.out.println("Tu sueldo se incrementara a: "+sueldo);
        }
        else if(sueldo>30000 && sueldo<=45000)
        {
            incremento=(sueldo*8)/100;
            sueldo=(double)sueldo+incremento;
            System.out.println("Tu sueldo se incrementara a: "+sueldo);
        }
        else if(sueldo>45000)
        {
          incremento=(sueldo*6)/100;
            sueldo=(double)sueldo+incremento;
            System.out.println("Tu sueldo se incrementara a: "+sueldo);  
        }
    }
    
}
