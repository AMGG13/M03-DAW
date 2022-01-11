/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string_ej5;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class String_ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Escriba la frase");
        String frase = teclado.nextLine();
         boolean palindromo = esPalindromo(frase);
         
         if(palindromo){
             System.out.println("Es palindromo");
         }
         else{
             System.out.println("No es palindromo"); 
         }
    }

    public static boolean esPalindromo(String frase) {
        frase = frase.toLowerCase();
        System.out.println("Frase minuscula "+frase);
        frase = frase.replace(" ","");
        System.out.println("Frase sin espacio "+frase);
        
        int paraAtras=frase.length()-1;
        
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != frase.charAt(paraAtras)){
                return false;
            }
            paraAtras--;
        }
        return true;
    }
    
}
