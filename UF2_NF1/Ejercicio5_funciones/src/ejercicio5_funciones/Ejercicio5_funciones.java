/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5_funciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio5_funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int millas;
        double kilometros;        
        Scanner ent=new Scanner(System.in);
        System.out.println("Introduzca las millas que quiere pasar a  kilometros");
        millas=ent.nextInt();
        if(millas<=0)
        {
            System.out.println("No se puede hacer la conversion con un numero negativo o cero");
        }
        else
        {
        kilometros=millas_a_kilometros(millas);
        System.out.println(millas+" millas son "+kilometros+" kilometros");
        }
    }

    public static double millas_a_kilometros(int millas) {
        double conversion;
        conversion=millas*1.60934;
        
        return conversion;
    }
    
}
