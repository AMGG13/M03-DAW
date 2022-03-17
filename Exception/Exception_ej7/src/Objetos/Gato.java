/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author Usuario
 */
public class Gato {
   private String nombre;
   private int edad;

    public Gato(String nombre, int edad)throws Exception {
        if(nombre.length()<=3){
            throw new Exception("nombre invalido con 3 o menos caracteres: "+nombre);
        }
        this.nombre = nombre;
        if(edad<0){
            throw new Exception ("La edad no puede ser negativa: "+edad);
        }
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre)throws Exception {
        if(nombre.length()>3){
            this.nombre = nombre;
        }
        else{
            throw new Exception ("nombre de 3 o menos caracteres: "+nombre);
        }
        
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad)throws Exception {
        if(edad<0){
            throw new Exception ("La edad no puede ser negativa: "+edad);
        }
        else{
        this.edad = edad;
        }
    }
    
    public void mostrarDatos(){
        if(getNombre().length()>3){
            System.out.println("Nombre:"+getNombre()+"  Edad:"+getEdad());
        }
        else{
            System.err.println("Este gato tiene un nombre de 3 o menos caracteres");
        }
    }
}
