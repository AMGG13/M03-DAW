/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3_examen;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio3_examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int metros_habitacion,sumametros=0;
        Scanner ent=new Scanner(System.in);
        char opcion;
        do
        {
            System.out.println("Cuantos metros cuadrados tiene tu habitacion: ");
            metros_habitacion=ent.nextInt();
            ent.nextLine();
            System.out.println("Hay mas habitaciones s/n?");
            opcion=ent.nextLine().charAt(0);
            
            sumametros=sumametros+metros_habitacion;
        }while(opcion!='n' && opcion!='N');
        System.out.println("Tu casa mide "+sumametros+" metros cuadrados");
    }
    
}
