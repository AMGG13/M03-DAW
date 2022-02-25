/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia_prueba1;

import Objetos.Alumno;
import Objetos.Persona;
import Objetos.Profesor;

/**
 *
 * @author alumne
 */
public class Herencia_Prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona("Enrique", "12345678B", "Avenida ok", "678332244");
        Alumno a1 = new Alumno(1234,1, "Informatica", "Alvin", "1234566B", "Ronda Sant Ramon 119", "666349854");
        Profesor prof1 = new Profesor(12, "Informatica", "M03", "Albert", "1234567B", "AvenidaP", "654223312");
        System.out.println(prof1.getNombre());
        System.out.println(prof1.getDepartamento());
        //a1.nombre="Alvin";
        //a1.curso=1;
        p1.saludarPorLaManyana();
        a1.saludarPorLaManyana();
        prof1.saludarPorLaManyana();
        System.out.println(a1.toString());
        System.out.println(p1.toString());
        System.out.println(prof1.toString());
    }
    
}
