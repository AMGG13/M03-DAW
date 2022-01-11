/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package siete_y_medio;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Siete_y_medio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int carta_aleatoria,palo_aleatorio;
       double puntos_jugador,puntos_banca,puntuacion_jugador=0,puntuacion_banca=0;
       char seguir;
       boolean banca_pide,gana_jugador;
       
       do{
        System.out.println("TU tienes: ");
        carta_aleatoria=numeroCartaAleatorio(); 
        palo_aleatorio=paloCartaAleatorio();
        imprimirCarta(carta_aleatoria,palo_aleatorio);
        puntos_jugador=puntosCarta(carta_aleatoria);
        puntuacion_jugador=puntuacion_jugador+puntos_jugador;
        
        System.out.println("BANCA tiene: ");
        carta_aleatoria=numeroCartaAleatorio(); 
        palo_aleatorio=paloCartaAleatorio();
        imprimirCarta(carta_aleatoria,palo_aleatorio);
        puntos_banca=puntosCarta(carta_aleatoria);
        puntuacion_banca=puntuacion_banca+puntos_banca;
        
        System.out.println("Tu puntuacion: "+puntuacion_jugador);
        System.out.println("Puntuacion Banca: "+puntuacion_banca);
        
        seguir=jugadorContinua();
        
        banca_pide=bancaPideCarta(puntuacion_jugador,puntuacion_banca);
        if(banca_pide){
            if(seguir=='n'||seguir=='N'){
                System.out.println("La banca ha decido pedir otra carta pero no es posible");
            }
            else{
                System.out.println("La banca ha decido pedir otra carta");
            }
        }
        else{
            System.out.println("La banca no continua");
        }
       }while(!(seguir=='n'|| seguir=='N'||!banca_pide || puntuacion_jugador>7.5 || puntuacion_banca>7.5));
       gana_jugador=ganaJugador(puntuacion_jugador,puntuacion_banca);
       if(gana_jugador){
           System.out.println("Felicidades, has ganado!!!");
       }
       else{
           System.out.println("Has perdido... Gana la BANCA");
       }
        
    }

    public static int numeroCartaAleatorio() {
       int carta;
       Random r=new Random();
       carta=r.nextInt(10)+1;
       return carta;
    }

    public static int paloCartaAleatorio() {
       int palo;
       Random r=new Random();
       palo=r.nextInt(4)+1;
       return palo;
    }

    public static void imprimirCarta(int carta_aleatoria,int palo_aleatorio) {
        switch (carta_aleatoria) {
            case 8:
                System.out.print("SOTA");
                break;
            case 9:
                System.out.print("CABALLO");
                break;
            case 10:
                System.out.print("REY");
                break;
            default:
                break;
        }
        if(palo_aleatorio==1){
            if(carta_aleatoria<=7){
                System.out.println(carta_aleatoria+" de OROS");
            }
            else{
                System.out.println(" de OROS");
            }
        }
        if(palo_aleatorio==2){
            if(carta_aleatoria<=7){
                System.out.println(carta_aleatoria+" de BASTOS");
            }
            else{
                System.out.println(" de BASTOS");
            }
        }
        if(palo_aleatorio==3){
            if(carta_aleatoria<=7){
                System.out.println(carta_aleatoria+" de ESPADA");
            }
            else{
               System.out.println(" de ESPADA"); 
            }
        }
        if(palo_aleatorio==4){
            if(carta_aleatoria<=7){
                System.out.println(carta_aleatoria+" de COPAS");
            }
            else{
              System.out.println(" de COPAS");  
            }
        }
    }

    public static double puntosCarta(int carta_aleatoria) {
        double num_carta;
        num_carta=carta_aleatoria;
        if(num_carta==8 ||num_carta==9 ||num_carta==10){
            num_carta=(double)0.5;
        }
        return num_carta;
    }

    public static char jugadorContinua() {
        Scanner ent=new Scanner(System.in);
        char seguir='o';
        do{
            System.out.println("Quieres seguir jugando? S/N");
            seguir=ent.nextLine().charAt(0);
            
        }while(!(seguir=='s' || seguir=='S' || seguir=='n' || seguir=='N'));
        return seguir;
    }

    public static boolean bancaPideCarta(double puntuacion_jugador, double puntuacion_banca) {
       if(puntuacion_jugador<=7.5 && puntuacion_banca<puntuacion_jugador){
           return true;
       }
       else if(puntuacion_banca<5.5){
           return true;
       }
       else{
           return false;
       }
    }

    public static boolean ganaJugador(double puntuacion_jugador, double puntuacion_banca) {
        if(puntuacion_jugador>puntuacion_banca && puntuacion_jugador<=7.5 || puntuacion_banca>7.5 && puntuacion_jugador<=7.5){
            return true;
        }
        else{
            return false;
        }
    }
    
}
