/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author alumne
 */
public interface IAlumnos {
    public boolean anyadirAlumno(Alumno anyadir);
    public boolean borrarAlumno(Alumno eliminar);
    public ArrayList<Alumno> listar();
    public String pasarLista();
}
