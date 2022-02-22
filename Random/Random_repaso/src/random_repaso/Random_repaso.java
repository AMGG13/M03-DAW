/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random_repaso;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Random_repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rd = new Random();
        
        System.out.println("Numeros randoms del 25 al 100");
        //Numeros randoms del 25 al 100
        for (int i = 0; i <= 10; i++) {
            int my_random=rd.nextInt(76)+25;
            System.out.println("Randoms --> "+my_random);
        }
        
        System.out.println("Numeros randoms del -100 al 100");
        //Numeros randoms del -100 al 100
        for (int i = 0; i <= 10; i++) {
            int my_random=rd.nextInt(201)-100;
            System.out.println("Randoms --> "+my_random);
        }
        System.out.println("Pruebas randoms del Random IA");
        for (int i = 0; i < 10; i++) {
           int random=rd.nextInt(562)-328;
            System.out.println("Randoms --> "+random);
        }
    }
    
}
