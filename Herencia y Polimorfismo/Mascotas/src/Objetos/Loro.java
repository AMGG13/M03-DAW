/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author alumne
 */
public final class Loro extends Aves {
    private String origen;
    private boolean habla;

    public Loro(String origen, boolean habla, String pico, int volar, String nombre, int edad, int fechaNacimiento) {
        super(pico, volar, nombre, edad, fechaNacimiento);
        this.origen = origen;
        this.habla = habla;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public boolean isHabla() {
        return habla;
    }

    public void setHabla(boolean habla) {
        this.habla = habla;
    }

    @Override
    public void volar(int distancia) {
        this.volar+=distancia;
        System.out.println(this.volar);
    }

    @Override
    public String toString() {
        return"Nombre:"+this.nombre+"\n"
                + "Edad:"+this.edad+"\n"
                + "Estado:"+this.estado+"\n"
                + "Nacimiento:"+this.fechaNacimiento+"\n"
                + "Origen:"+this.origen+"\n"
                + "Habla:"+this.habla;
    }

    @Override
    public void hablar() {
        if (habla){
            System.out.println("Hola como estas?");
        }
        else{
            System.out.println("Pio Pio Pio...");
        }
    }
    
}
