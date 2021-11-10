/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle_6;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Bucle_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador, num;
        boolean negativo=false;
        
        for (contador = 0; contador < 10; contador++) {
            Scanner entrada=new Scanner(System.in);
            System.out.println("Introduzca el numero");
            num=entrada.nextInt();
            
            if(num<0)
            {
                negativo=true;
            }
            }
        if(negativo)
        {
            System.out.println("Has introducido algun numero negativo");
            
        }
        else if(!negativo)
        {
            System.out.println("No se ha leido ningun numero negativo");
        }
        
    }
    
}
