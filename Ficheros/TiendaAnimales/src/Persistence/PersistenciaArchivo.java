/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistence;

import Objetos.Mascotas;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import tiendaanimales.TiendaAnimales;

/**
 *
 * @author alumne
 */
public class PersistenciaArchivo {
    
    private static final String file= "catalogo.dat";
    public static boolean saveAllItems(ArrayList<Mascotas> tienda) throws FileNotFoundException, IOException{
        FileOutputStream escritura;
        ObjectOutputStream StreamDatos;
        escritura = new FileOutputStream(file);
        StreamDatos = new ObjectOutputStream(escritura);
        StreamDatos.writeObject(tienda);
        return true;
    }
}
