/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueva_3;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Prueva_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int adulto=20,infantil=10;
        int Mayores,Menores,Personas;
        double descuento,importe_total;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Cuantas personas van al PortAventura?");
        Personas=entrada.nextInt();
        System.out.println("Cuantos menores van?");
        Menores=entrada.nextInt();
        Mayores=Personas-Menores;
        
        if(Personas<10)
        {
            importe_total=Menores*infantil+Mayores*20;
            System.out.println("En total el importe sera de "+importe_total+" euros");
            
        }
        else if(Personas>=10 && Personas<=25)
        {
          importe_total=Menores*infantil+Mayores*adulto;
          descuento=importe_total*25/100;
          importe_total=importe_total-descuento;
            System.out.println("Se ha aplicado un 25% de descuento");
          
            System.out.println("En total el importe sera de "+importe_total+" euros");  
        }
        else if(Personas>25)
        {
            
          importe_total=Menores*infantil+Mayores*adulto;
          descuento=importe_total*25/100;
          importe_total=importe_total-descuento;
            System.out.println("Se ha aplicado un 25% de descuento y se ha quitado una entrada");
          
            System.out.println("En total el importe sera de "+importe_total+" euros");  
        }
       
    }
    
}
