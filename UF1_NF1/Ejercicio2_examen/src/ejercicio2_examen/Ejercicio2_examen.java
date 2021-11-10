/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2_examen;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio2_examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion,numfrase,cuentaatras,num1,num2,pares;
        int peque,grande;
        Scanner ent=new Scanner(System.in);
        
        do
        {
             System.out.println("******MENU******");
        System.out.println("0-Salir");
        System.out.println("1-Escribir 10 veces");
        System.out.println("2-Cuenta atrás timbre");
        System.out.println("3-Numero pares entre 2 valores");
        System.out.println("");
        
        System.out.print("Elije tu opcion:");
        opcion=ent.nextInt();
        
        if(opcion==0)
        {
            System.out.println("FIN DEL PROGRAMA");
            
        }

        else if(opcion==1)
        {
            for (numfrase = 1; numfrase <=10; numfrase++) {
                System.out.println("A clase se viene a trabajar");
            }
            System.out.println("FIN DE ESTA OPCION");
        }
        else if(opcion==2)
        {
            for (cuentaatras = 10; cuentaatras >=0; cuentaatras--) {
                System.out.print(cuentaatras+" ");
            }
            System.out.print("RIIIIIIING");
            System.out.println("");
            System.out.println("FIN DE ESTA OPCION");
        }
        else if(opcion==3)
        {
            System.out.println("Introduzca el primer numero");
           num1=ent.nextInt();
            System.out.println("Introduzca el segundo numero");
           num2=ent.nextInt();
            if(num1<num2)
            {
                pares=num1;
            System.out.println("Numero1: "+num1);
            System.out.println("Numero2: "+num2);
            
            
            }
            if(num1>num2)
            {
                pares=num2;
            System.out.println("Numero1: "+num1);
            System.out.println("Numero2: "+num2);
            
            
            }
            
           
           
            System.out.println("FIN DE ESTA OPCION");
        }
        else
        {
            System.out.println("**OPCION INCORRECTA**");
        }
          
        }while(opcion!=0);
        
      
    }
    
}
