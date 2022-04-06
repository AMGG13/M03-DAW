/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaanimales;

import Objetos.Mascotas;
import Persistence.PersistenciaArchivo;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta clase seria para seguir la dinamica de accceso de datos (DAO)
 * @author alumne
 */
public class Inventario {
    private ArrayList<Mascotas> catalogo;

    public Inventario() {
        this.catalogo = new ArrayList<Mascotas>();
    }

    public ArrayList<Mascotas> getCatalogo() {
        return catalogo;
    }
    
    public int getNumMascotas()
    {
        return catalogo.size();
    }
    
    public void MostrarListaAnimales()
    {
//        for (int i = 0; i < catalogo.size(); i++) {
//            System.out.println(catalogo.get(i).toString());            
//        }
       
        for (Mascotas pet : catalogo) {
            System.out.println(pet.toString());
        }
        
        
        System.out.println("numero de mascotas " + getNumMascotas());
    }
    
    public void MostrarListaAnimalesCortos() {
        for (Mascotas pet : catalogo) {
            System.out.println(pet.datos_cortos());
        }
        
        
        System.out.println("numero de mascotas " + getNumMascotas());
        
    }
    
    
    
    public void VaciarInventario()
    {
        catalogo.clear();
        
        System.out.println("He borrado todos los elemenots");
    }
    
    
    public void InsertarAnimal(Mascotas anyadir)
    {
        //comprobar si ya esta añadido
        //y si no esta añadido hacerlo sino avisar
        //haria falta el equals
        catalogo.add(anyadir);
     //   Iterator t;
        
    }

    /**
     * devuelve el animal que esta en la posición pedida
     * @param posicion
     * @return animal o null
     */
    Mascotas MostrarAnimalPorPosicion(int posicion) {
         
//        if (posicion>=0 && posicion < catalogo.size())
//        {
//            return catalogo.get(posicion);
//        }
//          else
//            return null;

        
        try
        {
            return catalogo.get(posicion);
        }
        catch(IndexOutOfBoundsException IOB)
        {
            
            return null;
        }
    }

    /**
     * Busca el animal que tiene el nombre pasado
     * @param nombre
     * @return animal encontrado o null si no lo encuentra
     */
    public Mascotas getAnimalNombre(String nombre) {
        for (Mascotas pet : catalogo) {
            if (pet.getNombre().equalsIgnoreCase(nombre))
            {
                return pet; //lo encontre en alguna posición
            }
        }
        return null;
       
        
    }
    
    /**
     * borrar posicion del array list
     * @param posicion
     * @return Mascotas or null
     */

    Mascotas EliminarAnimalPosicion(int posicion) {
        try
        {
        return catalogo.remove(posicion);
        }
        catch(IndexOutOfBoundsException ex)
        {
            return null;
        }
    }

    public Mascotas BorrarAnimalPorNombre(String nom) {
        //busco el animal por su nombre
        for (int i = 0; i < catalogo.size(); i++) {
            if (catalogo.get(i).getNombre().equalsIgnoreCase(nom))
            {
                return catalogo.remove(i); //devuelve el objeto borrado o null
            }
        }
        return null;
    }

    public boolean cambiarEdadAnimalPorNombre(String nom, int edad) {
        for (int i = 0; i < catalogo.size(); i++) {
            if (catalogo.get(i).getNombre().equalsIgnoreCase(nom))
            {
                catalogo.get(i).setEdat(edad); //devuelve el objeto borrado o null
                return true;
            }
        }
        return false;
    }

    public int saveItemsToFile() throws IOException {
        if(PersistenciaArchivo.saveAllItems(catalogo)){
            return catalogo.size();
        }else
        return 0;
    }


}
