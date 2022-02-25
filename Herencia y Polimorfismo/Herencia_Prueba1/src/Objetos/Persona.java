/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author alumne
 */
//PROTECTED para que los hijos puedan acceder a los atributos de su madre
public class Persona {
    protected String nombre;
    protected String DNI;
    protected String direccion;
    protected String telefono;

    @Override
    public String toString() {
        return " Persona{" +"nombre=" + nombre + ", DNI=" + DNI + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }

    public Persona(String nombre, String DNI, String direccion, String telefono) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void saludarPorLaManyana(){
        System.out.println("Hola buenos dias.");
    }
    
}
