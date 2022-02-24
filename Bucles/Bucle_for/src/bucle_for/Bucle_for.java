/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucle_for;

/**
 *
 * @author Usuario
 */
public class Bucle_for {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Otros usos
        //Programa que muestre Hola Mundo 3 º
        for (int i = 0; i < 3; i++) {
            System.out.println("Hola mundo");
        }
        //Con arrays/arraylist
        int [] array1= new int [3];
        //for normal
        for (int i = 0; i < array1.length; i++) {
            array1[i]=3;
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        //for it fore PENDIENTE A APRENDER
        for (int i : array1) {
            i=4;
        }
        for (int i : array1) {
            System.out.println(array1[i]);
        }
    }
    
}
