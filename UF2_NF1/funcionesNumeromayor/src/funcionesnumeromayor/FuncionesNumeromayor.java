/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionesnumeromayor;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class FuncionesNumeromayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ent=new Scanner(System.in);
        int valor1,valor2;
        int mayor=0;
        System.out.println("Pon el primer valor");
        valor1=ent.nextInt();
        System.out.println("Pon el segundo valor");
        valor2=ent.nextInt();
        mayor=NumeroMayor(valor1,valor2);
        
        System.out.println("El numero mayor que has puesto es "+mayor);
    }
    
    /**
     * 
     * @param valor1
     * @param valor2
     * @return 
     */
    public static int NumeroMayor(int valor1,int valor2)
    {
        
        if(valor1>valor2)
        {
            return valor1;
        }
        else
        {
            return valor2;
        }
        
        
    }
    
}
