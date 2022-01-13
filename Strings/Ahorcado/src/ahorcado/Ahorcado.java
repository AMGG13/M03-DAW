/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ahorcado;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palabra_oculta;
        int intentos= 7;
        char letra='o';
        Scanner ent = new Scanner (System.in);
        palabra_oculta = pedirPalabra("Pon palabra oculta");
        
        char[] palabras_guiones = new char [palabra_oculta.length()];
        // funcion para inicializar todo a guiones
        inicializarPalabrasGuiones(palabras_guiones);
        //funcion que seria mostrar palabra guiones ----> imprimir
        mostrarGuiones(palabras_guiones);
        //Pedir letra buscar
        letra=pedirLetra(ent);
        boolean existeLetra = buscarLetraEnPalabra(palabra_oculta,letra,palabras_guiones);
        //Buscar la letra en el string, si esta, la copia en el char palabra_guiones y devuelvo true
        
        //Si he devuelto false resto un intento
        
        //mostrar ImprimirGuiones
        mostrarGuiones(palabras_guiones);
        //comprobarsiheganado que es comprobar si existe algun - o no (True/False)
        
    }

    public static String pedirPalabra(String pon_palabra_oculta) {
        System.out.println("Pon palabra oculta");
        Scanner ent = new Scanner (System.in);
        String palabra = ent.nextLine();
        return palabra;
    }
 
    public static void inicializarPalabrasGuiones(char[] palabras_guiones) {
        char guion='-';
        for (int i = 0; i < palabras_guiones.length; i++) {
            palabras_guiones[i] = guion;
        }
    }

    public static void mostrarGuiones(char[] palabras_guiones) {
        for (int i = 0; i < palabras_guiones.length; i++) {
            System.out.print(palabras_guiones[i]);
        }
        System.out.println("");
    }

    public static char pedirLetra(Scanner ent) {
        char letra;
        System.out.println("Introduzca letra");
        letra=ent.nextLine().charAt(0);
        return letra;
    }

    public static boolean buscarLetraEnPalabra(String palabra_oculta, char letra, char[] palabras_guiones) {
        int posicion=0;
        for (int i = 0; i < palabra_oculta.length(); i++) {
            palabra_oculta()[i];
        posicion=palabra.indexOf(letra);
        System.out.println(posicion);
            if(posicion==-1){
                return false;
            }
            else{
                if(i==posicion){
                    palabras_guiones[i]=letra;
                }
            }
        }
        return true;
        }
    }


