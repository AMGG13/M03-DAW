/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

import java.util.ArrayList;
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
        System.out.println("NOM---TITOL---DURADA");
        for (int i = 0; i < spotify.size(); i++) {
            System.out.println("Autor: "+spotify.get(i).getAutor()+" Titulo :"+spotify.get(i).getTitulo_cancion()+" Duracion (segundos): "+spotify.get(i).getDurada_segons());
        }
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
    
}
