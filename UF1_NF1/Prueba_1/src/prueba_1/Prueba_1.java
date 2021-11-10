/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba_1;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Prueba_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int criptomoneda,opcion;
        final double eu_bitcoin=49561,eu_XMR=233.81;
        double euro;
                
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Cuantas criptomonedas tienes?");
        criptomoneda=entrada.nextInt();
        System.out.println("//////////");
        System.out.println("///MENU///");
        System.out.println("//////////");
        System.out.println("1.Bitcoin");
        System.out.println("2.XMR");
        System.out.println("Elija que cripto quiere convertitr a euro");
        opcion=entrada.nextInt();
        
        if(opcion==1)
        {
           euro=(double)criptomoneda*eu_bitcoin;
            System.out.println("Tus "+criptomoneda+" criptomonedas son equivalentes a "+euro+" euros");
           
        }
        else if(opcion==2)
        {
           euro=(double)criptomoneda*eu_XMR;
            System.out.println("Tus "+criptomoneda+" criptomonedas son equivalentes a "+euro+" euros"); 
        }
        else
        {
            System.out.println("Elija una de las opciones del menú por favor.");
        }
    }
    
}
