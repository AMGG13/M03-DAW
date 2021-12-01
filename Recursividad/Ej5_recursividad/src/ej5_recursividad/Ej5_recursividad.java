/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5_recursividad;

/**
 *
 * @author alumne
 */
public class Ej5_recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        num1=752;
        mostrarNumeroInvertido(num1);
        System.out.println("");
        System.out.println("suma de cada cifra: "+sumaCifras(num1));
    }
    public static void mostrarNumeroInvertido(int num1){
        if (num1<10){
            System.out.print(num1);
        }
        else{
            System.out.print(num1%10);
            
            mostrarNumeroInvertido(num1/10);
            
        }
    }
    public static int sumaCifras(int num1){
        if (num1<10){
            return num1;
        }
        else{
            return num1%10+sumaCifras(num1/10);
            
        }
    }
    
}
