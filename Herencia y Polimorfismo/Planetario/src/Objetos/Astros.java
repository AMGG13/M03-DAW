/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author alumne
 */
public class Astros {
    protected String nombre;
    protected double rotacion;
    protected double masa;

    public Astros(String nombre, double rotacion, double masa) {
        this.nombre = nombre;
        this.rotacion = rotacion;
        this.masa = masa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getRotacion() {
        return rotacion;
    }

    public void setRotacion(double rotacion) {
        this.rotacion = rotacion;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    @Override
    public String toString() {
        return "Astros{" + "nombre=" + nombre + ", rotacion=" + rotacion + ", masa=" + masa + '}';
    }
    
    
}
