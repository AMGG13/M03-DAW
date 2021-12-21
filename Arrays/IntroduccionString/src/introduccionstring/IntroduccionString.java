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
//        System.out.println("Que letra quieres remplazar?");
//        letra1=ent.next().charAt(0);
//        System.out.println("Por cual?");
//        ent.nextLine();
//        letra2=ent.nextLine().charAt(1);
//        System.out.println(tuNombre.replace(letra1, letra2));
//        System.out.println(tuNombre);
        
        tuNombre.replaceAll(nombre, tuNombre);
        System.out.println(nombre);
        
        
    
    }
    
}
