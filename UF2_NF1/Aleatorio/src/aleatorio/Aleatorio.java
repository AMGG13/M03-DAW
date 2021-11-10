/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aleatorio;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Aleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor1,num,intentos=0;
        Random r1=new Random();
        
        valor1=r1.nextInt(50)+1;
        
        Scanner ent=new Scanner(System.in);
        
       
        do{
            System.out.println("Adivina mi numero entre el 1 y el 50");
        num=ent.nextInt();
        if(num!=valor1)
        {
            System.out.println("No has acertado...");
            if(num<valor1)
            {
                System.out.println("El numero es mayor");
            }
            else if(num>valor1)
            {
                System.out.println("El numero es menor");
            }
        }
        intentos++;
        }while(num!=valor1);
        
        System.out.println("has acertado, felicidades!!!");
        System.out.println("Has realizado "+intentos+" intentos");
    }
    
}
