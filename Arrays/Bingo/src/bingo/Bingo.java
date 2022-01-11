/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bingo;

import java.util.Random;

/**
 *
 * @author alumne
 */
public class Bingo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bola,cont=0,cont_bolas=0;
        boolean siono;
        int[] carton=new int[5];
        int[] bolas_extraidas=new int[89];
        Random rd=new Random();
        
        llenarCarton(carton);
        
    do{
        bola=bolaRandom(bolas_extraidas,cont_bolas);
        bolas_extraidas[cont_bolas]=bola;
        mostrarBolasExtraidas(bolas_extraidas,cont_bolas);
        cont_bolas++;
        System.out.println("Ha salido la bola "+bola);
        siono=comprobarCarton(carton,bola);
        if(siono){
            cont++;
        }
        System.out.println("contador= "+cont);
        mostrarArray(carton);
    }while(!(cont==5));
        System.out.println(" Bingoo");
    }

    public static int bolaRandom(int[] bolas_extraidas, int cont_bolas) {
        Random rd=new Random();
        int bola;
        boolean salido;
        do{
        bola=rd.nextInt(89)+1;
        salido=conprobarSihaSalido(bolas_extraidas,cont_bolas,bola);
        }while(salido);
        return bola;
                
    }

    private static void llenarCarton(int[] carton) {
        int numero_carton;
        int numero;
        Random rd=new Random();
        for (int i = 0; i < carton.length; i++) {
            do{
                numero=rd.nextInt(89)+1; 
            }while(conprobarSihaSalido(carton,numero,i));
            carton[i]=numero;
        }
    }

    public static boolean comprobarCarton(int[] carton, int bola) {
        for (int i = 0; i < carton.length; i++) {
            if (carton[i]==bola){
                carton[i]=0;
                return true;
            }
        }
        return false;
    }

    public static void mostrarArray(int[] carton) {
        for (int i = 0; i < carton.length; i++) {
            if(carton[i]!=0){
                System.out.print(carton[i] +"-");
            }
            else if(carton[i]==0){
                System.out.print("X-");
            }
            
        }
    }

    private static void mostrarBolasExtraidas(int[] bolas_extraidas, int cont_bolas) {
        for (int i = 0; i < cont_bolas; i++) {
            System.out.print(bolas_extraidas[i] +"-");
        }
    }

    public static boolean conprobarSihaSalido(int[] bolas_extraidas, int cont_bolas, int bola) {
        for (int i = 0; i < cont_bolas; i++) {
            if (bolas_extraidas[i]==bola){
                return true;
            }
        }
        return false;
    }
    
}
