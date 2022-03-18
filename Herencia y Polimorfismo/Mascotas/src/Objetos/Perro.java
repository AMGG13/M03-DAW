/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author alumne
 */
public class Perro extends Mascotas {
    
    private final String raza;
    private boolean pulgas;

    public Perro(String raza, boolean pulgas, String nombre, int edad, String estado, int fechaNacimiento) {
        super(nombre, edad, fechaNacimiento);
        this.raza = raza;
        this.pulgas = pulgas;
    }

    public boolean isPulgas() {
        return pulgas;
    }

    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
    }

    public String getRaza() {
        return raza;
    }
    
    @Override
    public void hablar() {
        System.out.println("Guau Guau");
    }

    @Override
    public String toString() {
        return"PERRO\n"
                + "Nombre:"+this.nombre+"\n"
                + "Edad:"+this.edad+"\n"
                + "Estado:"+this.estado+"\n"
                + "Nacimiento:"+this.fechaNacimiento+"\n"
                + "Raza:"+this.raza+"\n"
                + "Pulgas:"+this.pulgas;
    }

    @Override
    public String datosCortos() {
        return super.datosCortos(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
