/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_18;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int tarifa,horas;
        double SueldoNeto,sueldo_bruto,SueldoHorasNormales,horasextras,SueldoHorasExtras,SueldoBruto;
        int impuestos;
        System.out.println("Introduce precio hora");
        tarifa=entrada.nextInt();
        System.out.println("Introduce las horas");
        horas=entrada.nextInt();
        
        if (horas<35)
        {
            sueldo_bruto=tarifa+horas;
            System.out.println("Tu saldo bruto es: "+sueldo_bruto);
        }
        else
        {
            SueldoHorasNormales=35*tarifa;
                horasextras=horas-35;
                SueldoHorasExtras=horasextras*tarifa*1.5;
                SueldoBruto=SueldoHorasExtras+SueldoHorasNormales;
                
        }
        System.out.println("Tu sueldo bruto es"+SueldoBruto);
       
              //Impuestos
              if(SueldoBruto<=500)
              {
                  impuestos=0;
                  SueldoNeto=SueldoBruto-Impuestos;
                  sout
                          
              }
                  
              
        
    }
    
}
