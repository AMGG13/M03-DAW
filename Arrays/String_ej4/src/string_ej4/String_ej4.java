/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string_ej4;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class String_ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba la frase");
        String frase = teclado.nextLine();
        frase.toLowerCase();
        for (int i = 0; i < frase.length(); i++) {
            frase.charAt(i);
            switch (frase.charAt(i)) {
                case 'a':
                    contA++;
                    break;
                case 'e':
                    contE++;
                    break;
                case 'i':
                    contI++;
                    break;
                case 'o':
                    contO++;
                    break;
                case 'u':
                    contU++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("Hay " + contA + " A's");
        System.out.println("Hay " + contE + " E's");
        System.out.println("Hay " + contI + " I's");
        System.out.println("Hay " + contO + " O's");
        System.out.println("Hay " + contU + " U's");
    }
    
}
