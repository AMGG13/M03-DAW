/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author alumne
 */
public class AlumnosDAO implements IAlumnos {
    private ArrayList<Alumno> clase;

    public AlumnosDAO() {
        this.clase = new ArrayList<>();
    }

    
    @Override
    public boolean anyadirAlumno(Alumno anyadir) {
        boolean added = false;
        if(!clase.contains(anyadir)){
            added = true;
            clase.add(anyadir);
        }
        return added;
    }

    @Override
    public boolean borrarAlumno(Alumno eliminar) {
        if(clase.contains(eliminar)){
            return clase.remove(eliminar);
        }
        return false;
    }

    @Override
    public ArrayList<Alumno> listar() {
        return clase;
    }

    @Override
    public String pasarLista() {
        String lista = "";
        for (Alumno alumno : clase) {
            lista=lista+alumno.toString()+"\n";
        }
        return lista;
    }
    
    public void reset(){
        
    }
    
}
