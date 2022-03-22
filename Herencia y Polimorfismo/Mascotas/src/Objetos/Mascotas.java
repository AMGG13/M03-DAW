/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.Objects;

/**
 *
 * @author alumne
 */
public abstract class Mascotas implements SerVivo {
    protected String nombre;
    protected String tipo_mascota;
    protected int edad;
    protected String estado;
    protected int fechaNacimiento;

    public Mascotas(String nombre, int edad, int fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = "Vivo";
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if(estado.equalsIgnoreCase("vivo") || estado.equalsIgnoreCase("muerto") ){
            this.estado = estado;
        }
        else{
            System.err.println("solo puede estar vivo o muerto, por defecto estara vivo");
            this.estado = "vivo";
        }
            
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    

    @Override
    public abstract String toString();
    
    public void cumpleaños(){
        System.out.println(this.nombre+" Nacio en"+this.fechaNacimiento); 
    }
    public void morir(Boolean e){
        if (e){
            this.estado = "Muerto";
        }
        else{
            this.estado = "Vivo";
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mascotas other = (Mascotas) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    
    public String datosCortos(){
        String datos="";
        if(this instanceof Loro){
            datos="Loro ";
        }
        else if (this instanceof Canario){
            datos="Canario ";
        }
        else if (this instanceof Perro){
            datos="Perro ";
        }
        else if (this instanceof Gato){
            datos="Gato ";
        }
        datos+=this.nombre;
        return datos;
    }
    protected abstract void hablar(); 

    @Override
    public void respirar() {
        System.out.println("Respiro*");
    }

    @Override
    public void comer() {
        System.out.println("Como*");
    }
}
