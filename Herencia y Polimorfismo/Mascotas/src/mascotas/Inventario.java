/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotas;

import Objetos.Aves;
import Objetos.Mascotas;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Esta clase es para sefguir la dinamica de acceso de datos
 * @author Usuario
 */
public class Inventario {
    static Scanner ent = new Scanner (System.in);
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
    public void mostrarDatosCortos(){
        for (Mascotas mascotas : catalogo) {
            System.out.println(mascotas.datosCortos());
        }
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

    public String mostrarAnimalConcreto(String nombre) {
        for (int i = 0; i < catalogo.size(); i++) {
            if(catalogo.get(i).getNombre().equalsIgnoreCase(nombre)){
                return catalogo.get(i).toString();
            }
        }
        return "No existe";
        
    }

    public String borrarAnimal(String nombre) {
        for (int i = 0; i < catalogo.size(); i++) {
            if(catalogo.get(i).getNombre().equalsIgnoreCase(nombre)){
                 catalogo.remove(i);
                 return "Se ha eliminado a "+nombre+" exitosamente\n"+
                 "Quedan "+getNumMascotas()+ " Animales.";
            }
        }
        
        return "Animal no existente.";
               
    }

    Boolean existeNombre(String nombre) {
        for (int i = 0; i < catalogo.size(); i++) {
            if(catalogo.get(i).getNombre().equalsIgnoreCase(nombre)){
                 return true;
            }
        }
        return false;
    }

    void actualizarEdad(int edad,int indice) {
        catalogo.get(indice).setEdad(edad);
    }

    int indiceNombre(String nombre) {
        int i;
        for ( i = 0; i < catalogo.size(); i++) {
            if(catalogo.get(i).getNombre().equalsIgnoreCase(nombre)){
                 return i;
            }
        }
        i=-1;
        return i;
    }
    

    
   
    
}
