/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recoger_tecla_por_teclado;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Recoger_tecla_por_teclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Eres mayor de edad?(s/n)");
        char mayor;
        int dinero;
        //recoge la frase que pongas pero devuelve la letra que esta en la primera posicion
        mayor = entrada.nextLine().charAt(0);
        System.out.println("Has escogido: "+mayor);
        System.out.println(" Cuanto dinero tienes?");
        dinero = entrada.nextInt();
        
        //el OR es ||
        //el AND es &&
        if (((mayor=='s') || (mayor=='S')) && (dinero>=10))
        {
           System.out.println("Que es un tsunami en africa?"); 
           System.out.println("-Chocapics");
        }
        else if ((mayor=='n') || (mayor=='N'))
        {
                System.out.println("¿Qué le dice una taza a otra?");
        System.out.println("¿Qué taza ciendo?");
        }
        else
        { 
        System.out.println("No pongas otras cosas que no sea SI o NO o eres pobre");     
        }
                
             
    }
    
}
