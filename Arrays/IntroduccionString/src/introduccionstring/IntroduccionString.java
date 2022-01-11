/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introduccionstring;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class IntroduccionString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre="Alvin Miller";
        System.out.println(nombre);
        char[] palabra ={'A','l','v','i','n'};
        String nueva_palabra = new String(palabra);
        System.out.println(nueva_palabra);
        System.out.println(palabra);
        char letra1,letra2;
        String tuNombre;
        Scanner ent=new Scanner(System.in);
        System.out.println("Como te llamas?");
        tuNombre=ent.nextLine();
        System.out.println("La longitud de tu nombre es "+tuNombre.length());
    }
    
}
