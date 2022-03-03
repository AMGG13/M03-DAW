/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public abstract class Inventario extends Aves {
    
    private ArrayList <Aves> inventario = new ArrayList<>();
    
    public void mostrarAnimales(){
        for (int i = 0; i < inventario.size(); i++) {
            
        }
    }
    
    public Inventario(String pico, int volar, String nombre, int edad, int fechaNacimiento) {
        super(pico, volar, nombre, edad, fechaNacimiento);
    }
    
   
    
}
