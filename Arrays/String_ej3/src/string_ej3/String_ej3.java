/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string_ej3;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class String_ej3 {

    /**
     * Crea un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos. Luego
mostrará un código de usuario (en mayúsculas) formado por la concatenación de las tres
primeras letras de cada uno de ellos. Por ejemplo si se introduce “Lionel”, “Tarazón” y
“Alcocer” mostrará “LIOTARALC”.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre");
        String Nombre = teclado.nextLine();
        System.out.println("Apellido");
        String Apellido1 = teclado.nextLine();
        System.out.println("Segundo apellido");
        String Apellido2 = teclado.nextLine();
        
        Nombre = Nombre.substring(0, 3).toUpperCase();
        Apellido1 = Apellido1.substring(0, 3).toUpperCase();
        Apellido2 = Apellido2.substring(0, 3).toUpperCase();
        
        System.out.println(Nombre+Apellido1+Apellido2);
    }
    
}
