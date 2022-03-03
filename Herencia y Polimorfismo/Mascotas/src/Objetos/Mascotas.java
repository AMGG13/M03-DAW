/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author alumne
 */
public abstract class Mascotas {
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

    @Override
    public abstract String toString();
    
    public String cumpleaños(){
        return "Es del año "+this.fechaNacimiento;
    }
    public void morir(Boolean e){
        if (e){
            this.estado = "Muerto";
        }
        else{
            this.estado = "Vivo";
        }
    }
    public abstract void hablar();  
}
