/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indexoutofbounds_ej3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class IndexOutOfBounds_ej3 {

    /**
     * @param args the command line arguments
     */
    static Scanner ent = new Scanner(System.in);
    public static void main(String[] args) {
        double [] vector = new double [5];
        try{
            for (int i = 0; i < 6; i++) {
                System.out.println("introduzca el valor "+(i+1));
                vector[i]=ent.nextDouble();
            }
        }
        catch(IndexOutOfBoundsException indx){
            System.err.println("Has salido del array");
            indx.printStackTrace();
        }
    }
    
}
