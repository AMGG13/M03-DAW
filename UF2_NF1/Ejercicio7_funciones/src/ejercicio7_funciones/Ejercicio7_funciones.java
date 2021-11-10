/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7_funciones;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio7_funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double ancho,alto,area,perimetro;
        Scanner ent=new Scanner(System.in);
        System.out.println("***CALCULA EL AREA Y EL PERIMETRO DEL RECTANGULO***");
        System.out.println("Introduce el ancho");
        ancho=ent.nextDouble();
        System.out.println("Introduce la altura");
        alto=ent.nextDouble();
        
        area=areaRectangulo(ancho,alto);
        perimetro=perimetroRectangulo(ancho,alto);
        System.out.println("El area de tu rectangulo es "+area);
        System.out.println("El perimetro de tu rectangulo es "+perimetro);
    }

    public static double areaRectangulo(double ancho, double alto) {
        double area;
        area=ancho*alto;
        
        return area;
    }

    public static double perimetroRectangulo(double ancho, double alto) {
        double perimetro;
        perimetro=(ancho+ancho)+(alto+alto);
        
        return perimetro;
    }
    
}
