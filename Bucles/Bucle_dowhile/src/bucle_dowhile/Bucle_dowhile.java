/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucle_dowhile;

/**
 *
 * @author Usuario
 */
public class Bucle_dowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Bucle bien hecho
        int iterador=1;
        int combo = 5;
        do{
            System.out.println(iterador);
            iterador++;
            if(iterador == 10){
                combo = 9999;
                System.out.println("Bien hecho "+combo);
            }
        }while(iterador<=10 && combo<=9999);
        
        //Bucle infinito
//        do {
//            System.out.println(iterador);
//            iterador++;
//            if (iterador == 10) {
//                combo = 9999;
//                System.out.println("Bien hecho " + combo);
//            }
//        } while (iterador <= 10 || combo <= 9999);
    }
    
}
