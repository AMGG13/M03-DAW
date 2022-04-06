/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author alumne
 */
public final class Canario extends Aves {

    private  boolean canta;

    public Canario( String nombre, int edat, boolean estado, int anyo_nacimiento, int pico, boolean vuela, boolean canta) {
        super(nombre, edat, estado, anyo_nacimiento, pico, vuela);

        this.canta = canta;
    }
    
    
    



    public boolean isCanta() {
        return canta;
    }

    @Override
    public String toString() {
        String mascota = super.toString();
        return "Canario{" + mascota +  ", canta=" + canta + '}';
    }

    @Override
    protected void volar() {
        if (this.vuela)
        {
            System.out.println("estoy volando");
        }
        else
        {
            System.out.println("camino");
        }
    }

    @Override
    public void respirar() {
        super.respirar();
        System.out.println("respiro por el pico");
    }

    @Override
    protected void habla() {
        System.out.println("Piu piu ");
    }
    
    
    
    
}
