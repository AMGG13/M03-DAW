/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10_funciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio10_funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia,mes,ano;
        boolean bool=false;
        Scanner ent=new Scanner(System.in);
        System.out.println("Pon el dia");
        dia=ent.nextInt();
        System.out.println("Pon el mes");
        mes=ent.nextInt();
        System.out.println("Pon el año");
        ano=ent.nextInt();
        
        bool=FechaValida(dia,mes,ano);
        System.out.println("Tu fecha es "+bool);
        
    }

    private static boolean FechaValida(int dia, int mes, int ano) {
        
        if(dia<=30 && dia>0 && mes<=12 && mes>=1 && ano<=2021 && ano>0)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    
    
}
