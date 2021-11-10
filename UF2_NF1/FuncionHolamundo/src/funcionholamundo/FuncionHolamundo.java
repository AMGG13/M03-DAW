/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionholamundo;

import java.util.Scanner;
/**
 *
 * @author alumne
 */

public class FuncionHolamundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner ent=new Scanner(System.in);
    
    helloworld();
    String nombre="Alvin Miller Garcia Garcia";
        helloworldNombre(nombre);
        int valor=5;
        System.out.println("Valor no clonado antes de la funcion la suma de 2 en valor es "+valor);
        aumentaEnDos(valor);
        System.out.println("Valor no clonado despues de la funcion la suma de 2 en valor es "+valor);
    }
    
    //Funcion que muestra en pantalla Hello world
    //Void no devuelve ningun valor
    
    public static void helloworld()
    {
        System.out.println("Hello Woeld in funtions");
    }//Helloworld
    /**
     * Escribira helloworld con mi nombre
     * 
     * @param nom es la variable que contiene el nombre
     */
    public static void helloworldNombre(String nom)
    {
        System.out.println("Hello World. "+nom+", How are you?");
    }
    /**
     * Aumentara el valor sumando 2
     * @param valor Valor tendra el numero que me pasa desde el main
     */
    private static void aumentaEnDos(int valor) {
        valor=valor*2;
        System.out.println("la suma de 2 en valor es "+valor);
    }
}
