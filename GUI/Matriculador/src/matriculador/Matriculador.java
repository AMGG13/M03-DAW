/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriculador;

import Controlador.Controller;
import Modelo.AlumnosDAO;
import Vista.App;

/**
 *
 * @author alumne
 */
public class Matriculador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controller control = new Controller(new App(), new AlumnosDAO());
    }
    
}
