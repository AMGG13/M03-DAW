/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_descuentosupermercado;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio_descuentoSupermercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double Importe, descuento, importeTotal;
        
        System.out.println("Cuanto te has gastado en la compra?");
        Importe=entrada.nextDouble();
        
        if(Importe<800)
        {
            System.out.println("No se aplicara descuento ninguno");
        }
        else if(Importe>=800 && Importe<1500)
        {
            descuento=(Importe*6)/100;
            importeTotal=Importe-descuento;
            System.out.println("Pagará un total de "+importeTotal+" euros");
        }
        else if(Importe>=1500 && Importe<3000)
        {
           descuento=(Importe*8)/100;
            importeTotal=Importe-descuento;
            System.out.println("Pagará un total de "+importeTotal+" euros"); 
        }
        else if(Importe>=3000)
        {
            descuento=(Importe*10)/100;
            importeTotal=Importe-descuento;
            System.out.println("Pagará un total de "+importeTotal+" euros");
        }
    }
    
}
