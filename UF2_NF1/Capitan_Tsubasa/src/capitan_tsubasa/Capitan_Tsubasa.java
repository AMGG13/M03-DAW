/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capitan_tsubasa;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Capitan_Tsubasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int gol_jugador=0;
        int gol_maquina=0; 
        int ronda=1;
        boolean seguir_jugando=false;
        do{
        int posicionJugador=posicionJugadorUsuario(ronda);
        if(posicionJugador==2){
            System.out.println("Eres futbolista"); 
        }
        if(posicionJugador==1){
            System.out.println("Eres portero");
            ronda++;
        }
        int lado_jugador=elegirLadoJugador();
        int lado_maquina=elegirLadoMaquina();
        mostrarLado(lado_jugador,lado_maquina);
        boolean gol=hayGol(lado_jugador,lado_maquina); 
        if(gol==true && posicionJugador==2)
        {
            gol_jugador++;
        }
        else if(gol==true && posicionJugador==1)
        {
            gol_maquina++;
        }
            System.out.println(gol_maquina+"-"+gol_jugador);
        marcador(gol_jugador,gol_maquina);
        seguir_jugando=hayQueSeguirTirando(gol_jugador,gol_maquina,ronda);
        }while(!(seguir_jugando=false || ronda==5));
        if(gol_jugador>gol_maquina)
        {
            System.out.println("Felicidades has ganado");
        }
        else if(gol_jugador<gol_maquina)
        {
            System.out.println("Has perdido");
        }
        else if(gol_jugador==gol_maquina)
        {
            System.out.println("Empate");
        }
    }

    public static int elegirLadoJugador() {
        int lado;
        Scanner ent=new Scanner(System.in);
        do{
        System.out.println("elije la jugada 3-Left,4-Right,5-Center");
        lado=ent.nextInt();
        }while(!(lado>=3 && lado<=5));
        // el bucle terminara cuando lado=>3 && lado<=5
        return lado;
    }

    public static int elegirLadoMaquina() {
        int lado;
        Random random = new Random();
        lado=random.nextInt(3)+3;
        return lado;
        
    }

    public static void mostrarLado(int lado_jugador, int lado_maquina) {
        switch (lado_jugador) {
            case 3:
                System.out.println("El jugador ha elegido por la izquierda");
                break;
            case 4:
                System.out.println("El jugador ha elegido por la derecha");
                break;
            case 5:
                System.out.println("El jugador ha elegido por el Centro");
                break;
            default:
                break;
        }
        switch (lado_maquina) {
            case 3:
                System.out.println("La maquina ha elegido por la izquierda");
                break;
            case 4:
                System.out.println("La maquina ha elegido por la derecha");
                break;
            case 5:
                System.out.println("La maquina ha elegido por el centro");
                break;
            default:
                break;
        }
        
    }

    public static boolean hayGol(int lado_jugador, int lado_maquina) {
         if(lado_jugador==lado_maquina){
             System.out.println("PARADÓN");
             return false;
         }
         else if(lado_jugador!=lado_maquina){
             System.out.println("GOOOOOOOL!!!");
             return true;
         }
         else{
             return false;
         }
             
             
    }

    public static void marcador(int gol_jugador, int gol_maquina) {
        System.out.println("******************");
        System.out.println("*                *");
        System.out.println("*   Jugador "+gol_jugador+"    *");
        System.out.println("*   Maquina "+gol_maquina+"    *");
        System.out.println("*                *");
        System.out.println("******************");
    }

    public static boolean hayQueSeguirTirando(int gol_jugador, int gol_maquina, int ronda) {
         int dif;
         int suma;
         if(gol_jugador>gol_maquina){
             dif=gol_jugador-gol_maquina;
         }
         else{
             dif=gol_maquina-gol_jugador;
         }
         suma=dif+ronda;
         if(suma<ronda){
             return true;
         }
         else if(suma>ronda){
             return false;
         }
         else{
             return false;
         }
         
    }

    public static int posicionJugadorMaquina(int ronda) {
        switch (ronda) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
                return 1;
            default:
                return 0;
        }
    }

    public static int posicionJugadorUsuario(int ronda) {
        switch (ronda) {
            case 1:
                return 2;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 1;
            case 5:
                return 2;
            default:
                return 0;
        }
    }
    
}
