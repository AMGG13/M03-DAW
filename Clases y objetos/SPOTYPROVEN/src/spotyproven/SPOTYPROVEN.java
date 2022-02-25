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
        int opcion;
        //bucle con el menu
        spotify.add(new Cancion("t1", "autor1", "album1", 111));
        spotify.add(new Cancion("t2", "autor2", "album1", 111));
        spotify.add(new Cancion("t3", "autor3", "album1", 111));
        spotify.add(new Cancion("t4", "autor4", "album1", 111));
        spotify.add(new Cancion("t5", "autor5", "album2", 111));
        spotify.add(new Cancion("t7", "autor7", "album2", 111));
        spotify.add(new Cancion("t8", "autor8", "album3", 111));
        spotify.add(new Cancion("t6", "autor6", "album2", 111));
        do {            
            opcion=mostrarMenu();
            //opcion=1;
            switch (opcion) {
                case 1:
                    utils.InsertarCancion(spotify);
                    break;
                case 2:
                    utils.borrarCancion(spotify);
                    break;
                case 3:
                    utils.listarCancion(spotify);
                    break;
                case 4:
                    utils.listarCancionesAlbum(spotify);
                    break;
                case 5:
                    ArrayList<Cancion> lista_dinamica = new ArrayList<>();
                    utils.generarListaCancionDinamica(spotify,lista_dinamica);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    break;
            }
        }while (opcion!=6);

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
        return opcion;
    }
}
