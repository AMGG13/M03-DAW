/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Alumno;
import Modelo.AlumnosDAO;
import Vista.App;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author alumne
 */
public class Controller implements ActionListener{
    private App vista;
    private AlumnosDAO modelo;

    public Controller(App vista, AlumnosDAO modelo) {
        this.vista = vista;
        this.modelo = modelo;
        //Iniciar listener.
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
