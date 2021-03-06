/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class CancionDAO {

    public boolean InsertarCancion(ArrayList<Cancion> spotify) {
        //pedir datos clave
        Scanner ent = new Scanner(System.in);
        String titulo;
        String autor;
        String album;
        int durada;
        System.out.println("Cual es el titulo?");
        titulo = ent.nextLine();
        System.out.println("Quien es el autor?");
        autor= ent.nextLine();
        Cancion aux = new Cancion(titulo, autor);
        //buscar si existe
        //si existe, avisar que no lo insertara
        //si no existe pedir los otros datos
        if (spotify.contains(aux)){
            System.out.println("Cancion ya existente");
            return false;
        }
        else{
            System.out.println("Cual es el album?");
            album=ent.nextLine();
            System.out.println("Cuanto dura la cancion?");
            durada= ent.nextInt();
            Cancion auxdefinitivo = new Cancion(titulo, autor, album, durada);
            //insertar en la lista
            spotify.add(auxdefinitivo);
            //returnar true si se ha añadido y false si no se a añadido
            System.out.println("La cancion se ha añadido correctamente");
            return true;
        }
    }

    public void listarCancion(ArrayList<Cancion> spotify) {
        for (int i = 0; i < spotify.size(); i++) {
            System.out.println(spotify.get(i).toString());
        }
        System.out.println("Canciones:"+spotify.size());
    }

    public boolean borrarCancion(ArrayList<Cancion> spotify) {
        Scanner ent = new Scanner(System.in);
        String titulo;
        String autor;
        System.out.println("Titulo de la cancion que quieres eliminar");
        titulo=ent.nextLine();
        System.out.println("Autor de la cancion que quieres eliminar");
        autor= ent.nextLine();
        Cancion aux = new Cancion(titulo, autor);
        if (spotify.contains(aux)){
            System.out.println("Cancion Borrada");
            spotify.remove(aux);
            return true;
        }
        else{
            System.err.println("[-]La cancion no existe en tu lista de canciones");
            return false;
        }
        
    }

    public void listarCancionesAlbum(ArrayList<Cancion> spotify) {
        Scanner ent = new Scanner(System.in);
        System.out.println("De que album quieres ver las camciones");
        String album=ent.nextLine();
        int cont=0;
        for (int i = 0; i < spotify.size(); i++) {
            if (spotify.get(i).getAlbum().equalsIgnoreCase(album)){
                System.out.println(spotify.get(i).toString());
                cont++;
            }
        }
        System.out.println("Canciones:"+cont);
        
    }

    public void generarListaCancionDinamica(ArrayList<Cancion> spotify, ArrayList<Cancion> lista_dinamica) {
        Random r = new Random();
        int cancion1 = r.nextInt(spotify.size());
        int cancion2 = r.nextInt(spotify.size());
        int cancion3 = r.nextInt(spotify.size());
        
        lista_dinamica.add(spotify.get(cancion1));
        lista_dinamica.add(spotify.get(cancion2));
        lista_dinamica.add(spotify.get(cancion3));
        
        for (int i = 0; i < lista_dinamica.size(); i++) {
            System.out.println(lista_dinamica.get(i).toString());
        }
        System.out.println("Canciones:"+lista_dinamica.size());
    }
    
}
