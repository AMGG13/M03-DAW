/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception_ej7;

import Objetos.Gato;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Exception_ej7 {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Gato> Almacen = new ArrayList<>();
    static Scanner ent = new Scanner(System.in);
    public static void main(String[] args) {
        int cont=1;
        String nombre;
        int edad;
        do {          
            System.out.println("Nombre de gato "+cont);
            nombre=ent.nextLine();
            System.out.println("Edad del gato "+cont);
            edad=ent.nextInt();
            try {
                cont++;
                Almacen.add(new Gato(nombre, edad));
                ent.nextLine();
            } catch (Exception ex) {
                System.err.println("dato invalido");
                cont--;
                ent.nextLine();
            }
            
        } while (cont<6);
    }
    
}
