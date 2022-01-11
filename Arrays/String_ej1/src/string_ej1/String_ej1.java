/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string_ej1;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class String_ej1 {

    /**
     * Crea un programa que pida una cadena de texto por teclado y luego muestre cada palabra
de la cadena en una línea distinta.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe una frase");
        String frase = teclado.nextLine();
        
        for (int index = 0; index < frase.length(); index++) {
            System.out.println(frase.charAt(index));
        }
        
        String[] palabras_sueltas=frase.split("");
        
        for (int i = 0; i < palabras_sueltas.length; i++) {
            System.out.println(palabras_sueltas[i]);
        }
    }
    
}
