/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_15;

import java.util.Scanner;

/**
 * 15.	Dibuja un ordinograma que lea tres números distintos y nos diga cuál es
 * el mayor.
 *
 * @author alumne
 */
public class Ejercicio_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Introduzca el primer numero");
        num1 = entrada.nextInt();

        System.out.println("Introduzca el segundo numero");
        num2 = entrada.nextInt();

        System.out.println("Introduzca el tercer numero");
        num3 = entrada.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("El mas grande es num1: " + num1);
            } else {
                System.out.println("El mas grande es num3: " + num3);
            }
 //Alt+Shift+F
        } else if (num2 > num3) {
            System.out.println("El mas grande es num2: " + num2);
        } else {
            System.out.println("El mas grande es num3: " + num3);
        }

    }

}
