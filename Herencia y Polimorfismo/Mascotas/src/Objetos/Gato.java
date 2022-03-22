/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author alumne
 */
public class Gato extends Mascotas {
    private String color;
    private boolean pelo_largo;

    public Gato(String color, boolean pelo_largo, String nombre, int edad, int fechaNacimiento) {
        super(nombre, edad, fechaNacimiento);
        this.color = color;
        this.pelo_largo = pelo_largo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getPelo_largo() {
        return pelo_largo;
    }

    public void setPelo_largo(boolean pelo_largo) {
        this.pelo_largo = pelo_largo;
    } 
    
    @Override
    public String toString() {
        return"GATO\n"
                + "Nombre:"+this.nombre+"\n"
                + "Edad:"+this.edad+"\n"
                + "Estado:"+this.estado+"\n"
                + "Nacimiento:"+this.fechaNacimiento+"\n"
                + "Color:"+this.color+"\n"
                + "Pelo largo:"+this.pelo_largo;
    }

    @Override
    public String datosCortos() {
        return super.datosCortos(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void hablar() {
        System.out.println("Miau Miau");
    }
    
}
