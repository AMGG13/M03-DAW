/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array_string_clashroyale;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Array_String_ClashRoyale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] cartas=new String[20];
        String[] mazo=new String[8];
        int carta_escogida;
        inicializar20cartas(cartas);
        //Inicializar 20 cartas
        //Mostrar 2 randoms con 2 cartas
        for (int i = 0; i < mazo.length; i++) {
        
        carta_escogida = mostrar2Cartas(cartas,mazo);
        //Escoger numero de carta
        
        //Colocar en el mazo la carta elegida
        colocarCartaEscogida(carta_escogida,cartas,mazo,i);
        }
        mostrarMazo(mazo);
    }

    public static void inicializar20cartas(String[] cartas) {
        cartas[0] ="El tronco";
        cartas[1] ="Ejército de esqueletos";
        cartas[2] = "Barril de duendes";
        cartas[3] ="Valquiria";
        cartas[4] ="Megacaballero";
        cartas[5] ="Mini P.E.K.K.A.";
        cartas[6] ="Bola de fuego";
        cartas[7] ="Bebé dragón";
        cartas[8] ="Descarga";
        cartas[9] ="Bruja";
        cartas[10] ="Flechas";
        cartas[11] ="Mago eléctrico";
        cartas[12] ="Montapuercos";
        cartas[13] ="Mago";
        cartas[14] ="Mosquetera";
        cartas[15] ="Princesa";
        cartas[16] ="Caballero";
        cartas[17] ="Dragón infernal";
        cartas[18] ="Murciélagos";
        cartas[19] ="Globo bombástico";
    }

    public static int mostrar2Cartas( String[] cartas, String[] mazo) {
        Random r1= new Random();
        Random r2= new Random();
        int carta2=0,carta1=0;
        boolean existe;
        int carta_escogida;
        do{
        carta1=r1.nextInt(19);
        carta2=r2.nextInt(19);
        existe=existenMazo(carta1,carta2,mazo,cartas);
        if(carta1 == carta2){
            existe=true;
        }
        
        }while(!(existe==false));
        System.out.println("CARTAS POSIBLES");
        System.out.println((carta1)+"-  "+cartas[carta1]);
        System.out.println((carta2)+"-  "+cartas[carta2]);
        carta_escogida=escogerNumeroCarta(carta1,carta2);
        return carta_escogida;
    }

    public static int escogerNumeroCarta(int carta1, int carta2) {
        int opcion;
        Scanner sc=new Scanner(System.in);
        do{
        System.out.println("Escoga una carta");
        opcion=sc.nextInt();
        }while(!(opcion == carta1 || opcion == carta2));
        return opcion;     
    }

    private static void colocarCartaEscogida(int carta_escogida, String[] cartas, String[] mazo, int i) {
       mazo[i]=cartas[carta_escogida];
    }

    private static void mostrarMazo(String[] mazo) {
        System.out.println("tu mazo es:");
        for (int i = 0; i < mazo.length; i++) {
            System.out.println(mazo[i]);
        }
    }

    private static void mostrarTodas(String[] cartas) {
        for (int i = 0; i < cartas.length; i++) {
            System.out.println(cartas[i]);
        }
    }

    private static boolean existenMazo(int carta1, int carta2, String[] mazo, String[] cartas) {
        for (int i = 0; i < mazo.length; i++) {
           if(cartas[carta1].equalsIgnoreCase(mazo[i])  || cartas[carta2].equalsIgnoreCase(mazo[i])){
               return true;
           } 
        }
        return false;
    }
    
}
