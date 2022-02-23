package random_repaso;

import java.util.Random;

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
           //Desde -5998 hasta -2233
            int random=rd.nextInt(3766)-5998;
            System.out.println("Randoms --> "+random);
        }
    }
    
}
