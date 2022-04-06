/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.io.Serializable;

/**
 *
 * @author alumne
 */
public abstract class Mascotas implements SerVivo, Serializable{
    protected String nombre;
    protected int edat;
    protected boolean estado; //si esta vivo o muerto
    protected int anyo_nacimiento;

    public Mascotas(String nombre, int edat, boolean estado, int anyo_nacimiento) {
        this.nombre = nombre;
        this.edat = edat;
        this.estado = estado;
        this.anyo_nacimiento = anyo_nacimiento;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    
    
    
    
    
    public String getNombre() {
        return nombre;
    }

    public int getEdat() {
        return edat;
    }

    public boolean isEstado() {
        return estado;
    }

    public int getAnyo_nacimiento() {
        return anyo_nacimiento;
    }
    
    
    public void cumpleanyos()
    {
        System.out.println("Tu mascota " + nombre + " nació el año " + anyo_nacimiento);
    }
    
    public void morir()
    {
        this.estado = false;
        System.out.println(" Tu mascota ha perecido.");
    }
    
    protected abstract void habla();
    
    /* Tostring como esta en uml deberia ser abstracto
    pero lo definimos aquí para ahorrarnos codigo
    */

    @Override
    public String toString() {
        return "" + "nombre=" + nombre + ", edat=" + edat + ", estado=" + estado + ", anyo_nacimiento=" + anyo_nacimiento + ", ";
    }

    @Override
    public void respirar() {
        System.out.println("respiro");
    }

    @Override
    public void comer() {
        System.out.println("Como ");
    }
    
    public String datos_cortos()
    {
        String datos="";
        if (this instanceof Canario)
        {
            datos = "Canario ";
        }
        else if (this instanceof Perro)
        {
            datos = "Perro ";
        }
        else if (this instanceof Loro)
        {
            datos = "Loro ";
        }
        else if (this instanceof Gato)
        {
            datos = "Gato ";
        }
        datos = datos + "- " + this.nombre ;
        return datos;
    }
}
