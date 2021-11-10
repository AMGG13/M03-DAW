/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabla_del_5;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Tabla_del_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num;
       int cont=1;
       int multi;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Que tabla de multiplicar quieres?");
        num=entrada.nextInt();
        System.out.println("    ");
        System.out.println("     ");
       
        System.out.println("Esto es utilizando el FOR");
        for (cont = 1; cont<=10; cont=cont+1) {
            multi=num*cont;
            System.out.println(num+"x"+cont+"="+multi);
        }
        System.out.println("        ");
        System.out.println("        ");
        
        System.out.println("Esto es utilizando el While");
        cont=1;
        
        while(cont<=10)
        {
            multi=num*cont;
            System.out.println(num+"x"+cont+"="+multi);
            cont++;
        }
        System.out.println("          ");
        System.out.println("           ");
        System.out.println("Esto es el do-while");
        cont=1;
        do
        {
            multi=num*cont;
            System.out.println(num+"x"+cont+"="+multi);
            cont++;
            
        }while(cont<=10);
        
        
        
    
    }
    
}
