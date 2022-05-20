/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pulsayreset;

import Controlador.MiControlador;
import Modelo.EnteroDAO;
import Vista.Ventana_Pulsacion;

/**
 *
 * @author alumne
 */
public class Pulsayreset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MiControlador controller = new MiControlador(new Ventana_Pulsacion(), new EnteroDAO(0));
        //Ventana_Pulsacion ventana = new Ventana_Pulsacion();
    }
    
}
