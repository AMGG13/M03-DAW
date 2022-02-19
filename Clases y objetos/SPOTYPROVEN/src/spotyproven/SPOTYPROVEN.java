/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package spotyproven;

import Objects.Cancion;
import Objects.CancionDAO;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class SPOTYPROVEN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Cancion> spotify = new ArrayList<Cancion>();
        CancionDAO utils = new CancionDAO();
        
        //bucle con el menu
        int opcion=mostrarMenu();
        //opcion=1;
        if(opcion==1){
            utils.InsertarCancion(spotify);  
        }
        //opcion=2
        if(opcion==2){
            utils.borrarCancion(spotify);
        }
        //opcion=3;
        if(opcion==3){
            utils.listarCancion(spotify);
        }
    }
    
    
    //menu

    private static int mostrarMenu() {
        System.out.println("1. Inserir Canción\n" +
"2. Esborrar Canción\n" +
"3. Llistar Canciónns\n" +
"4. Llistar Canciónns d'un àlbum\n" +
"5. Generar Llista de Canciónns dinàmica per reproduir\n" +
"6. Sortir");
        Scanner ent = new Scanner (System.in);
        int opcion;
        opcion=ent.nextInt();
        return 0;
    }
}
