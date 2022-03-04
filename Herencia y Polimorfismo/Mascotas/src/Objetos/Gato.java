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
    private String pelo_largo;

    public Gato(String color, String pelo_largo, String nombre, int edad, int fechaNacimiento) {
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

    public String getPelo_largo() {
        return pelo_largo;
    }

    public void setPelo_largo(String pelo_largo) {
        this.pelo_largo = pelo_largo;
    } 
    
    @Override
    public String toString() {
        return"Nombre:"+this.nombre+"\n"
                + "Edad:"+this.edad+"\n"
                + "Estado:"+this.estado+"\n"
                + "Nacimiento:"+this.fechaNacimiento+"\n"
                + "Color:"+this.color+"\n"
                + "Pelo largo:"+this.pelo_largo;
    }

    @Override
    public void hablar() {
        System.out.println("Miau Miau");
    }
    
}
