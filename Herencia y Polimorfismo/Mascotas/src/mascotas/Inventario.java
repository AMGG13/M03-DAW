/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotas;

import Objetos.Aves;
import Objetos.Mascotas;
import java.util.ArrayList;

/**
 * Esta clase es para sefguir la dinamica de acceso de datos
 * @author Usuario
 */
public class Inventario {
    
    private ArrayList <Mascotas> catalogo;

    public Inventario() {
        this.catalogo = new ArrayList<>();
    }
    
    public void mostrarLista(){
//        for (int i = 0; i < catalogo.size(); i++) {
//            System.out.println(catalogo.get(i).toString());
//        }
        
        for (Mascotas pet : catalogo) {
            System.out.println(pet.toString());
            System.out.println("");
        }
        System.out.println("Hay "+getNumMascotas()+" Mascotas ^^");
    }
    
    public void insertarMascota(Mascotas anyadir){
        //comprobar si ya esta añadido
        //y si no esta añadido hacerlo sino avisar
        //haria falta el equals
        catalogo.add(anyadir);
    }
    
    public int getNumMascotas(){
        return catalogo.size();
    }
    public void vaciarInventario(){
        System.err.println("Se van ha borrar "+getNumMascotas()+" mascotas");
        catalogo.clear();
    }
    
   
    
}
