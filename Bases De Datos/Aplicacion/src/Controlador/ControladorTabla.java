/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.DAOCuenta;
import Vista.PanelTabla;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author alumne
 */
public class ControladorTabla implements ActionListener{
    PanelTabla vista;
    DAOCuenta modelo;

    public ControladorTabla(PanelTabla vista, DAOCuenta modelo) {
        this.vista = vista;
        this.modelo = modelo;
        listarCuentas();
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void listarCuentas() {
        vista.addData();
    }
    
}
