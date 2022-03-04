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

    private String color;
    private boolean canta;

    public Canario(String color, boolean canta, String pico, int volar, String nombre, int edad, int fechaNacimiento) {
        super(pico, volar, nombre, edad, fechaNacimiento);
        this.color = color;
        this.canta = canta;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCanta() {
        return canta;
    }

    public void setCanta(boolean canta) {
        this.canta = canta;
    }
    
    @Override
    public void volar(int distancia) {
       this.volar+=distancia;
    }

    @Override
    public String toString() {
        return"Nombre:"+this.nombre+"\n"
                + "Edad:"+this.edad+"\n"
                + "Estado:"+this.estado+"\n"
                + "Nacimiento:"+this.fechaNacimiento+"\n"
                + "Color:"+this.color+"\n"
                + "Canta:"+this.canta;
    }

    @Override
    public void hablar() {
        System.out.println("Pio Pio");
    }
    
}
