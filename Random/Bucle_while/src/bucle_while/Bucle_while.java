/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucle_while;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Bucle_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Los whiles antes de  realizar el bucle, necesita que la condicion se cumpla en este caso realizare un bucle do-while
        //porque el while no sabria el valor de opcion puesto que lo pedimos dentro del bucle.
        int opcion;
        do {            
            opcion=mostrarMenu();
            switch (opcion) {
                case 1:
                    whileDescendente();
                    break;
                case 2:
                    whileAscendente();
                    break;
                case 3:
                    whileIntercalado();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    break;
            }
            
              
        } while (opcion!=4);
        
    }

    private static void whileDescendente() {
        //Programa con while que muestra del 5mil al 1;
        System.out.println("WHILE DEL 5000 AL 1");
        int contador=5000;
        while(contador>=1){ //MIENTRAS CONTADOR MAYOR o IGUAL QUE 1.
            System.out.println(contador);
            contador--;//DECRESE POR LO TANTO HAY QUE RESTAR CADA VUELTA -1
        }
    }

    private static void whileAscendente() {
        //Programa con while que muestra la cuenta del 1 al 5 mil
        System.out.println("WHILE DEL 1 AL 5000");
        int contador=1;
        while(contador<=5000){ // MIENTRAS CONTADOR SEA MENOR o IGUAL A 10 EL BUCLE SE EJECUTARÁ
            System.out.println(contador);
            contador++; // ASCIENDE POR LO TANTO HAY QUE SUMAR CADA VUELTA +1
        } 
    }

    private static int mostrarMenu() {
        System.out.println("************MENU************");
        System.out.println("*1-WHILE:Del 5000-1        *");
        System.out.println("*2-WHILE:Del 1-5000        *");
        System.out.println("*3-WHILE:Del de 10 en 10   *");
        System.out.println("*4-WHILE(opcion!=4)        *");
        System.out.println("****************************");
        Scanner ent= new Scanner(System.in);
        System.out.println("Seleccione --> ");
        int opcion = ent.nextInt();
        return opcion;
    }

    private static void whileIntercalado() {
        System.out.println("WHILE DEL 1 AL 5000 de 10 en 10");
        int contador=1;
        while(contador<=100){ // MIENTRAS CONTADOR SEA MENOR o IGUAL A 10 EL BUCLE SE EJECUTARÁ
            System.out.println(contador);
            if(contador==1){
                contador=contador+9; // +9 para que luego pueda dar 10 y con el else seguir de 10 en 10
            }
            else{
                contador=contador+10;
            }
        } 
    }
    
}
