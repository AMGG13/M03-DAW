/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgswitch;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int opcion;
        int record=999999;
        //Menu
        System.out.println("Menú");
        System.out.println("////////////////////");
        System.out.println("//1-Nueva partida //");
        System.out.println("//________________//");
        System.out.println("//2-Cargar partida//");
        System.out.println("//________________//");
        System.out.println("//3-Records       //");
        System.out.println("//________________//");
        System.out.println("//4-Salir         //");
        System.out.println("////////////////////");
        //Elige la opcion
        System.out.println("Escoge una opcion:");
        opcion=entrada.nextInt();
        
        switch (opcion){
            case 1:
                System.out.println("Cargando nueva partida...");
                break;
            case 2:
                System.out.println("Continuar partida...");
                break;
            case 3:
                System.out.println("Tu record es este: "+record);
                break;
            case 4:
                System.out.println("Saliendo...");
                break;
                
            //Cualquier otro numero es incorrecto.
            default:
                System.out.println("Opcion incorrecta");
                break;
                
        }
                
    }
    
}
