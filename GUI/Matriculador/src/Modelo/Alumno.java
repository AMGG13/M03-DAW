/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Objects;

/**
 *
 * @author alumne
 */
public class Alumno {
    private String nombre;
    private String apellidos;
    private Ciclos ciclo;
    private Integer edad;

    public Alumno(String nombre, String apellidos, Ciclos ciclo, Integer edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        setCiclo(ciclo);
        setEdad(edad);
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Ciclos getCiclo() {
        return ciclo;
    }

    public void setCiclo(Ciclos ciclo) {
        this.ciclo = ciclo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "nombre:" + nombre + ", apellidos:" + apellidos + ", ciclo:" + ciclo + ", edad:" + edad;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.apellidos, other.apellidos);
    }
    
    
    
}
