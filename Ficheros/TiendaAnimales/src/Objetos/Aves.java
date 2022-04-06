/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author alumne
 */
public abstract class Aves extends Mascotas {
    protected int pico;
    protected boolean vuela;

    public Aves(String nombre, int edat, boolean estado, int anyo_nacimiento,int pico, boolean vuela) {
        super(nombre, edat, estado, anyo_nacimiento);
        this.pico = pico;
        this.vuela = vuela;
    }

    
    
    public int getPico() {
        return pico;
    }

    public boolean isVuela() {
        return vuela;
    }

    protected abstract void volar();

    @Override
    public String toString() {
        String Mascotas = super.toString();
        return " " + Mascotas + "pico=" + pico + ", vuela=" + vuela + '}';
    }
    
    
    
}
