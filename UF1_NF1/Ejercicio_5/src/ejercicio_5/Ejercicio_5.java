/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_5;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double pi,circunferencia,area,volumen;
        double radio;
        System.out.println("Cual es el radio de la esfera?");
        radio=entrada.nextDouble();
        
        pi= 3.14;
        
        circunferencia=(double)2*pi*radio;
        System.out.println("La circunferencia es= "+circunferencia);
        
        area=(double)pi*radio*radio;
        System.out.println("El area de la esfera es= "+area);
        
        volumen=(double)pi*circunferencia*radio*radio;
        System.out.println("El volumen de la esfera es= "+volumen);
        
        
        
        
    }
    
}
