/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej8_recursividad;

/**
 *
 * @author alumne
 */
public class Ej8_recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int num=20;
      mostrarBinario(num);
      
    }
    public static void mostrarBinario(int num){
        if (num<2){
           
           System.out.print(num%2);
        }
        else{
            mostrarBinario(num/2);
            System.out.print(num%2);
          
        }
    
    }
}
