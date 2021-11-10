/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej9_bucle;

/**
 *
 * @author alumne
 *9. Realiza un programa que calcule y escriba la suma y el producto de los 10 primeros números
naturales*/
public class Ej9_bucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma10=0,producto=1;
        int numero=1;
        
        do
        {
            suma10=suma10+numero;
             System.out.println(producto+"x"+numero);
            producto=producto*numero;
            System.out.println(producto);
            numero++;
        }while(numero<=10);
        
        System.out.println("la suma total es: "+suma10);
        System.out.println("el producto total es: "+producto);
    }
    
    
}
