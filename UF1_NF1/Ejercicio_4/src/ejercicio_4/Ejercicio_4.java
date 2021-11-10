/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        int numero1,numero2;
        
        
        System.out.println("Introduzca el primer numero por favor.");
        numero1=entrada.nextInt();
        
        System.out.println("Introduzca el segundo numero por favor.");
        numero2=entrada.nextInt();
        
        int suma=numero1+numero2;
        int resta=numero1-numero2;
        double division=(double)numero1/numero2;
        int producto=numero1*numero2;
        
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("El producto es: "+producto);
        System.out.println("La division es: "+division);
        
        
        
    }
    
}
