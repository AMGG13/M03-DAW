/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package negativo_positivo_0_funcion;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Negativo_positivo_0_funcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num,formato;
        Scanner ent=new Scanner(System.in);
        System.out.println("Introduzca un valor");
        num=ent.nextInt();
        formato=dimeSigno(num);
        if(formato==0)
        {
            System.out.println("Tu numero es igual a cero");
        }
        else if(formato==-1)
        {
            System.out.println("Tu numero es negativo");
        }
        else if(formato==1)
        {
            System.out.println("Tu numero es positivo");
        }
    }
    /**
     * 
     * @param num
     * @return  Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo
     */
    public static int dimeSigno(int num) {
        if(num==0)
        {
            return 0;
        }
        else if(num<0)
        {
            return -1;
        }
        else if(num>0)
        {
            return 1;
        }
        return 0;
    }
    
}
