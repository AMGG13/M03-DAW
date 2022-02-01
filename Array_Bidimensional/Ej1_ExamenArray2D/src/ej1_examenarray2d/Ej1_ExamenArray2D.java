/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1_examenarray2d;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej1_ExamenArray2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
         int[][] CrystalBridge = new int[5][2];
         int fila_actual=0,columna_elejida;
        boolean safe=false;
        String nombre=askName();
        fillSafeBox(CrystalBridge);
        int columna_elegida=0;
        mostrarPuente(CrystalBridge);
         do{
         columna_elejida=chooseBox(CrystalBridge,nombre,fila_actual);
         safe=stillSafe(CrystalBridge,fila_actual,columna_elejida);
         if(safe){
             System.out.println("ACERTASTE!");
         }
         else{
             System.out.println("El cristal se ha roto... GG");
         }
         showBridgeStatus(CrystalBridge);
             System.out.println(safe);
         }while(!(safe=false || fila_actual>=5));
         System.out.println("Felicidades has ganado 100.000.000€");
    }
     /**
     * askName pide tu nombre y lo retorna el nombre en mayusculas
     * si el usuario no responde o sea lo deja en blanco, debe seguir pidiendo
     * el nombre
     * @return devuelve el string en mayusculas
     */
    private static String askName() {
        String name;
        do{
        Scanner ent = new Scanner (System.in);
        System.out.println("Ingrese su nombre");
        name=ent.nextLine();
        }while((name.equals("")));
        name=name.toUpperCase();
        return name;
    }
    
     /**
     * fillSafeBoxes
     * En cada fila, se marcara un sitio de los dos posibles como zona segura (1)
     * la eleccion es aleatoria.
     * @param CrystalBridge 
     */
    private static void fillSafeBox(int[][] CrystalBridge) {
        Random r= new Random();
        int random;
        for (int columna = 0; columna < CrystalBridge[0].length; columna++) {
            for (int fila = 0; fila < CrystalBridge.length; fila++) {
                random=r.nextInt(2);
                if(random==1){
                CrystalBridge[fila][1]=1;
                CrystalBridge[fila][0]=0;
                }
                else if(random==0){
                CrystalBridge[fila][0]=1;
                CrystalBridge[fila][1]=0;
                }
            }
        }
    }


    private static void mostrarPuente(int[][] CrystalBridge) {
        for (int fila = 0; fila < CrystalBridge.length; fila++) {
            for (int columna = 0; columna < CrystalBridge[0].length; columna++) {
                System.out.print(CrystalBridge[fila][columna]+" ");
            }
            System.out.println("");
        }
    }
    
     /**
     * showBridgeStatus Muestra el puente falseado
     * si las casillas son lugares por descubrir aún mostrara ("█" + " ")
     * si la casilla es un lugar pisado y era seguro("O" + " ")
     * y si es un lugar donde se ha caio se mostrara ("X" + " ")
     * @param CrystalBridge  
     */
    private static void showBridgeStatus(int[][] CrystalBridge) {
         for (int fila = 0; fila < CrystalBridge.length; fila++) {
            for (int columna = 0; columna < CrystalBridge[0].length; columna++) {
             if(CrystalBridge[fila][columna]==0 || CrystalBridge[fila][columna]==1){
                 System.out.print("█"+ "");
             }
             else if(CrystalBridge[fila][columna]==3){
                 System.out.print("O"+ "");
             }
             else if (CrystalBridge[fila][columna]==2){
                 System.out.print("X"+ "");
             }
             
            }
            System.out.println("");
        }       
    }

     /**
     * chooseBox: Pregunta al jugador que lado elige para saltar
     * las opciones validas son izquierda/derecha (string) , de cualquier forma escrita
     * si no pone estas opciones, seguira pidiendo que pongas el lado
     * @param fila donde vas a elegir, solo sirve para el display de elige fila xxxx
     * @param nom nombre del jugador
     * @return devuelve la posición elegida en tipo entero, contando que la fila solo tiene
     * dos columnas, la 0 o la 1.
     */
    private static int chooseBox(int[][] CrystalBridge, String nombre, int fila_actual) {
        String left_right;
        Scanner ent = new Scanner (System.in);
        do{
        System.out.println(nombre+" Izquierda o derecha?");
        left_right=ent.nextLine();
        }while(!(left_right.equalsIgnoreCase("izquierda")||left_right.equalsIgnoreCase("derecha")));
        System.out.println("vas a saltar al cristal "+(fila_actual+1)+" de la "+left_right);
        if(left_right.equalsIgnoreCase("izquierda")){
            return 0;
        }
        else if(left_right.equalsIgnoreCase("derecha")){
            return 1;
        }
        else{
            return -1;
        }
        
    }

     /**
     * stillAlive: función que recibe la fila del puente done se encuentra y el lado que ha votado
     * el jugador, si ese sitio es un lugar seguro (1), marca la casilla como pasada (3) 
     * y devuelve que estas vivo (true)
     * en cambio si una casilla que se rompe (0), la marca como casilla rota(2) y devuelve muerto(false)
     * cualquier otra opción posible, retornas falso (mueres)
     * Ayuda no tiene que recorrer todo el tablero porque sabemos que casilla queremos comprobar
     * @param CrystalBridge tablero bidimensional
     * @param fila entero que refleja la fila a la que va a saltar el jugador
     * @param lado entero que indica cual de los dos lados ha elegido el jugaodpr
     * @return true(vivo) false (muerto
     */
    private static boolean stillSafe(int[][] CrystalBridge, int fila_actual, int columna_elejida) {
        for (int fila = 0; fila < CrystalBridge.length; fila++) {
            for (int columna = 0; columna < CrystalBridge[0].length; columna++) {
                if(CrystalBridge[fila_actual][columna_elejida]==1){
                    CrystalBridge[fila_actual][columna_elejida]=3;    
                    return true;
                }
                else if(CrystalBridge[fila_actual][columna_elejida]==0){
                    CrystalBridge[fila_actual][columna_elejida]=2;    
                    return false;
                }   
            }
        }
        return true;
    }
}
