/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string_ej2;

import java.util.Scanner;

/**
 *Crea un programa que pida dos cadenas de texto por teclado y luego indique si son iguales,
además de si son iguales sin diferenciar entre mayúsculas y minúsculas.
 * @author alumne
 */
public class String_ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe una frase");
        String frase1 = teclado.nextLine();
        System.out.println("Escribe otra frase");
        String frase2 = teclado.nextLine();
        
        if(frase1.equalsIgnoreCase(frase2)){
            System.out.println("Frases iguales");
        }
        else{
            System.out.println("Es diferente");
        }
    }
    
}
