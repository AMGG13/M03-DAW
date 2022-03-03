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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if(estado.equalsIgnoreCase("vivo") || estado.equalsIgnoreCase("muerto") ){
            this.estado = estado;
        }
        else{
            System.err.println("solo puede estar vivo o muerto, por defecto estara vivo");
            this.estado = "vivo";
        }
            
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    

    @Override
    public void hablar() {
        System.out.println("Guau");
    }

    @Override
    public String toString() {
        return"Nombre:"+this.nombre+"\n"
                + "Edad:"+this.edad+"\n"
                + "Estado:"+this.estado+"\n"
                + "Nacimiento:"+this.fechaNacimiento+"\n"
                + "Raza:"+this.raza+"\n"
                + "Pulgas:"+this.pulgas;
    }
    
}
