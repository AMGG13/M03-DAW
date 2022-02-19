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
        if(aux.cancionRepetida(spotify)){
            System.out.println("Esta cancion ya existe en la lista.");
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
            System.out.println(spotify.get(i).getAutor()+"---"+spotify.get(i).getTitulo_cancion()+"---"+spotify.get(i).getDurada_segons());
        }
    }

    public void borrarCancion(ArrayList<Cancion> spotify) {
        Scanner ent = new Scanner(System.in);
        String titulo;
        String autor;
        System.out.println("Titulo de la cancion que quieres eliminar");
        titulo=ent.nextLine();
        System.out.println("Autor de la cancion que quieres eliminar");
        autor= ent.nextLine();
    }
    
}
