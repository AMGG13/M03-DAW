/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author alumne
 */
public class Alumno extends Persona{
    private int n_expediente;
    private int curso;
    private String ciclo;

    public Alumno(int n_expediente, int curso, String ciclo, String nombre, String DNI, String direccion, String telefono) {
        super(nombre, DNI, direccion, telefono);
        this.n_expediente = n_expediente;
        this.curso = curso;
        this.ciclo = ciclo;
    }

    public int getN_expediente() {
        return n_expediente;
    }

    public void setN_expediente(int n_expediente) {
        this.n_expediente = n_expediente;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    @Override
    public void saludarPorLaManyana() {
        super.saludarPorLaManyana();
        System.out.println("Zzzzzzz...");
    }

    @Override
    public String toString() {
        return "Alumno" + "n_expediente:" + n_expediente + ", curso:" + curso + ", ciclo:" + ciclo +", nombre: "+this.nombre;
    }
    
    
    
    
    
}
